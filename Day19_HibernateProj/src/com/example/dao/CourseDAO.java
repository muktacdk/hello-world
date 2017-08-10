package com.example.dao;

import com.example.entity.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class CourseDAO {
    public void save(EntityManagerFactory managerFactory){

        Course course = new Course("abc", 3, 2000);

        EntityManager entityManager = managerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(course);
        transaction.commit();

        entityManager.close();
    }

    public void read(EntityManagerFactory managerFactory){
        EntityManager entityManager = managerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        Course course = entityManager.find(Course.class,3);
        transaction.commit();

        System.out.println(course.toString());
        entityManager.close();

    }

    public void update(EntityManagerFactory managerFactory){
        EntityManager entityManager = managerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        Course course = entityManager.find(Course.class,1);
        course.setTitle("Dojo");
        transaction.commit();

        System.out.println(course.toString());
        entityManager.close();

    }

    public void delete(EntityManagerFactory managerFactory){
        EntityManager entityManager = managerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        Course course = entityManager.find(Course.class,2);
        entityManager.remove(course);
        transaction.commit();

        System.out.println(course.toString());
        entityManager.close();

    }

//    public void update(EntityManagerFactory managerFactory){
//        Course course = new Course("Java", 3, 2000);
//
//        EntityManager entityManager = managerFactory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//
//        transaction.begin();
//        entityManager.persist(course);
//        transaction.commit();
//
//        entityManager.close();
//        managerFactory.close();
//    }
}
