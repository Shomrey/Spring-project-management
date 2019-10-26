package com.hackdesk.controller;


import com.hackdesk.model.Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    @PostMapping("/backend/projects")
    Project addProject(@RequestBody Project project){


        return null;
    }

    @GetMapping("/backend/projects")
    List<Project> getAllProjects(){

        return null;
    }
}
