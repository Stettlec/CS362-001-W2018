package calendar;

import java.util.Calendar;


import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;


import java.util.*;

/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	
	private static final long TestTimeout = 30 * 500 * 1; /* Timeout at 30 seconds */
	
    /**
     * Generate Random Tests that tests TimeTable Class.
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
				 int startDay=ValuesGenerator.getRandomIntBetween(random, -3, 33);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.RandInt(random);
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
				 
				 if(1==ValuesGenerator.getRandomIntBetween(random, -3, 27)) {
					 appt = null;
				 }
				 
				 startHour=ValuesGenerator.getRandomIntBetween(random, -3, 27);
				 startMinute=ValuesGenerator.getRandomIntBetween(random, -4, 64);
				 startDay=ValuesGenerator.getRandomIntBetween(random, -3, 33);
				 startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 startYear=ValuesGenerator.RandInt(random);
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

				 GregorianCalendar calendar = new GregorianCalendar(
						 startYear=ValuesGenerator.RandInt(random)
						 , ValuesGenerator.getRandomIntBetween(random, 1, 11)
						 , ValuesGenerator.getRandomIntBetween(random, -3, 33));
				 
				 
				 
				 GregorianCalendar calendar1 = new GregorianCalendar(
						 startYear=ValuesGenerator.RandInt(random)
						 , ValuesGenerator.getRandomIntBetween(random, 1, 11)
						 , ValuesGenerator.getRandomIntBetween(random, -3, 33));
			
				 
				 TimeTable tt = new TimeTable();
				 
				 LinkedList<Appt> apptLL = new LinkedList<Appt>();
				 
				 apptLL.add(appt);
				 apptLL.add(appt1);
				 
				 if(1==ValuesGenerator.getRandomIntBetween(random, -3, 27)) {
					 apptLL = null;
				 }
				 
				 try {
				 tt.getApptRange(apptLL, calendar, calendar1);
				 }catch(Throwable e) {
					 
				 }
				 
				 
				 tt.deleteAppt(apptLL, appt);
				 
				 apptLL.add(appt);
				 apptLL.add(appt);
				 apptLL.add(appt);
				 apptLL.add(appt1);
				 apptLL.add(appt);
				 apptLL.add(appt);
				 
				 tt.deleteAppt(apptLL, appt);
				 
				 
				 
				 
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			       
			     System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
				 
			}
			
		}catch(NullPointerException e){
			
		}
	 
		 System.out.println("Done testing...");
		 
	 }


	
}
