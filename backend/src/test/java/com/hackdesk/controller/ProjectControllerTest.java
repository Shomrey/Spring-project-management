package com.hackdesk.controller;


import com.hackdesk.model.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebMvcTest(ProjectController.class)
public class ProjectControllerTest {

    @Autowired
    private MockMvc mockMvc;

    //Project testProject =  new Project();

    @Test
    public void ProjectShouldBeAdded() throws Exception{

        this.mockMvc.perform(post("/backend/projects")
                .param("projectName", "Testowy projekt")
                .param("projectDate","01/01/1999")).andExpect(status().isOk() );
    }



}
