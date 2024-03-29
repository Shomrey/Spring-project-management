package com.hackdesk.controller;


import com.hackdesk.jsonmapper.ProjectJson;
import com.hackdesk.model.Project;

import com.hackdesk.model.ProjectDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    ProjectDAO projectDAO;

    SimpleDateFormat dateFormat= new SimpleDateFormat("dd/MM/yyyy");

    @PostMapping("/backend/projects")
    Project addProject (@RequestBody Project project) throws  Exception{
       // Project project = new Project(projectJson.getProjectName(), projectJson.getProjectDeadline());
       if(!projectDAO.addProject(project)   )
          return null;
        return project;

        //return new Project("testowy2",dateFormat.parse("03/05/1999"));
    }
    @GetMapping("/backend/projects")
    List<Project> getAllProjects() throws Exception{
        return projectDAO.getAllProjects();
    }
    @GetMapping("/backend/projects/criteria")
    Project getProjectByID(@RequestParam(name = "id")Integer id) throws Exception{
        return projectDAO.getProjectByID(id);
    }
}
