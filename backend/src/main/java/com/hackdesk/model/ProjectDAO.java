package com.hackdesk.model;

import com.hackdesk.DbConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProjectDAO {
    private static final String SQL_INSERT = "INSERT VALUES ";
    private static final String SQL_INTO = " INTO";
    private static final String TABLE_NAME = " project";
    @Autowired
    private DbConfiguration dbConfiguration;

    Project getProject(String projectName){
        return null;
    }
   public boolean addProject(Project project){

        Session session = dbConfiguration.sessionFactory().getConfiguration().buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(project);
        transaction.commit();
        return true;
    }
    Project[] getAllProjects(){
        return null;
    }

}
