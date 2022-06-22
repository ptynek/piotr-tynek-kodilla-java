package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "List name";
    private static final String DESCRIPTION = "Description for task 17.2";

    @Test
    void testFindByListName(){
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        taskListDao.save(taskList);
        String listName = taskList.getListName();

        int id = taskList.getId();
        assertEquals("List name", listName);

        taskListDao.deleteById(id);

    }
}
