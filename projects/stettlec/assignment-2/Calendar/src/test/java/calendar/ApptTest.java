package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
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
		 
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 //assertEquals(30, appt.getStartMinute());
		 appt.getStartMinute();
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());       
		 
		 
	 }

	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
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
		 
		 Appt appt1 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 appt.setStartHour(10);
		 appt.setStartMinute(11);
		 appt.setStartDay(12);
		 appt.setStartMonth(02);
		 appt.setStartYear(2017);
		 appt.setTitle("Death Day");
		 appt.setDescription("Yes");
		 
		 appt.toString();
		 
		 appt.compareTo(appt1);
		 
	 }
	 
	 @Test
	  public void test03()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 
		//Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(-1,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 Appt appt1 = new Appt(startHour,
		          -1 ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 Appt appt2 = new Appt(startHour,
		          startMinute ,
		          -1 ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 Appt appt3 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          -1 ,
		          startYear ,
		          title,
		         description);
		 
		 Appt appt4 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          -1 ,
		          title,
		         description);
		 
		 Appt appt5 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          null,
		         description);
		 
		 Appt appt6 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         null);
		 
		 
		
		 
	 }
	 
	 @Test
	  public void test04()  throws Throwable {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
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
		 
		 int[] intarr = {0, 1, 2};
		 
		 appt.setRecurrence(null, 1, 1, 1);
		 
		 appt.setRecurrence(intarr, 1, 1, 1);
		 
	 }
	 
	 @Test
	  public void test05()  throws Throwable {
		 int startHour=10;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
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
		 
		 appt.toString();
		 
		 appt.setStartHour(0);
		 
		 appt.toString();
		 
		 appt.setStartHour(-1);
		 
		 appt.toString();
		 
	 }
	 

	
}
