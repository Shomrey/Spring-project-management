package com.hackdesk.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Project {
    @Id
    @GeneratedValue
    Integer projectID;
    String projectName;
    Date projectDeadline;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name ="project_task", joinColumns = @JoinColumn(name = "task_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
    private Collection<Task> tasks = new ArrayList<>();
    public Project(String projectName, Date projectDeadline){
        this.projectName = projectName;
        this.projectDeadline = projectDeadline;
    }
}
