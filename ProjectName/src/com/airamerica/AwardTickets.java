package com.airamerica;

//import org.joda.time.DateTime;

public class AwardTickets extends Ticket {
	private double pointsPerMile;
	private double awardTicketPrice;
	private double awardTicketTax;
// Constructor
	public AwardTickets(String code, String type, AirPort departureAirport, AirPort arrivalAirport,String depTime,String arrTime,String flightNo,String flightClass,String aircraftType, double pointsPerMile){
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
	public double getPointsPerMile() {
		return pointsPerMile;
	}

	public void setPointsPerMile(double pointsPerMile) {
		this.pointsPerMile = pointsPerMile;
	}
	public double getTicketPrice(double distance){
		awardTicketPrice = 30.00;
		return awardTicketPrice;
	}
	@Override
	public int getAwardMile(double distance) {
		return (int)(super.getTicketPrice(distance) * pointsPerMile)/super.getNumberOfPassenger();
	}

	public void setAwardMile(int awardMile) {
	}

	@Override
	public double getTax() {
		awardTicketTax = (awardTicketPrice * 0.075) + (9.6 * super.getNumberOfPassenger());
		return awardTicketTax;
	}
	@Override
	public double Total() {
		return awardTicketTax + awardTicketPrice;
	}

	@Override
	public double getRebate() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
