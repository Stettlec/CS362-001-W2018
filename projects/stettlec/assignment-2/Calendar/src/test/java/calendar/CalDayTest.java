package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		 
		 CalDay calday = new CalDay();
		 
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=03;
		 int startYear=2018;
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
		 
		 calday.toString();
		 
		 calday.iterator();
		 
		 calday.addAppt(appt);
		 
		 calday.toString();
		 
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          02 ,
		          startYear ,
		          title,
		         description);
				 
		 calday.addAppt(appt1);
				 
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 GregorianCalendar cal = new GregorianCalendar(1999, 04, 22);
		 
		 CalDay calday = new CalDay(cal);
		 
		 calday.toString();
		 calday.iterator();
		 calday.isValid();
	 }
//add more unit tests as you needed	
}
