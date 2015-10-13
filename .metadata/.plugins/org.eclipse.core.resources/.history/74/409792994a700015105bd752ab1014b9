package testDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class TestDemo {

	public static void main(String[] args) {
	        try
	        {
	        	String s = "15:55";
	        	String s1 = "06:00";
		        SimpleDateFormat date = new SimpleDateFormat("HH:mm");
		        SimpleDateFormat date1 = new SimpleDateFormat("hh:mm a");
	            Date date2 = date.parse(s);
	            Date date3 = date.parse(s1);
	            System.out.println("date : "+date1.format(date2));
	            System.out.println("date : "+date1.format(date3));
	        }
	        catch (ParseException ex)
	        {
	            System.out.println("Exception "+ex);
	        }
	}
}