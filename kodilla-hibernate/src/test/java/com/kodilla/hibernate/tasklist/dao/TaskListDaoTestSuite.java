package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    private static final String LISTNAME = "Task to do";
    private static final String DESCRIPTION = "Description task list";
    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //When
        String listName = taskList.getListName();
        List<TaskList> readListName = taskListDao.findByListName(listName);
        String actualNameList = taskList.getListName();

        //Then
        assertEquals("Task to do", actualNameList);

        //CleanUp
        taskListDao.delete(taskList);
    }
}
