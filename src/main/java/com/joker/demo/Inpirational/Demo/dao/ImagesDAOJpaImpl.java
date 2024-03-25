package com.joker.demo.Inpirational.Demo.dao;

import com.joker.demo.Inpirational.Demo.entity.Image;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class ImagesDAOJpaImpl implements ImageDAO{

    // define field for entity manage
    private final EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public  ImagesDAOJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public ArrayList<Image> findAll() {

        // create a query
        TypedQuery<Image> theQuery = entityManager.createQuery("from Image",Image.class);

        // execute query and get result list

        // return the result
        return (ArrayList<Image>) theQuery.getResultList();
    }
}
