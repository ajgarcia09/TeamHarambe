import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ActivityLoggerTest {
	//fields shared by several test methods
	ActivityLogger a1;
	
	@Before 
	public void setUp(){
		a1 = new ActivityLogger(123);
	}
	
	@Test
	public void testLogRun() {
		assertNotNull(a1.logRun());
	}
	
	@Test
	public void testLogSwim() {
		assertNotNull(a1.logSwim());
	}
	
	@Test
	public void testLogSleep() {
		assertNotNull(a1.logSleep());
	}
	
	@Test
	public void testLogActivity(){
		assertNotNull(a1.logActivity());
		
	}

	public static void main(String[]args){
		org.junit.runner.JUnitCore.main("ActivityLoggerTest");
	}
}
