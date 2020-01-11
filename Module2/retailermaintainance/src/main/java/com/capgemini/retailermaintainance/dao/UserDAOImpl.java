package com.capgemini.retailermaintainance.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.capgemini.retailermaintainance.dto.UserInfo;
import com.capgemini.retailermaintainance.exception.UserException;

@Repository
public class UserDAOImpl implements UserDAO {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;

	@Override
	public UserInfo auth(String email, String password) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from UserInfo where email = :email";
		TypedQuery<UserInfo> query = entityManager.createQuery(jpql, UserInfo.class);
		query.setParameter("email", email);
		try {
			UserInfo bean = query.getSingleResult();
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if (encoder.matches(password, bean.getPassword())) {
				return bean;
			} else {
				throw new UserException("Password invalid");
			}
		} catch (Exception e) {
			throw new UserException("Email invalid");
		}
	}

	@Override
	public boolean register(UserInfo bean) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new UserException("Email already exists");
		}
	}
}
