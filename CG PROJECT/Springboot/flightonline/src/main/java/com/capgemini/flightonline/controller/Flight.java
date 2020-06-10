package com.capgemini.flightonline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.flightonline.bean.FlightBean;
import com.capgemini.flightonline.bean.FlightResponse;
import com.capgemini.flightonline.dao.FlightDAO;

@CrossOrigin(origins = "*", allowedHeaders = "*" , allowCredentials = "true")
@RestController
public class Flight {
	
	@Autowired
	private FlightDAO flightDAO;
	
	@PostMapping(path="/add-flight",produces=MediaType.APPLICATION_JSON_VALUE,
			consumes= MediaType.APPLICATION_JSON_VALUE)
	public FlightResponse  addFlight(@RequestBody FlightBean flightBean ) {
		FlightResponse response= new FlightResponse();
		if(flightDAO.addFlight(flightBean)) {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription("Successfully Added flight");
		}else {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription("flight already exists with this ID");	
		}
		return response;
	}
	
	
	@DeleteMapping(path="/delete-flight/{flightNumber}",produces=MediaType.APPLICATION_JSON_VALUE)
	public FlightResponse deleteFlight(@PathVariable("flightNumber")int flightNumber) {
		FlightResponse response= new FlightResponse();
		flightDAO.deleteFlight(flightNumber);
		response.setStatusCode(201);
		response.setMessesge("success");
		response.setDiscription("flight Successfully Deleted");	
		return response;
	}
	
	@GetMapping(path="/getall-flight",produces=MediaType.APPLICATION_JSON_VALUE)
	public FlightResponse getAllFlights() {
		FlightResponse response= new FlightResponse();
		List<FlightBean> beans = flightDAO.getAllFlight();
		if(beans.isEmpty()) {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription("flight details Not Found");	
			}else {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription("flight Details Found");
			response.setBeans(beans);
		}
		return response;
	}
	
	@PutMapping(path="/modify-flight",produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public FlightResponse modifyFlight(@RequestBody FlightBean flightBean) {
		FlightResponse response= new FlightResponse();
		if(flightDAO.modifyFlight(flightBean)) {
			response.setStatusCode(201);
			response.setMessesge("success");
			response.setDiscription(" Successfully Modified flight");
		}else {
			response.setStatusCode(401);
			response.setMessesge("failure");
			response.setDiscription("Failed to modify flight");	
		}
		return response;
	}
	
}

