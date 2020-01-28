package com.airport.project.service;

import java.util.List;

import com.airport.project.model.Airport;

public interface AirportService {
	void insertAirport(Airport air);
	List<Airport> getAllAirport();
	void deleteAirport(Airport air);
	void updateAirport(Airport air);
	List<Airport> FindAirportFlighttById(Airport air);
	
}
