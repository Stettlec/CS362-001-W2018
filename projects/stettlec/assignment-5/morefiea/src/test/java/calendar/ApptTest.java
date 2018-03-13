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
		 
		 appt.setStartHour(20);
		 appt.setStartMinute(11);
		 appt.setStartDay(12);
		 appt.setStartMonth(2);
		 appt.setStartYear(2017);
		 appt.setTitle("Death Day");
		 appt.setDescription("Yes");
		 
		 String wow = appt.toString();
		 assertEquals(wow, "\t2/12/2017 at 8:11pm ,Death Day, Yes\n");
		 
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
		 
		 assertFalse(appt.getValid());
		 
		 Appt appt1 = new Appt(startHour,
		          -1 ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 assertFalse(appt1.getValid());
		 
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
		          1 ,
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
		 
		 assertTrue(appt.isRecurring());
		 
		 appt.setRecurrence(intarr, 1, 1, 1);
		 
		 assertTrue(appt.isRecurring());
		 
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
	 
	 @Test
	  public void test06()  throws Throwable  {
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
		 
		 assertFalse(appt.getValid());
		 
		 appt.setStartHour(24);
		 assertFalse(appt.getValid());
		 
		 appt.setStartHour(23);
		 assertTrue(appt.getValid());
		 
		 appt.setStartHour(0);
		 assertTrue(appt.getValid());
		 
		 appt.setStartMinute(-1);
		 assertFalse(appt.getValid());
		 
		 appt.setStartMinute(60);
		 assertFalse(appt.getValid());
		 
		 appt.setStartMinute(0);
		 assertTrue(appt.getValid());
		 
		 appt.setStartMinute(59);
		 assertTrue(appt.getValid());
		 
		// appt.setStartMonth(0);
		// assertFalse(appt.getValid());
		 
		// appt.setStartMonth(13);
		// assertFalse(appt.getValid());
		 
		 appt.setStartMonth(1);
		 assertTrue(appt.getValid());
		 
		 appt.setStartMonth(12);
		 assertTrue(appt.getValid());
		 
		 appt.setStartDay(0);
		 assertFalse(appt.getValid());
		 
		 appt.setStartDay(32);
		 assertFalse(appt.getValid());
		 
		 appt.setStartDay(1);
		 assertTrue(appt.getValid());
		 
		 appt.setStartDay(31);
		 assertTrue(appt.getValid());
		 
	 }
	 
	 @Test
	  public void test07()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=2;
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
		 
		 Appt appt1 = new Appt(21,
		          30,
		          15 ,
		          2 ,
		          2018 ,
		          "Early Party",
		         "Wowowowow");
		 
		 assertEquals(0,appt.compareTo(appt1));
		 
		 appt1.setStartHour(20);
		 assertEquals(1,appt.compareTo(appt1));
		 
		 appt1.setStartMonth(1);
		 assertEquals(2,appt.compareTo(appt1));
		 
		 appt1.setStartMinute(29);
		 assertEquals(3,appt.compareTo(appt1));
		 
		 appt1.setStartDay(14);
		 assertEquals(4,appt.compareTo(appt1));
		 
		 appt1.setStartYear(2017);
		 assertEquals(5,appt.compareTo(appt1));
		 
	 }
	 

	
}