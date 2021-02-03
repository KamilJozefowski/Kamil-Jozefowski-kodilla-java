package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class TaskQueueTest {
        @Test
        public void testUpdate() {
            //Given
            TaskQueue adamTaskQueue = new WorkQueueStudentAdam();
            TaskQueue tomekTaskQueue = new WorkQueueStudentTomek();
            TaskQueue szymonTaskQueue = new WorkQueueStudentSzymon();
            Mentor pawelKowalski = new Mentor("Pawał Kowalski");
            Mentor beataTkocz = new Mentor("Beata Tkocz");
            adamTaskQueue.registerObserver(pawelKowalski);
            tomekTaskQueue.registerObserver(beataTkocz);
            szymonTaskQueue.registerObserver(beataTkocz);
            szymonTaskQueue.registerObserver(pawelKowalski);
            //When
            adamTaskQueue.offerTask("task 32.2");
            adamTaskQueue.offerTask("task 7.2");
            tomekTaskQueue.offerTask("task 1.2");
            tomekTaskQueue.offerTask("task 6.6");
            szymonTaskQueue.offerTask("task 7.8");
            szymonTaskQueue.offerTask("task 1.0");
            //Then
            assertEquals(4, beataTkocz.getUpdateCount());
            assertEquals(4, pawelKowalski.getUpdateCount());

        }
    }