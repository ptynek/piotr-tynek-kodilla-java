package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testUpdate(){
        Student student1 = new Student("Piotrek");
        Student student2 = new Student("Kamil");
        Mentor mentor1 = new Mentor("Paweł");
        Mentor mentor2 = new Mentor("Jan");
        student1.registerObserverx(mentor2);
        student2.registerObserverx(mentor1);

        student1.addTask("Task nr. 1");
        student2.addTask("Task nr. 2");
        student1.addTask("Task nr. 3");
        student2.addTask("Task nr. 4");

        assertEquals(2, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());

    }

}