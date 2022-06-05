package com.kodilla.portfolio;

import com.kodilla.spring.portfolio.Board;
import com.kodilla.spring.portfolio.BoardConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testAddTask(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.addToDo("Clean room");
        board.addInProgress("Washing car");
        board.addDoneList("Shopping");

        board.showLists();
    }
}
