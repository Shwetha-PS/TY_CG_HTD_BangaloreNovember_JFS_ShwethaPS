package com.capgemini.jpawithhibernate.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.Employee;

public class TestManyToMany {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEid(17);
		emp.setEname("Rahul");
		emp.setEmail("Rahul@appp");
		emp.setPassword("Rahul");

		Employee emp1 = new Employee();
		emp1.setEid(27);
		emp1.setEname("Pahul");
		emp1.setEmail("Pahul@appp");
		emp1.setPassword("Pahul");

		ArrayList<Employee> alist = new ArrayList<Employee>();
		alist.add(emp);
		alist.add(emp1);

		TrainingInfo info = new TrainingInfo();
		info.setTid(99);
		info.setTname("Ram");
		info.setElist(alist);

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			entityManager = entityManagerFactory.createEntityManager();
			transaction =entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(info);
			System.out.println("Record saved");
			transaction.commit();

		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();

	}
}





