package com.flynuat.DemoProject.dao;

import com.flynuat.DemoProject.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentDAOImpl implements StudentDAO{
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    public void save(Student theStudent){
        entityManager.persist(theStudent);  //Saving the object
    }

}
