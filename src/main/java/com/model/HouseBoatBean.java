package com.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

//pojo class with required attributes,getters and setters 
public class HouseBoatBean {
	
	private String houseBoatType;
	private double boatCost;
	//Use appropriate annotation to validate this attribute
	@Min(value=1,message="Number of days should be between 1 and 5")
	@Max(value=5,message="Number of days should be between 1 and 5")
	private int noOfDays;
	public String getHouseBoatType() {
		return houseBoatType;
	}
	public void setHouseBoatType(String houseBoatType) {
		this.houseBoatType = houseBoatType;
	}
	public double getBoatCost() {
		return boatCost;
	}
	public void setBoatCost(double boatCost) {
		this.boatCost = boatCost;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	
}
	 	  	    	    	     	      	 	
