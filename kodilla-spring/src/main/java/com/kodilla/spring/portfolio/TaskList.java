package com.kodilla.spring.portfolio;

import java.util.ArrayList;

public class TaskList {
    ArrayList<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public ArrayList<String> getTasks() {
        return tasks;
    }

    public void addTask(String taskName) {
        tasks.add(taskName);
    }
}
