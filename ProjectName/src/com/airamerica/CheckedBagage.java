package com.airamerica;

public class CheckedBagage extends Services {
	private String ticketCode; 
	private int quantityBagage;
	private double checkBagagePrice;
	private double checkBagageTax;
	public CheckedBagage(String code, String type, String ticketCode){
		setProductCode(code);
		setType(type);
		this.ticketCode = ticketCode;
		
	}
	public String getTicketCode() {
		return ticketCode;
	}
	public void setTicketCode(String ticketCode) {
		this.ticketCode = ticketCode;
	}
	public int getQuantityBagage() {
		return quantityBagage;
	}
	public void setQuantityBagage(int quantityBaggage) {
		this.quantityBagage = quantityBaggage;
	}
	@Override
	public double getServicesPrice() {
		if(quantityBagage == 1){
			checkBagagePrice = 25.00;
			return checkBagagePrice;
		}
		else{
			checkBagagePrice = 25.00 + ((super.getQuantity()-1)*35.00);
			return checkBagagePrice;
		}
	}
	@Override
	public String getServicesName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public double getInsurancePrice(double distance) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double getTaxes() {
		checkBagageTax = checkBagagePrice * 0.04;
		return checkBagageTax;
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
		return checkBagagePrice + checkBagageTax;
	}
}
