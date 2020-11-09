package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.dao.TaskListDao;
import com.kodilla.hibernate.task.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Learn Hibernate";
    private static final String LISTNAME = "Learn Hibernate";

    @Test
    void testFindByListName() {
        //given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //when
        taskListDao.save(taskList);
        List<TaskList> readListName = taskListDao.findByListName(LISTNAME);

        //then
        assertEquals(1,readListName.size());

        //cleanUp
        int id = readListName.get(0).getId();
        taskListDao.deleteById(id);


    }
}
