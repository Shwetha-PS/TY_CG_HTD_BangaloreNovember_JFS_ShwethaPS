package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class ReAttaching {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie record = entityManager.find(Movie.class, 10);
			System.out.println(entityManager.contains(record));
			entityManager.detach(record);
			System.out.println(entityManager.contains(record));
			
			//to again re-attach the data we have a method called merge()
			Movie reattachMovie = entityManager.merge(record);
			reattachMovie.setM_name("s/o.satyamurthy");
			System.out.println("record Updated");
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}
}
