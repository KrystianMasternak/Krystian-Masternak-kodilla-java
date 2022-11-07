package com.kodilla.spring.portfolio;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        //When
        List<String> taskToDoList = board.getToDoList().getTasksList();
        taskToDoList.add("The task has been accepted.");

        List<String> taskInProgetssList = board.getInProgressList().getTasksList();
        taskInProgetssList.add("The task in progress...");

        List<String> taskDoneList = board.getDoneList().getTasksList();
        taskDoneList.add("The task finished.");

        //Then
        assertEquals("The task has been accepted.", taskToDoList.get(0));
        assertEquals("The task in progress...", taskInProgetssList.get(0));
        assertEquals("The task finished.", taskDoneList.get(0));



    }
}
