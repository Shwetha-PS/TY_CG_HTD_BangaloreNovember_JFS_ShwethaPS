package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;

		entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
		entityManager = entityManagerFactory.createEntityManager();
		String jpql = "Select m_name from Movie";
		Query query = entityManager.createQuery(jpql);
		List<String> record = query.getResultList();
		for (String movie : record) {
			System.out.println(movie);
			
		}
  
		//String jpql = "from Movie";
		//List<Movie> record = query.getResultList();
		//		for (Movie movie : record) {
		//			System.out.println("movie id is " +movie.getM_id());
		//			System.out.println("movie name is " +movie.getM_name());
		//			System.out.println("movie rating is " +movie.getM_rating());
		//			
	}
}


