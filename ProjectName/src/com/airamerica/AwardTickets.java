package com.airamerica;

//import org.joda.time.DateTime;

public class AwardTickets extends Ticket {;
	private String pointsPerMile;
// Constructor
	public AwardTickets(String code, String type, AirPort departureAirport, AirPort arrivalAirport,String depTime,String arrTime,String flightNo,String flightClass,String aircraftType, String pointsPerMiles){
	setProductCode(code);
	setType(type);
	super.setDepartureAirport(departureAirport);
	this.setArrivalAirport(arrivalAirport); 
	super.setDepTime(depTime);
	super.setArrTime(arrTime);
	super.setFlightNumber(flightNo);
	super.setFlightClass(flightClass);
	super.setAircraftType(aircraftType); 
	this.pointsPerMile = pointsPerMile;
	}
	
// Getter and Setter
	public String getPointsPerMile() {
		return pointsPerMile;
	}

	public void setPointsPerMile(String pointsPerMile) {
		this.pointsPerMile = pointsPerMile;
	}


}
