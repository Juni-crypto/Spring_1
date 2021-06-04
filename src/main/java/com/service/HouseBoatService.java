package com.service;

import org.springframework.stereotype.Service;

import com.model.HouseBoatBean;
import java.util.*;
//use appropriate annotation to configure HouseBoatService as a Service
@Service
public class HouseBoatService {
	
	public Map<String,Double> houseBoatMap = new HashMap<>();
	public HouseBoatService() {
		houseBoatMap.put("1BHB", 7000.0);
		houseBoatMap.put("2BHB", 10000.0);
		houseBoatMap.put("3BHB", 15000.0);
		houseBoatMap.put("4BHB", 20000.0);
		houseBoatMap.put("6BHB", 25000.0);
	}
	public double calculateTotalCost(HouseBoatBean houseBoat)
	{
		String houseBoatType = houseBoat.getHouseBoatType();
		double cost = houseBoatMap.get(houseBoatType);
		int days = houseBoat.getNoOfDays();
;		return cost*days;
		
		
	}

}
	 	  	    	    	     	      	 	
