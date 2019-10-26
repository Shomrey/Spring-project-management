package com.hackdesk.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

public class Project {
    @Id
    @GeneratedValue
    Integer projectID;
    String projectName;
    Date projectDeadline;


    public Project(String projectName, Date projectDeadline){
        this.projectName = projectName;
        this.projectDeadline = projectDeadline;
    }
}
