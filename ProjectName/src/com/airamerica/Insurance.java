package com.airamerica;

public class Insurance extends Services {
	private String name;
	private String ageClass;
	private double costPerMile;
	private int quantity;
	private String ticketCode;
	double InsurancePrice;

	public Insurance(String code, String type, String name, String ageClass, double costPerMiles){
		setProductCode(code);
		setType(type);
		this.name =name;
		this.ageClass=ageClass;
		this.costPerMile= costPerMiles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAgeClass() {
		return ageClass;
	}

	public void setAgeClass(String ageClass) {
		this.ageClass = ageClass;
	}

	public double getCostPerMile() {
		return costPerMile;
	}

	public void setCostPerMile(double costPerMile) {
		this.costPerMile = costPerMile;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getTicketCode() {
		return ticketCode;
	}

	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}
	public double getServicesPrice(double distance) {
		InsurancePrice = costPerMile * super.getQuantity() * getDistance();
		return InsurancePrice;
	}
}	

