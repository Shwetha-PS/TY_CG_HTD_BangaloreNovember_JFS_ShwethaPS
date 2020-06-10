package com.capgemini.flightonline.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class FlightBean {
	@Id
	@Column
	private int flightNumber;
	@Column
	private String carrierName;
	@Column
	private String flightModel;
	@Column
	private int seatCapacity;
	
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public String getFlightModel() {
		return flightModel;
	}
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	@Override
	public String toString() {
		return "FlightBean [flightNumber=" + flightNumber + ", carrierName=" + carrierName + ", flightModel="
				+ flightModel + ", seatCapacity=" + seatCapacity + "]";
	}


}
