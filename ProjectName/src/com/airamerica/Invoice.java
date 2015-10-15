package com.airamerica;
import java.util.ArrayList;

import org.joda.time.DateTime;

public class Invoice {
	private String Date;
	private String PNR;
	private ArrayList<Product> ListOfTickets;
	private Customer Customer;
	private Person Salesperson;
	private String InvoiceCode;
	private ArrayList<Services> ListOfService;

	public Invoice(String code, String date, String PNR,
			ArrayList<Product> listOfTickets, Customer customer,
			Person salesperson, ArrayList<Services> listOfService) {
		InvoiceCode = code;
		Date = date;
		this.PNR = PNR;
		ListOfTickets = listOfTickets;
		Customer = customer;
		Salesperson = salesperson;
		ListOfService = listOfService;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getPNR() {
		return PNR;
	}

	public void setPNR(String pNR) {
		PNR = pNR;
	}

	public ArrayList<Product> getListOfTickets() {
		return ListOfTickets;
	}

	public void setListOfTickets(ArrayList<Product> listOfTickets) {
		ListOfTickets = listOfTickets;
	}

	public Customer getCustomer() {
		return Customer;
	}

	public void setCustomer(Customer customer) {
		Customer = customer;
	}

	public Person getSalesperson() {
		return Salesperson;
	}

	public void setSalesperson(Person salesperson) {
		Salesperson = salesperson;
	}

	public String getInvoiceCode() {
		return InvoiceCode;
	}

	public void setInvoiceCode(String personCode) {
		this.InvoiceCode = personCode;
	}

	public ArrayList<Services> getListOfService() {
		return ListOfService;
	}

	public void setListOfService(ArrayList<Services> listOfService) {
		ListOfService = listOfService;
	}
	}