package com.capgemini.flightonline.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.flightonline.bean.FlightBean;
import com.capgemini.flightonline.exception.FlightException;

@Repository
public class FlightDAOImpl implements FlightDAO {
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public boolean addFlight(FlightBean flightBean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(flightBean);
			transaction.commit();
			return true;
		} catch (Exception e) {

		}
		throw new FlightException("This ID already exists...cannot add");
	}

	@Override
	public boolean deleteFlight(int index) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		FlightBean flightBean = manager.find(FlightBean.class, index);
		if (flightBean != null) {
			manager.remove(flightBean);
			transaction.commit();
			return true;

		}
		throw new FlightException("Invalid user ID...cannot delete");
	}

	@Override
	public boolean modifyFlight(FlightBean flightBean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			FlightBean flightUpdateBean = manager.find(FlightBean.class, flightBean.getFlightNumber());
			flightUpdateBean.setFlightModel(flightBean.getFlightModel());
			transaction.commit();
			return true;
		} catch (Exception e) {

		}
		 throw new FlightException("Invalid user ID...cannot modify");

	}

	@Override
	public List<FlightBean> getAllFlight() {
		String jpql = "from FlightBean";
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery(jpql);
		try {
			List<FlightBean> list = query.getResultList();
			if (list != null) {
				return list;
			}
		} catch (Exception e) {

		}
		throw new FlightException("Currently no flights are available");
	}

}
