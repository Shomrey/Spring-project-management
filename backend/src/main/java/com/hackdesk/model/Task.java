package com.hackdesk.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Task {
    @Id @GeneratedValue
    Integer taskID;
    String taskName;
    Integer projectID;
    String description;
    @ManyToOne
    @JoinColumn(name = "task_id")
    Project project;
    public Task(String taskName, Integer projectID, String description){
        this.taskName = taskName;
        this.projectID =  projectID;
        this.description = description;
    }
}
