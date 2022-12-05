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

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("Task to do", "Description task list");

        //When
        taskListDao.save(taskList);

        //When
        String listName = taskList.getListName();
        List<TaskList> readListName = taskListDao.findByListName(listName);

        //Then
        assertEquals("Task to do", readListName.get(0));

        //CleanUp
        taskListDao.removeByListName(listName);
    }
}
