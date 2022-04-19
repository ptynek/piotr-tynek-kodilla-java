package com.kodilla.stream.portfolio;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTestSuite {

    @Test
    void testAddTaskList() {
        Board project = prepareTestData();

        assertEquals(3, project.getTaskLists().size());
    }

    private Board prepareTestData() {
        User user1 = new User("developer1", "John Smith");
        User user2 = new User("projectmanager1", "Nina White");
        User user3 = new User("developer2", "Emilia Stephanson");
        User user4 = new User("developer3", "Konrad Bridge");

        Task task1 = new Task("Microservice for taking temperature",
                "Write and test the microservice taking\n" +
                        "the temperaure from external service",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(30));
        Task task2 = new Task("HQLs for analysis",
                "Prepare some HQL queries for analysis",
                user1,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().minusDays(5));
        Task task3 = new Task("Temperatures entity",
                "Prepare entity for temperatures",
                user3,
                user2,
                LocalDate.now().minusDays(20),
                LocalDate.now().plusDays(15));
        Task task4 = new Task("Own logger",
                "Refactor company logger to meet our needs",
                user3,
                user2,
                LocalDate.now().minusDays(10),
                LocalDate.now().plusDays(25));
        Task task5 = new Task("Optimize searching",
                "Archive data searching has to be optimized",
                user4,
                user2,
                LocalDate.now(),
                LocalDate.now().plusDays(5));
        Task task6 = new Task("Use Streams",
                "use Streams rather than for-loops in predictions",
                user4,
                user2,
                LocalDate.now().minusDays(15),
                LocalDate.now().minusDays(2));

        TaskList taskListToDo = new TaskList("To do");
        taskListToDo.addTask(task1);
        taskListToDo.addTask(task3);
        TaskList taskListInProgress = new TaskList("In progress");
        taskListInProgress.addTask(task5);
        taskListInProgress.addTask(task4);
        taskListInProgress.addTask(task2);
        TaskList taskListDone = new TaskList("Done");
        taskListDone.addTask(task6);

        Board project = new Board("Project Weather Prediction");
        project.addTaskList(taskListToDo);
        project.addTaskList(taskListInProgress);
        project.addTaskList(taskListDone);
        return project;
    }

    @Test
    void testAddTaskListFindUsersTask() {
        Board project = prepareTestData();

        User user = new User("developer1", "John Smith");
        List<Task> tasks = project.getTaskLists().stream()
                .flatMap(taskList -> taskList.getTasks().stream())
                .filter(task -> task.getAssignedUser().equals(user))
                .collect(Collectors.toList());

        assertEquals(2, tasks.size());
        assertEquals(user, tasks.get(0).getAssignedUser());
        assertEquals(user, tasks.get(1).getAssignedUser());
    }

    @Test
    void testAddTaskListFindOutdatedTasks() {
        Board project = prepareTestData();

        List<TaskList> undoneTasks = new ArrayList<>();
        undoneTasks.add(new TaskList("To do"));
        undoneTasks.add(new TaskList("In progress"));
        List<Task> tasks = project.getTaskLists().stream()
                .filter(undoneTasks::contains)
                .flatMap(taskList -> taskList.getTasks().stream())
                .filter(task -> task.getDeadline().isBefore(LocalDate.now()))
                .collect(Collectors.toList());

        assertEquals(1, tasks.size());
        assertEquals("HQLs for analysis", tasks.get(0).getTitle());
    }

    @Test
    void testAddTaskListFindLongTasks() {
        Board project = prepareTestData();

        List<TaskList> inProgressTask = new ArrayList<>();
        inProgressTask.add(new TaskList("In progress"));
        long longTasks = project.getTaskLists().stream()
                .filter(inProgressTask::contains)
                .flatMap(taskList -> taskList.getTasks().stream())
                .map(Task::getCreated)
                .filter(localDate -> localDate.compareTo(LocalDate.now().minusDays(10)) <= 0)
                .count();

        assertEquals(2, longTasks);
    }

    @Test
    void testAddTaskListAverageWorkingOnTask() {
        Board project = prepareTestData();

        double avgDaysOfTasks = project.getTaskLists().stream()
                .filter(taskList -> taskList.getName().equals("In progress"))
                .flatMap(taskList -> taskList.getTasks().stream())
                .filter(task -> task.getCreated().isBefore(LocalDate.now().plusDays(1)))
                .map(task -> LocalDate.now().getDayOfYear() - task.getCreated().getDayOfYear())
                .mapToDouble(task -> task)
                .average().getAsDouble();

        Assertions.assertEquals(10.0, avgDaysOfTasks);
    }
}
