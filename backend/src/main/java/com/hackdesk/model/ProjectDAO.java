package com.hackdesk.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Project[] getAllProjects(){
        StringBuilder prepareQuery = new StringBuilder();
        prepareQuery.append("SELECT * FROM PROJECT");
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Query query = sessionFactory.getCurrentSession().createQuery(prepareQuery.toString());
        return (Project[]) query.list();
    }

}
