package com.hackdesk.controller;


import com.hackdesk.jsonmapper.ProjectJson;
import com.hackdesk.model.Project;

import com.hackdesk.model.ProjectDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    ProjectDAO projectDAO;

    SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");

    @PostMapping("/backend/projects")
    Project addProject (@RequestBody ProjectJson projectJson) throws  Exception{
        Project project = new Project(projectJson.getProjectName(), projectJson.getProjectDeadline());
       if(!projectDAO.addProject(project)   )
          return null;
        return project;

        //return new Project("testowy2",dateFormat.parse("03/05/1999"));
    }

    @GetMapping("/backend/projects")
    List<Project> getAllProjects() throws Exception{

        List<Project> projects = new ArrayList<>();
      //  projects.add(new Project("testowy1",dateFormat.parse("01/01/1999")));

        return projects;
    }
}
