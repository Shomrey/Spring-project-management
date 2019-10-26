package com.hackdesk.jsonmapper;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hackdesk.model.Project;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class ProjectJson {
    private String projectName;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date projectDeadline;

    public ProjectJson(){
        super();
    }
    public ProjectJson(String projectName, Date projectDeadline){
        this.projectName = projectName;
        this.projectDeadline = projectDeadline;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getProjectDeadline() {
        return projectDeadline;
    }

    @Override
    public String toString() {
        return "ProjectJson{" +
                "projectName='" + projectName + '\'' +
                ", projectDeadline=" + projectDeadline +
                '}';
    }

    public void setProjectDeadline(Date projectDeadline) {
        this.projectDeadline = projectDeadline;
    }
}
