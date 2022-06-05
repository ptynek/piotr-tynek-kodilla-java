package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.config.Task;


@Configuration
public class BoardConfig {


    @Autowired
    @Qualifier("toDo")
    TaskList taskList;

    @Autowired
    @Qualifier("inProgress")
    TaskList taskList1;
    @Autowired
    @Qualifier("done")
    TaskList taskList2;

    @Bean(name="toDo")
    @Scope("prototype")
    public TaskList getToDo(){
        return new TaskList();
    }
    @Bean(name="inProgress")
    @Scope("prototype")
    public TaskList getInProgress(){
        return new TaskList();
    }
    @Bean(name="done")
    @Scope("prototype")
    public TaskList getDone(){
        return new TaskList();
    }

    @Bean
    Board getBoard(){
        return new Board(taskList, taskList1, taskList2);
    }

}
