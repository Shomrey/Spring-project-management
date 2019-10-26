package com.hackdesk.model;

import jdk.jfr.Timestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
@Entity
@Table(name = "project")
public class Project {
    @Id
    @GeneratedValue
    @Column(name = "project_id")
    Integer projectID;
    @Column(name = "project_name")
    String projectName;
    @Column(name = "project_deadline_date")
    Timestamp projectDeadline;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name ="project_task", joinColumns = @JoinColumn(name = "task_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
    private Collection<Task> tasks = new ArrayList<>();
    public Project(String projectName, Timestamp projectDeadline){
        this.projectName = projectName;
        this.projectDeadline = projectDeadline;
    }
}
