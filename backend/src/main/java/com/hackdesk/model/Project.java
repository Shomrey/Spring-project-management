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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    public Integer projectID;
    @Column(name = "project_name")
    public String projectName;
    @Column(name = "project_deadline_date")
    public Date projectDeadline;
    @OneToMany(mappedBy = "project", cascade=CascadeType.ALL)
    private Collection<Task> tasks = new ArrayList<>();
    public Project(String projectName, Date projectDeadline){
        this.projectName = projectName;
        this.projectDeadline = projectDeadline;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectID=" + projectID +
                ", projectName='" + projectName + '\'' +
                ", projectDeadline=" + projectDeadline +
                ", tasks=" + tasks +
                '}';
    }
}
