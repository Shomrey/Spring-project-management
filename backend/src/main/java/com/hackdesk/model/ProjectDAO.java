package com.hackdesk.model;

import com.hackdesk.DbConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class ProjectDAO {
    private static final String SQL_INSERT = "INSERT VALUES ";
    private static final String SQL_INTO = " INTO";
    private static final String TABLE_NAME = " project";
    @Autowired
    private SessionFactory sessionFactory;
    Project getProject(String projectName){
        return null;
    }
    public boolean addProject(Project project){

        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(project);
        transaction.commit();
        return true;
    }
    Project[] getAllProjects(){
        return null;
    }

}
