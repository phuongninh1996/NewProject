package com.airamerica;

public class StandardTickets extends Ticket {
	private double standardTicketPrice;
	private double standardTicketTax;
	
	
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
		standardTicketPrice = super.getTicketPrice(distance);
		return standardTicketPrice;
	}
	@Override
	public int getAwardMile(double distance) {
		return 0;
	}
	//Error on this method, cannot call AirPort.getPassengerFacilityFee(), it has to be changed to Static in order to call this function
	@Override
	public double getTax() {
		standardTicketTax = (standardTicketPrice * 0.075) + (9.6 * super.getNumberOfPassenger());
		return standardTicketTax;
	}
	@Override
	public double Total() {
		return standardTicketTax + standardTicketPrice;
	}
	@Override
	public double getRebate() {
		// TODO Auto-generated method stub
		return 0;
	}
}






