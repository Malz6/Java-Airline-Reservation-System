package com.airport.project.dao.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.airport.project.dao.*;
import com.airport.project.model.*;

@Repository
public class AirportDaoImp extends JdbcDaoSupport implements AirportDao{
	
	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}

	@Override
	public void insertAirport(Airport air) {
		String sql = "insert into airport_details (Flight_id,Flight_name,Src,Dest,Time,Seat) values (?,?,?,?,?,?)";
		getJdbcTemplate().update(sql, new Object[]{
				air.getFlight_id(), air.getFlight_name(), air.getSrc(), air.getDest(),air.getTime(),air.getSeat()
		});
	}

	@Override
	public List<Airport> getAllAirport() {
		String sql = "SELECT * FROM airport_details";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<Airport> result = new ArrayList<Airport>();
		for(Map<String, Object> row:rows) {
			Airport air=new Airport();
			air.setFlight_id((String)row.get("Flight_id"));
			air.setFlight_name((String)row.get("Flight_name"));
			air.setSrc((String)row.get("Src"));
			air.setDest((String)row.get("Dest"));
			air.setTime((String)row.get("Time"));
			air.setSeat((String)row.get("Seat"));
			
			result.add(air);
		}
		return result;
	}

	@Override
	public void deleteAirport(Airport air) {
		String sql = "DELETE FROM airport_details Where Flight_id = ?" ;
		int v=getJdbcTemplate().update(sql,air.getFlight_id());
		
	}

	@Override
	public void updateAirport(Airport air) {
		getJdbcTemplate().update("update airport_details " + " set Src = ?, Dest = ?" + "where Flight_id=?",
				 air.getSrc(),air.getDest(),air.getFlight_id());
		
	}

	@Override
	public List<Airport> FindAirportFlighttById(Airport air) {
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList("select * from airport_details where Flight_id=?", air.getFlight_id());
		List<Airport> result = new ArrayList<Airport>();
		for(Map<String, Object> row:rows) {
			Airport air1 = new Airport();
			air1.setFlight_id((String)row.get("Flight_id"));
			air.setFlight_name((String)row.get("Flight_name"));
			air.setSrc((String)row.get("Src"));
			air.setDest((String)row.get("Dest"));
			air.setTime((String)row.get("Time"));
			air.setSeat((String)row.get("Seat"));
			
			result.add(air);
		}
		return result;
	}
	
}