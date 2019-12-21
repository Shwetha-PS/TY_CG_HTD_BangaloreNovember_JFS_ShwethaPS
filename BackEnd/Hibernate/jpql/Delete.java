package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		String jpql = "Delete from Movie where m_id=10";
		Query query = entityManager.createQuery(jpql);
		transaction.begin();
		int i= query.executeUpdate();
		transaction.commit();
		if(i>0) {
			System.out.println("deleted Successfully");
		}
		entityManager.close();	
	}

}
