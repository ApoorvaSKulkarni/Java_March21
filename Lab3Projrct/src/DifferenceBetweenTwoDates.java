/*
 * Name : Apoorva S Kulkarni
 * Description : Calculating difference between entered date & time and the system date & time
 * Date : 20/3/2021 
 */

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DifferenceBetweenTwoDates {

	public static void main(String[] args) {
		String startDate = "10-01-2021 01:15:25";
		String endDate = "20-03-2021 02:39:30";
		/*DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		LocalDateTime end = LocalDateTime.now();
		String endDate = dtf.format(end);
		System.out.println("System date is: "+dtf.format(end));*/
		findDifference(startDate, endDate);

	}

	private static void findDifference(String startDate, String endDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		try { 
			  
            Date d1 =  sdf.parse(startDate); 
            Date d2 =  sdf.parse(endDate); 
  
            long difference_In_Time = d2.getTime() - d1.getTime(); 
  
            long difference_In_Seconds  = (difference_In_Time  / 1000) % 60; 
  
            long difference_In_Minutes 
                = (difference_In_Time / (1000 * 60)) % 60; 
  
            long difference_In_Hours 
                = (difference_In_Time / (1000 * 60 * 60)) % 24; 
  
            long difference_In_Years 
                = (difference_In_Time / (1000l * 60 * 60 * 24 * 365)); 
  
            long difference_In_Days 
                = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365; 
  
            System.out.print("Difference between two dates is: "); 
  
            System.out.println( 
                difference_In_Years 
                + " years, "
                + difference_In_Days 
                + " days, "
                + difference_In_Hours 
                + " hours, "
                + difference_In_Minutes 
                + " minutes, "
                + difference_In_Seconds 
                + " seconds"); 
        } 
  
        // Catch the Exception 
        catch (ParseException e) { 
            e.printStackTrace(); 
        } 
	}

}
