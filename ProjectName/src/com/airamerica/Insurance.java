package com.airamerica;

public class Insurance extends Services {
	private String name;
	private String ageClass;
	private double costPerMile;
	private int quantityInsurance;
	private String ticketCode;

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

	public int getQuantityInsurance() {
		return quantityInsurance;
	}

	public void setQuantityInsurance(int quantityInsurance) {
		this.quantityInsurance = quantityInsurance;
	}

	public String getTicketCode() {
		return ticketCode;
	}

	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}
	public double getInsurancePrice() {
		double InsurancePrice = 0;
		InsurancePrice = costPerMile * quantityInsurance * getDistance();
		return InsurancePrice;
	}
}	

