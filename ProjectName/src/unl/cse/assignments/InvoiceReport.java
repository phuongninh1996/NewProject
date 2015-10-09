package unl.cse.assignments;
import unl.cse.assignments.DataConverter; 

import java.util.ArrayList;

import com.airamerica.Customer;
import com.airamerica.Invoice;
import com.airamerica.Product;
import com.airamerica.Ticket;


/* Assignment 3,5 and 6 (Project Phase-II,IV and V) */

public class InvoiceReport {
	int i = 0;
	private String generateSummaryReport() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Executive Summary Report\n");
		sb.append("=========================\n");
		
		//TODO: Add code for generating summary of all Invoices
		
		return sb.toString();
	}

	private String getTravelSummary(Invoice invoice) {
		//TODO: Add code for generating Travel Information of an Invoice
		StringBuilder sb = new StringBuilder();
		sb.append("FLIGHT INFORMATION\n");
		sb.append(String.format("%-12s %-10s %-10s %-30s %-30s %-10s\n","Day, Date", "Flight", "Class",
																	  "DepartureCity and Time",
																	  "ArrivalCity and Time", "Aircraft"));

		//for(int z =0 ; z< invoice.getListOfTickets().size(); z++ ){

		Ticket ticket = (Ticket) invoice.getListOfTickets().get(i);
		
		//System.out.println(invoice.getListOfTickets().get(i));
		sb.append(String.format("%-12s %-10s %-10s %-30s %-30s %-10s", ticket.getTravelDate(),
																	   ticket.getFlightNumber(), ticket.getFlightClass(),
																	   ticket.getDepartureAirport().getAddress().getCity()+","+ ticket.getDepartureAirport().getAddress().getState()
																	   +"("+ticket.getDepartureAirport().getAirportCode()+")" + ticket.getDepTime(),
																	   ticket.getArrivalAirport().getAddress().getCity()+","+ ticket.getArrivalAirport().getAddress().getState()
																	   +"("+ticket.getArrivalAirport().getAirportCode()+")" + ticket.getArrTime(),
																	   ticket.getAircraftType())+ "\n");
		sb.append(String.format("           %-30s %-10s %-15s\n","Traveller","Age","SeatNo"));
		//System.out.print(ticket.getListOfPassengers().size() + "\n");
		for(int j = 0; j < ticket.getListOfPassengers().size(); j++){
		sb.append(String.format("           %-30s %-10s %-15s\n",ticket.getListOfPassengers().get(j).getFirstName()+","+ticket.getListOfPassengers().get(j).getLastName(),
																ticket.getListOfPassengers().get(j).getAge(),ticket.getListOfPassengers().get(j).getSeatNumber()));
			}
		sb.append(String.format("      *%s\n", ticket.getTicketNote()));
		//}
		sb.append("------------------------------------------------------------------------------------------------------------\n");
		return sb.toString();
}
		private String getCustomerSummary(Invoice invoice){
		StringBuilder sb = new StringBuilder();
		sb.append("CUSTOMER INFORMATION:\n");
		Customer customer = (Customer) invoice.getCustomer();
		sb.append(String.format("       %-15s (%-4s)\n", customer.getName(), customer.getCustomerCode()));
		if (customer.getType().equals("C")){
			sb.append(String.format("       %-10s\n", "[Corporate]"));
		}
		else if (customer.getType().equals("V")){
			sb.append(String.format("       %-10s\n", "[Goverment]"));
		}
		else if (customer.getType().equals("G")){
			sb.append(String.format("       %-10s\n", "[General]"));
		}
		sb.append("       "+customer.getPrimaryContact().getFirstName()+","+ customer.getPrimaryContact().getLastName() +"\n");
		sb.append("       "+customer.getPrimaryContact().getAddress().getStreet()+"\n");
		sb.append("       "+customer.getPrimaryContact().getAddress().getCity()+" "
						   +customer.getPrimaryContact().getAddress().getState()+" "
						   +customer.getPrimaryContact().getAddress().getZip()+" "
						   +customer.getPrimaryContact().getAddress().getCountry()+"\n");
		sb.append("------------------------------------------------------------------------------------------------------------\n");
		return sb.toString();
}
	
	private String getCostSummary(Invoice invoice) {
		StringBuilder sb = new StringBuilder();
		sb.append("FARES AND SERVICES\n");
		
		//TODO: Add code for generating Cost Summary of all 
		//products and services in an Invoice
		
		return sb.toString();
		
	}

	public String generateDetailReport(ArrayList<Invoice> invoiceList ) {
	StringBuilder sb = new StringBuilder();		
	sb.append("Individual Invoice Detail Reports\n");
	sb.append("==================================================\n");
	/* TODO: Loop through all invoices and call the getTravelSummary() and 
	getCostSummary() for each invoice*/
	for (i = 0; i < DataConverter.invoiceList.size(); i++){
		sb.append(getTravelSummary(DataConverter.invoiceList.get(i)));
		sb.append(getCustomerSummary(DataConverter.invoiceList.get(i)));
		sb.append(getCostSummary(DataConverter.invoiceList.get(i)));
	}
		
	
	return sb.toString();
	}

	public static void main(String args[]) {
		DataConverter.getData();
		//System.out.print(DataConverter.invoiceList);
		InvoiceReport ir = new InvoiceReport();
		String summary = ir.generateSummaryReport();
		String details = ir.generateDetailReport(DataConverter.invoiceList);
				
		System.out.println(summary);
		System.out.println("\n\n");
		System.out.println(details);
		
		System.out.println("======================================================================================================================");
		System.out.println("\n\n");
		
	}
}
