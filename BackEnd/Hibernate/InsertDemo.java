package com.capgemini.jpawithhibernate;
import javax.persistence.*;
import com.capgemini.jpawithhibernate.dto.Movie;

public class InsertDemo {

	public static void main(String[] args) {

		Movie movies = new Movie();
		movies.setM_id(105);
		movies.setM_name("ABCD");
		movies.setM_rating("Good");
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movies);
			System.out.println("Record saved");
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		transaction.commit();
		entityManager.close();
	}

}
