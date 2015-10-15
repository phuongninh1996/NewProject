package com.airamerica;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class OffSeasonTickets extends Ticket{

	private String seasonStartDate;
	private String seasonEndDate;
	private double rebate; 
	private double offseasonTicketPrice;
	private double offseasonTicketTax;
	
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
	public double getTicketPrice(double distance){
		if(super.convertDate(super.getTravelDate()).before(super.convertDate(seasonStartDate)) || 
		   super.convertDate(super.getTravelDate()).after(super.convertDate(seasonEndDate))){
			offseasonTicketPrice = super.getTicketPrice(distance) + 20.00;
		}
		else {
			offseasonTicketPrice = (super.getTicketPrice(distance) - (super.getTicketPrice(distance) * rebate)) + 20.00;
			}
		return offseasonTicketPrice;
	}

	@Override
	public int getAwardMile(double distance) {
		return 0;
	}

	@Override
	public double getTax() {
		offseasonTicketTax = (offseasonTicketPrice * 0.075) + (9.6 * super.getNumberOfPassenger()) + (AirPort.getPassengerFacilityFee() * super.getNumberOfPassenger());
		return offseasonTicketTax;
	}
	@Override
	public double Total() {
		return offseasonTicketTax + offseasonTicketPrice;
	}
}

