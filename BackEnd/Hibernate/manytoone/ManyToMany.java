package com.capgemini.jpawithhibernate.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.Employee;

public class ManyToMany {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEid(100);
		emp.setEname("Seetha");
		emp.setEmail("sita@appa");
		emp.setPassword("sita");
		
		EmployeeExperience exp = new EmployeeExperience();
		exp.setExpid(2);
		exp.setCname("TCS");
		exp.setNoOfyears(2);
		exp.setEmp(emp);
		
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			entityManager = entityManagerFactory.createEntityManager();
			transaction =entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(exp);
			System.out.println("Record saved");
			transaction.commit();

		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();

	}
}

