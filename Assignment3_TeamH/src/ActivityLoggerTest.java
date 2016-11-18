import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ActivityLoggerTest {
	//fields shared by several test methods
	ActivityLogger a1;
	ActivityLogger a2;
	ActivityLogger a3;
	
	@Before 
	public void setUp(){
		a1 = new ActivityLogger(123);//same user (same accountID)
		a2 = new ActivityLogger(123);//same user (same accountID)
		a3 = new ActivityLogger(321);//different user (different accountID)
	}
	
	@Test
	public void testLogRun() {
		assertNotNull(a1.logRun());
		assertNotNull(a2.logRun());
		assertNotNull(a3.logRun());
		/*check that a1 and a2 belong to the same user
		 * by comparing each user's account ID
		 */
		assertSame(a1.logRun().getAccountID(),a2.logRun().getAccountID());
		/**
		 * check that a1 and a3 belong to different users
		 * by comparing each user's account ID
		 */
		assertNotSame(a1.logRun().getAccountID(),a3.logRun().getAccountID());
	}
	
	@Test
	public void testLogSwim() {
		assertNotNull(a1.logSwim());
		assertNotNull(a2.logSwim());
		assertNotNull(a3.logSwim());
		/*check that a1 and a2 belong to the same user
		 * by comparing each user's account ID
		 */
		assertSame(a1.logSwim().getAccountID(),a2.logSwim().getAccountID());
		/**
		 * check that a1 and a3 belong to different users
		 * by comparing each user's account ID
		 */
		assertNotSame(a1.logSwim().getAccountID(),a3.logSwim().getAccountID());
	}
	
	@Test
	public void testLogSleep() {
		assertNotNull(a1.logSleep());
		assertNotNull(a2.logSleep());
		assertNotNull(a3.logSleep());
		/*check that a1 and a2 belong to the same user
		 * by comparing each user's account ID
		 */
		assertSame(a1.logSleep().getAccountID(),a2.logSleep().getAccountID());
		/**
		 * check that a1 and a3 belong to different users
		 * by comparing each user's account ID
		 */
		assertNotSame(a1.logSleep().getAccountID(),a3.logSleep().getAccountID());
	}
	
	@Test
	public void testLogActivity(){
		assertNotNull(a1.logActivity());
		
	}

	public static void main(String[]args){
		org.junit.runner.JUnitCore.main("ActivityLoggerTest");
	}
}
