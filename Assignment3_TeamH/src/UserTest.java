import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {
	User user1;

	@Test
	public void testCreateNewUser() {
		int accountID = 123;
		String name = "Ana";
		String userName = "ajgarcia";
		String email = "anaj@gmail.com";
		String password = "honeybutterbiscuit";
		user1 = new User (accountID, name,userName,email,password,false);
		assertNotNull(user1);
	}
	
	@Test
	public void testAddDailyTrend() {
		int accountID = 123;
		String name = "Ana";
		String userName = "ajgarcia";
		String email = "anaj@gmail.com";
		String password = "honeybutterbiscuit";
		user1 = new User (accountID, name,userName,email,password,false);
		assertNotNull(user1.newDailyTrend());
		
	}
	
	public static void main(String[]args){
		org.junit.runner.JUnitCore.main("UserTest");
	}

}
