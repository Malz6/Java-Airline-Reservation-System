package com.airport.project.dao;

import java.util.List;

import com.airport.project.model.Airport;


	public interface AirportDao {
		void insertAirport(Airport cus);
		List<Airport> getAllAirport();
		void deleteAirport(Airport air);
		void updateAirport(Airport air);
		List<Airport> FindAirportFlighttById(Airport air);
	}