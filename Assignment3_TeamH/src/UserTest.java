import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	User user1;
	User user2;
	User user3;
	
	@Before
	public void setUp(){
		user1 = new User (123, "Ana","ajgarcia","anaj@gmail.com","honeybutterbiscuit",false);
		user2 = new User(321, "Hector","hcervantes","hcervantes@gmail.com","rocco",false);
		user3 = new User(456, "Ricardo","ralvarez","ralvarez@gmail.com","popTart",false);
	}

	@Test
	public void testCreateNewUser() {		
		assertNotNull(user1);
		assertNotNull(user2);
		assertNotNull(user3);
		//verify that each user has a unique email
		assertNotSame(user1.getEmail(),user2.getEmail());
		assertNotSame(user1.getAccountID(),user2.getAccountID());
	}
	
	@Test
	public void testAddDailyTrend() {
		assertNotNull(user1.newDailyTrend());			
	}
	
	/**
	 * Ensure that the actual sum of sleep time
	 * is the value that User.countDaySleepTime returns
	 */
	@Test
	public void testCountDailySleep() {
		Sleep s1 = new Sleep(user1.getAccountID(), 30, false, true);
		Sleep s2 = new Sleep(user1.getAccountID(),180,false,false);
		user1.addActivity(s1);
		user1.addActivity(s2);
		int expectedSleep = s1.getDuration() + s2.getDuration();
		assertSame(expectedSleep,user1.countDaySleepTime());			
	}
	/**
	 * Ensure that the actual sum of workout time
	 * is the value that User.countDayWorkoutTime returns
	 */
	@Test
	public void testCountDailyWorkout() {
		Run r1 = new Run(user1.getAccountID(),20,false,5);
		Run r2 = new Run(user1.getAccountID(),30,false,6);
		user1.addActivity(r1);
		user1.addActivity(r2);
		int expectedWorkout = r1.getDuration() + r2.getDuration();
		assertSame(expectedWorkout,user1.countDayWorkoutTime());		
		
	}
	
	public static void main(String[]args){
		org.junit.runner.JUnitCore.main("UserTest");
	}

}
