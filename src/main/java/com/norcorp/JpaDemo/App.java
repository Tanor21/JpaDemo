package com.norcorp.JpaDemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



public class App 
{
    public static void main( String[] args )
    {
       
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
    	Alien a = em.find(Alien.class, 4);
    	
    	System.out.println(a);
    	
    }
}
