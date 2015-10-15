package com.airamerica;

public class Insurance extends Services {
	private String name;
	private String ageClass;
	private double costPerMile;
	private int quantity;
	private String ticketCode;
	private double insurancePrice;
	private double insuranceTax;
	

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
	@Override
	public double getServicesPrice() {
		return 0;
	}
	@Override
	public String getServicesName() { 
		return name;
	}

	@Override
	public double getInsurancePrice(double distance) {
		insurancePrice = costPerMile * quantity * distance;
		return insurancePrice;
	}

	@Override
	public double getCost() {
		return 0;
	}

	@Override
	public double getTaxes() {
		insuranceTax = insurancePrice * 0.04;
		return insuranceTax;
	}

	@Override
	public String getAge() {
		return ageClass;
	}

	@Override
	public String getServiceType() {
		return super.getType();
	}

	@Override
	public double costPerMile() {
		return costPerMile;
	}

	@Override
	public double Total() {
		return insuranceTax + insurancePrice;
	}
}	

