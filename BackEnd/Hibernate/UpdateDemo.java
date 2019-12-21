package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class UpdateDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		try {
		entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
		entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Movie record = entityManager.find(Movie.class, 101);
		record.setM_name("Dil to pagal hai");
		System.out.println("record Updated");
		transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
	}
}
