package com.airamerica;

public class Refreshment extends Services {
	private String name;
	private double cost;
	private String personCode;
	double RefreshmentPrice = 0;
	public Refreshment(String code, String type, String name, double cost){
		setProductCode(code);
		setType(type);
		this.name= name;
		this.cost= cost; 
	}

	public String getPersonCode() {
		return personCode;
	}

	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getRefreshmentPrice(){
		RefreshmentPrice = super.getQuantity() * cost;
		return RefreshmentPrice;
	}
}

