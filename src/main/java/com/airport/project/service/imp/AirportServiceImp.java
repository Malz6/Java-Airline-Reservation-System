package com.airport.project.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.project.dao.AirportDao;
import com.airport.project.model.Airport;
import com.airport.project.service.AirportService;

@Service
public class AirportServiceImp implements AirportService {
	
	@Autowired
	AirportDao airportDao;

	@Override
	public void insertAirport(Airport airport) {
		airportDao.insertAirport(airport);
		
	}

	@Override
	public List<Airport> getAllAirport() {
		return airportDao.getAllAirport();
	}

	@Override
	public void deleteAirport(Airport air) {
		airportDao.deleteAirport(air);
		
	}

	@Override
	public void updateAirport(Airport air) {
		airportDao.updateAirport(air);
		
	}

	@Override
	public List<Airport> FindAirportFlighttById(Airport air) {
		return airportDao.FindAirportFlighttById(air);
	}
	

}

