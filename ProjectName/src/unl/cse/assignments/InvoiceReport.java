package unl.cse.assignments;
import unl.cse.assignments.DataConverter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
		try
        {
        	String s = ticket.getTravelDate();
	        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dddd");
	        SimpleDateFormat date1 = new SimpleDateFormat("EEE,ddMMMyy");
            Date date2 = date.parse(s);
            sb.append(String.format("%-12s %-10s %-10s %-30s %-30s %-10s", date1.format(date2),
					   ticket.getFlightNumber(), ticket.getFlightClass(),
					   ticket.getDepartureAirport().getAddress().getCity()+","+ ticket.getDepartureAirport().getAddress().getState(),
					   ticket.getArrivalAirport().getAddress().getCity()+","+ ticket.getArrivalAirport().getAddress().getState(),ticket.getAircraftType())+ "\n");
        }
        catch (ParseException ex)
        {
            System.out.println("Exception "+ex);
        }
		try
        {
        	String s = ticket.getDepTime();
        	String s1 = ticket.getArrTime();
	        SimpleDateFormat date = new SimpleDateFormat("HH:mm");
	        SimpleDateFormat date1 = new SimpleDateFormat("hh:mma");
            Date date2 = date.parse(s);
            Date date3 = date.parse(s1);
            sb.append(String.format("%49s %29s", "("+ticket.getDepartureAirport().getAirportCode()+") "+date1.format(date2),
            									   "("+ticket.getArrivalAirport().getAirportCode()+") "+date1.format(date3))+"\n");
        }
        catch (ParseException ex)
        {
            System.out.println("Exception "+ex);
        }
		//System.out.println(invoice.getListOfTickets().get(i));
		
		sb.append(String.format("           %-30s %-10s %-15s\n","Traveller","Age","SeatNo"));
		//System.out.print(ticket.getListOfPassengers().size() + "\n");
		for(int j = 0; j < ticket.getListOfPassengers().size(); j++){
		sb.append(String.format("           %-30s %-10s %-15s\n",ticket.getListOfPassengers().get(j).getFirstName()+","+ticket.getListOfPassengers().get(j).getLastName(),
																ticket.getListOfPassengers().get(j).getAge(),ticket.getListOfPassengers().get(j).getSeatNumber()));
			}
		sb.append(String.format("      *%s\n", ticket.getTicketNote()));
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
		sb.append("      "+customer.getPrimaryContact().getAddress().getCity()+" "
						   +customer.getPrimaryContact().getAddress().getState()+" "
						   +customer.getPrimaryContact().getAddress().getZip()+" "
						   +customer.getPrimaryContact().getAddress().getCountry()+"\n");
		//System.out.println(invoice.getSalesperson().getFirstName());
		if (invoice.getSalesperson() != null){
		sb.append("Salesperson: "+invoice.getSalesperson().getFirstName()+", "+invoice.getSalesperson().getLastName()+"\n");
		}
		else {
			sb.append("SalesPerson: ONLINE," + invoice.getSalesperson()+"\n");
		}
		sb.append("------------------------------------------------------------------------------------------------------------\n");
		return sb.toString();
}
	
	private String getCostSummary(Invoice invoice) {
		StringBuilder sb = new StringBuilder();
		sb.append("FARES AND SERVICES\n");
		Ticket ticket = (Ticket) invoice.getListOfTickets().get(i);
		sb.append(String.format("%-10s %-75s %10s %10s %10s\n", "Code","Item","SubTotal","Tax","Total"));
		if(ticket.getType().equals("TS")){
			sb.append(String.format("%-10s %-75s \n",ticket.getTicketCode(),"StandardTicket ("+ticket.getFlightClass() +") "+ticket.getDepartureAirport().getAirportCode()+" to "+ticket.getArrivalAirport().getAirportCode()
								+" ("+ticket.airPortsDistance(ticket.getDepartureAirport(), ticket.getArrivalAirport())+" miles)"
																 ));
			ticket.airPortsDistance(ticket.getDepartureAirport(), ticket.getArrivalAirport());
			sb.append(ticket.getTicketPrice(ticket.getDistance()));
			
		}
		if(ticket.getType().equals("TO")){
			sb.append(String.format("%-10s %-75s \n",ticket.getTicketCode(),"OffSeasonTicket ("+ticket.getFlightClass() +") "+ticket.getDepartureAirport().getAirportCode()+" to "+ticket.getArrivalAirport().getAirportCode()
					+" ("+ticket.airPortsDistance(ticket.getDepartureAirport(), ticket.getArrivalAirport())+" miles)"
													 ));
		}
		if(ticket.getType().equals("TA")){
			sb.append(String.format("%-10s %-75s \n",ticket.getTicketCode(),"AwardTicket ("+ticket.getFlightClass() +") "+ticket.getDepartureAirport().getAirportCode()+" to "+ticket.getArrivalAirport().getAirportCode()
					+" ("+ticket.airPortsDistance(ticket.getDepartureAirport(), ticket.getArrivalAirport())+" miles)"
													 ));
		}
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
		Invoice invoice = invoiceList.get(i);
		sb.append("Invoice "+ invoice.getInvoiceCode() +"\n");
		sb.append("------------------------------------------------------------------------------------------------------------\n");
		sb.append(String.format("%s %80s\n" , "AIR AMERICA", "PNR"));
		try
        {
        	String s = invoice.getDate();
	        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dddd");
	        SimpleDateFormat date1 = new SimpleDateFormat("MMM dd,yyyy");
            Date date2 = date.parse(s);
            sb.append(String.format("%s %s %72s\n","IssueDate:",date1.format(date2),invoice.getPNR()));
        }
		catch (ParseException ex)
        {
            System.out.println("Exception "+ex);
        }
		sb.append("------------------------------------------------------------------------------------------------------------\n");
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
