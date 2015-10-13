package com.airamerica;

public class CheckedBagage extends Services {
	private String ticketCode; 
	private int quantityBagage;
	double checkBagagePrice;
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
	
}
