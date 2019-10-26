package com.hackdesk.model;

import javax.persistence.*;

@Entity
@Table(name = "task")
public class Task {
    @Id @GeneratedValue
    @Column(name = "task_id")
    Integer taskID;
    @Column(name = "task_name")
    String taskName;
    @Column(name = "task_description")
    String description;
    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    Project project;
    public Task(String taskName, String description){
        this.taskName = taskName;
        this.description = description;
    }
}
