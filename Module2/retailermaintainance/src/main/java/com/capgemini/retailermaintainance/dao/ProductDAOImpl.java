package com.capgemini.retailermaintainance.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailermaintainance.dto.ProductInfo;
import com.capgemini.retailermaintainance.dto.UserInfo;
@Repository
public class ProductDAOImpl implements ProductDAO {

	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public List<ProductInfo> searchproduct(int product_id) {
		String jpql = "from ProductInfo where productid =:product_id";
		EntityManager manager = entityManagerFactory.createEntityManager();
		TypedQuery<ProductInfo> query = manager.createQuery(jpql, ProductInfo.class);
		query.setParameter("productid", product_id);
		try {
			return (List<ProductInfo>) query.getSingleResult();
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean updatePassword(int id, String password) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		UserInfo bean = entityManager.find(UserInfo.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	

}
