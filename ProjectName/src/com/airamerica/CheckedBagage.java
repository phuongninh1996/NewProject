package com.airamerica;

public class CheckedBagage extends Services {
	private String ticketCode; 
	private int quantityBagage;
	double checkBagagePrice = 0;
	public CheckedBagage(String code, String type, String tickeCode){
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
	public double getCheckBagagePrice() {
		if(quantityBagage == 1){
			checkBagagePrice = 25.00;
			return checkBagagePrice;
		}
		else{
			checkBagagePrice = 25.00 + ((quantityBagage-1)*35.00);
			return checkBagagePrice;
		}
	}
	
}
