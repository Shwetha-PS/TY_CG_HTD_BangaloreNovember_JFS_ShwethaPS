package com.capgemini.flightonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.flightonline.bean.FlightBean;
import com.capgemini.flightonline.dao.FlightDAO;

@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
	private FlightDAO flightDAO;

	@Override
	public boolean addFlight(FlightBean flightBean) {
		return flightDAO.addFlight(flightBean);
	}

	@Override
	public boolean deleteFlight(int index) {
		return flightDAO.deleteFlight(index);
	}

	@Override
	public boolean modifyFlight(FlightBean flightBean) {
		return flightDAO.modifyFlight(flightBean);
	}

	@Override
	public List<FlightBean> getAllFlight() {
		return flightDAO.getAllFlight();
	}

}
