package com.capgemini.flightonline.dao;

import java.util.List;

import com.capgemini.flightonline.bean.FlightBean;

public interface FlightDAO {

	public boolean addFlight(FlightBean flightBean);

	public boolean deleteFlight(int index);

	public boolean modifyFlight(FlightBean flightBean);

	public List<FlightBean> getAllFlight();

}
