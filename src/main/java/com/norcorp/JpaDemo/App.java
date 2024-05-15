package com.norcorp.JpaDemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



public class App 
{
    public static void main( String[] args )
    {
    	
    	Alien a = new Alien();
    	a.setAid(4);
    	a.setAname("youssef");
    	a.setAtech("React");
       
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	//Alien a = em.find(Alien.class, 4); //NB: To retrieve data from DB
    	
    	em.getTransaction().begin();
    	
    	em.persist(a);
    	
    	em.getTransaction().commit();
    	
    	System.out.println(a);
    	
    }
}
