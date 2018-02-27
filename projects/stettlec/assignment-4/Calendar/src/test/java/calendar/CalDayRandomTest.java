package calendar;


import org.junit.Test;


import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	
	private static final long TestTimeout = 30 * 500 * 1; /* Timeout at 30 seconds */
	
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 
		 System.out.println("Start testing for calday...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				
				 int startHour=ValuesGenerator.getRandomIntBetween(random, -3, 27);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, -4, 64);
				 int startDay=4;
				 int startMonth=11;
				 int startYear=1996;
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 //Construct a new Appointment object with the initial data	 
				 Appt appt = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
				 
				 
				 startHour=ValuesGenerator.getRandomIntBetween(random, -3, 27);
				 startMinute=ValuesGenerator.getRandomIntBetween(random, -4, 64);
				 startDay=4;
				 startMonth=11;
				 startYear=1996;
				 title="Birthday Party2";
				 description="This is my birthday party2.";
				 //Construct a new Appointment object with the initial data	 
				 Appt appt1 = new Appt(startHour,
				          startMinute ,
				          startDay ,
				          startMonth ,
				          startYear ,
				          title,
				         description);
				 

				 GregorianCalendar calendar = new GregorianCalendar(1996, 11, 4);
				 
				 CalDay cal = new CalDay(calendar);
				 
				 
				 cal.addAppt(appt);
				 cal.addAppt(appt1);
				 
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			       
			     System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
				 
			}
			
		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");
		
	 }


	
}
