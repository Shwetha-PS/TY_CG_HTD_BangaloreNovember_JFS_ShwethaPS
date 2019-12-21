package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToOne {

	public static void main(String[] args) {
//		Employee emp = new Employee();
//		emp.setEid(70);
//		emp.setEname("Ramu");
//		emp.setEmail("Ramu@ave");
//		emp.setPassword("Ramu");
//	
//		EmployeeOthersInfo info = new EmployeeOthersInfo();
//		info.setId(140);
//		info.setFather_name("Ramesh");
//		info.setMother_name("anu");
//		info.setPassord("Ammu");
//		info.setEmp(emp);
//		
//		
//		EntityManagerFactory entityManagerFactory = null;
//		EntityManager entityManager = null;
//		EntityTransaction transaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction transaction =entityManager.getTransaction();
			transaction.begin();
			//entityManager.persist(info);
			Employee em= entityManager.find(Employee.class, 10);
			System.out.println(em.getOther().getPassord());
			
			System.out.println("Record saved");
			transaction.commit();

		}catch(Exception e) {
			e.printStackTrace();
			//transaction.rollback();
		}

	}
}
