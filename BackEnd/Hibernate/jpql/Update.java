package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {

	public static void main(String[] args) {
		//	EntityManagerFactory entityManagerFactory = null;
		//	EntityManager entityManager = null;
		//	EntityTransaction transaction = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		String jpql = "Update Movie set m_name = 'arjunreddy' where m_id= 10";
		Query query = entityManager.createQuery(jpql);
		transaction.begin();
		int record = query.executeUpdate();
		transaction.commit();
		if(record>0) {
			System.out.println("Updated successfully");
		}
		entityManager.close();

	}

}
