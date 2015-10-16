package com.airamerica;

public class Refreshment extends Services {
	private String name;
	private double cost;
	private String personCode;
	private double refreshmentPrice;
	private double refreshmentTax;
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
	@Override
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getServicesPrice(double distance){
		refreshmentPrice = (super.getQuantity() * cost)-((super.getQuantity() * cost)*0.05);
		return refreshmentPrice;
	}

	@Override
	public String getServicesName() {
		return name;
	}

	@Override
	public double getTaxes() {
		refreshmentTax = refreshmentPrice * 0.04;
		return refreshmentTax;
	}

	@Override
	public String getAge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServiceType() {
		// TODO Auto-generated method stub
		return super.getType();
	}

	@Override
	public double costPerMile() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Total() {
		return refreshmentPrice + refreshmentTax;
	}
}

