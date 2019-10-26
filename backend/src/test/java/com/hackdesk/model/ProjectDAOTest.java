package com.hackdesk.model;

import com.hackdesk.controller.ProjectController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@WebMvcTest(ProjectDAO.class)
class ProjectDAOTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getProject() {
    }

    @Test
    void addProject() {
        ProjectDAO pdao = new ProjectDAO();
        try {
            pdao.addProject(new Project("Project1", new SimpleDateFormat("DD/MM/YYYY").parse("20/12/2019")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    void getAllProjects() {

    }
}