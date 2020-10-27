package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Collectors;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.addTask("task1");
        board.doneList.addTask("task2");
        board.inProgressList.addTask("task3");


        //Then
        Assert.assertEquals("task1", String.join("", board.toDoList.getTasks()));
        Assert.assertEquals("task2", String.join("", board.doneList.getTasks()));
        Assert.assertEquals("task3", String.join("", board.inProgressList.getTasks()));
    }
}