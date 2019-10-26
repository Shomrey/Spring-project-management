package com.hackdesk.model;

import com.fasterxml.jackson.annotation.JsonFormat;

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
    public Integer projectID;
    @Column(name = "project_name")
    public String projectName;
    @Column(name = "project_deadline_date")
    @JsonFormat(pattern="dd/MM/yyyy")
    public Date projectDeadline;
    @OneToMany(mappedBy = "project", cascade=CascadeType.ALL)
    private Collection<Task> tasks = new ArrayList<>();
    public Project(String projectName, Date projectDeadline){
        this.projectName = projectName;
        this.projectDeadline = projectDeadline;
    }
}
