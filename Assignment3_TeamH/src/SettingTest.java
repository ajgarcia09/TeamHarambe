import static org.junit.Assert.*;

import org.junit.Test;

public class SettingTest {
	Setting one = new Setting();
	@Test
	public void connectBandTest(){
		assertEquals(true, one.connectBand(true));
		assertNotSame(false,one.connectBand(true));
	}
	@Test
	public void getBandStatusTest(){
		assertEquals(false, one.getBandStatus()); // check if off
		assertNotSame(true,one.getBandStatus()); // check if off
	}
	@Test
	public void changePasswordTest(){
		one.setPassword("poochie");
		assertEquals(true, one.changePassword(true, "poochie")); 
		assertNotSame(true,one.changePassword(true, "notpoochie"));
	}
	@Test
	public void changeEmailTest(){
		one.setPassword("fat");
		assertEquals(true, one.changeEmail(true, "fat")); 
		assertNotSame(true,one.changeEmail(true, "notFat"));
	}
	@Test
	public void getEmailTest(){
		one.setEmail("fat@gmail.com");
		assertEquals("fat@gmail.com", one.getEmail()); 
		assertNotSame("fat@yahoo.com",one.getEmail());
	}
	@Test
	public void getPasswordTest(){
		one.setPassword("fat");
		assertEquals("fat", one.getPassword()); 
		assertNotSame("fatty",one.getPassword());
	}
	public static void main(String[] args){
		org.junit.runner.JUnitCore.main("AccountTest");
	}

}
