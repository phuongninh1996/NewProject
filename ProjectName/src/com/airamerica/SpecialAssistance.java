package com.airamerica;

public class SpecialAssistance extends Services {
	private String typeofService;
	public  SpecialAssistance(String code, String type, String typeofService){
		setProductCode(code);
		setType(type);
		this.typeofService = typeofService;
	}
	public String getSpecialAssistance(){
		return typeofService;
	}
}
