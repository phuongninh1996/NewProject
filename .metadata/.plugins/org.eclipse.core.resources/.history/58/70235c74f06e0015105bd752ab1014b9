package com.airamerica;

import org.joda.time.DateTime;

public class OffSeasonTickets extends Ticket{
	private String seasonStartDate;
	private String seasonEndDate;
	private double rebate; 
	
//Constructor	
	public OffSeasonTickets(String code, String type, String seasonStartDate, String seasonEndDate,  AirPort departureAirport, AirPort arrivalAirport,String depTime,String arrTime,String flightNo,String flightClass,String aircraftType,double rebate){
	setProductCode(code);
	setType(type);
	this.seasonStartDate =seasonStartDate;
	this.seasonEndDate=seasonEndDate;
	this.rebate = rebate;
	super.setDepartureAirport(departureAirport);
	this.setArrivalAirport(arrivalAirport); 
	super.setDepTime(depTime);
	super.setArrTime(arrTime);
	super.setFlightNumber(flightNo);
	super.setFlightClass(flightClass);
	super.setAircraftType(aircraftType); 
	}
	
 // Getter and Setter
	public String getSeasonStartDate() {
		return seasonStartDate;
	}


	public void setSeasonStartDate(String seasonStartDate) {
		this.seasonStartDate = seasonStartDate;
	}


	public String getSeasonEndDate() {
		return seasonEndDate;
	}


	public void setSeasonEndDate(String seasonEndDate) {
		this.seasonEndDate = seasonEndDate;
	}


	public double getRebate() {
		return rebate;
	}

	public void setRebate(double rebate) {
		this.rebate = rebate;
	}

	@Override
	public double getTicketPrice(double distance) {
		double rawPrice = 0;
		if(super.getFlightClass().equals("EC")){
			rawPrice = distance * 0.15;
		}
		if(super.getFlightClass().equals("BC")){
			rawPrice = distance * 0.5;
		}
		if(super.getFlightClass().equals("EP")){
			rawPrice = distance * 0.2;
		}
		super.setTicketPrice(rawPrice * super.getNumberOfPassenger());
		
		return 0;
	}
	public double getTicketTax(){
		super.getTicketPrice() *0.075+(4*super.getNumberOfPassenger()); 
		
	}
}

