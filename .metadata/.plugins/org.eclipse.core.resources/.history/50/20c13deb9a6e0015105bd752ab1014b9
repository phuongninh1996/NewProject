package com.airamerica;


public class StandardTickets extends Ticket {

	
	public StandardTickets(String code, String type, AirPort departureAirport, AirPort arrivalAirport,String depTime,String arrTime,String flightNo,String flightClass,String aircraftType){
	setProductCode(code);
	setType(type);
	super.setDepartureAirport(departureAirport);
	this.setArrivalAirport(arrivalAirport); 
	super.setDepTime(depTime);
	super.setArrTime(arrTime);
	super.setFlightNumber(flightNo);
	super.setFlightClass(flightClass);
	super.setAircraftType(aircraftType); 
	}

	@Override
	public double getTicketPrice(double distance) {
		double rawPrice = 0;
		double ticketPrice = 0;
		if(super.getFlightClass().equals("EC")){
			rawPrice = distance * 0.15;
		}
		if(super.getFlightClass().equals("BC")){
			rawPrice = distance * 0.5;
		}
		if(super.getFlightClass().equals("EP")){
			rawPrice = distance * 0.2;
		}
		ticketPrice = rawPrice * super.getNumberOfPassenger();
		return ticketPrice;
	}
	
}






