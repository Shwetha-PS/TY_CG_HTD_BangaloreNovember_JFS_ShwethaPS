package com.capgemini.flightonline.bean;

import java.util.List;

public class FlightResponse {

	private int statusCode;
	private String messesge;
	private String discription;
	private List<FlightBean> beans;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessesge() {
		return messesge;
	}

	public void setMessesge(String messesge) {
		this.messesge = messesge;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public List<FlightBean> getBeans() {
		return beans;
	}

	public void setBeans(List<FlightBean> beans) {
		this.beans = beans;
	}

	@Override
	public String toString() {
		return "FlightResponse [statusCode=" + statusCode + ", messesge=" + messesge + ", discription=" + discription
				+ ", beans=" + beans + "]";
	}


}
