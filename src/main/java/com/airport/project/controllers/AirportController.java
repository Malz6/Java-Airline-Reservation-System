package com.airport.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.airport.project.model.Airport;
import com.airport.project.service.AirportService;

@Controller
public class AirportController {
	@Autowired
	AirportService airportService;
	
	@RequestMapping("/welcome")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
	
	@RequestMapping(value = "/addFlight", method = RequestMethod.GET)
	public ModelAndView show() {
		return new ModelAndView("addFlight", "air", new Airport());
	}
	
	@RequestMapping(value = "/addFlight", method = RequestMethod.POST)
	public ModelAndView processRequest(@ModelAttribute("air") Airport air) {
		airportService.insertAirport(air);
		List<Airport> flights = airportService.getAllAirport();
		ModelAndView model = new ModelAndView("getFlight");
		model.addObject("flights", flights);
		return model;
	}
	
	@RequestMapping("/getFlight")
	public ModelAndView getFlights() {
		List<Airport> flights = airportService.getAllAirport();
		ModelAndView model = new ModelAndView("getFlight");
		model.addObject("flights", flights);
		return model;
	}
	
	@RequestMapping(value = "/deleteFlight", method = RequestMethod.GET)
	public ModelAndView show1() {
		return new ModelAndView("deleteFlight", "flights", new Airport());
	}
	
	@RequestMapping(value = "/deleteFlight", method = RequestMethod.POST)
	public ModelAndView processDelete(@ModelAttribute("flights") Airport air) {
		airportService.deleteAirport(air);
		List<Airport> flights = airportService.getAllAirport();
		ModelAndView model = new ModelAndView("getFlight");
		model.addObject("flights", flights);
		return model;
	}
	
	
	@RequestMapping(value = "/updateFlight", method = RequestMethod.GET)
	public ModelAndView show2() {
		return new ModelAndView("updateFlight", "flights", new Airport());
	}
	
	@RequestMapping(value = "/updateFlight", method = RequestMethod.POST)
	public ModelAndView processUpdate(@ModelAttribute("flights") Airport air) {
		airportService.updateAirport(air);
		List<Airport> flights = airportService.getAllAirport();
		ModelAndView model = new ModelAndView("getFlight");
		model.addObject("flights", flights);
		return model;
		
	}

	@RequestMapping(value="/findFlight",method = RequestMethod.GET)
	public ModelAndView show3() {
		return new ModelAndView("findFlight", "flights", new Airport());
	}
	
	@RequestMapping(value = "/findFlight", method = RequestMethod.POST)
	public ModelAndView FindFlight(@ModelAttribute("flights") Airport air) {
		List<Airport> flights=airportService.FindAirportFlighttById(air);
		ModelAndView model;
		if(flights.size()==0)
		model = new ModelAndView("NotFound");
		else
		{
			model = new ModelAndView("getFlight");
		    model.addObject("flights", flights);
		}
		return model;
		}
		
		
}