package com.hackdesk.model;

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
    Date projectDeadline;

    @OneToMany(mappedBy ="",cascade=CascadeType.ALL)
    private Collection<Task> tasks = new ArrayList<>();
    public Project(String projectName, Date projectDeadline){
        this.projectName = projectName;
        this.projectDeadline = projectDeadline;
    }
}
