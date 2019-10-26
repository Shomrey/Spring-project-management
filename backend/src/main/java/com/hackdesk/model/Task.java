package com.hackdesk.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Task {
    @Id @GeneratedValue
    Integer taskID;
    String taskName;
    public Task(Integer taskID, String taskName){
        this.taskID = taskID;
        this.taskName = taskName;
    }
}
