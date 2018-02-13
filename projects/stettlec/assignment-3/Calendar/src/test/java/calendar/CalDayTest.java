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
		 
		 GregorianCalendar cal = new GregorianCalendar(1999, 04, 22);
		 
		 CalDay calday = new CalDay(cal);
		 
		 int startHour=11;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=3;
		 int startYear=2017;
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
		 
		 //calday.toString();
		 
		 //calday.iterator();
		 
		 calday.addAppt(appt);
		 
		 assertEquals(1, calday.getSizeAppts());
		 
		 System.out.print("XXX"+calday.toString()+"XXX\n");
		 
		 
		 StringBuilder sb = new StringBuilder();
		 String todayDate = calday.getMonth() + "/" + calday.getDay() + "/" + calday.getYear();
		sb.append("\t --- " + todayDate + " --- \n");
		sb.append(" --- -------- Appointments ------------ --- \n");
		sb.append("\t3/15/2017 at 11:30am ,Birthday Party, This is my birthday party.\n");
		sb.append(" \n");
		 
		 System.out.print("XXX"+sb.toString()+"XXX");
		
		 assertEquals(calday.toString(), sb.toString());
		 
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          02 ,
		          startYear ,
		          title,
		         description);
				 
		 //calday.addAppt(appt1);
				 
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