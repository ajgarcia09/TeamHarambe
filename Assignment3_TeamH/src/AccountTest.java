import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import org.junit.Test;

public class AccountTest {
	static Account test = new Account();
	
	
	@Test
	public void logInPage() throws FileNotFoundException{
		test.setID(80000);
		test.logInPage(false, 1);
		assertEquals(true, test.logInPage(true, 1));
		assertNotSame(false, test.logInPage(true, 2));
	}

	@Test
	public void getAccountIDtest() throws FileNotFoundException {
	
	Account test  = new Account();
	test.setEmail("poochy@gmail.com"); // email is in system
	test.setPassword("rocco"); // password is in the system
	
	assertEquals(1433414668, Account.getAccountID()); // tests if logged in
	
	test.setPassword("r"); // incorrect password to prevent login
	
	assertNotSame(1433414668, Account.getAccountID());// tests if logged in failed

	}
	@Test
	public void checkEmailExistsTest() throws FileNotFoundException {
		test  = new Account();
		test.setEmail("ppan@gmail.com");
		assertEquals(true, test.checkEmailExists());
		test.setEmail("pamp@gmail.com");
		assertNotSame(true,test.checkEmailExists());
		}
	@Test
	public void getEmailTest(){
		test.setEmail("fat@gmail.com");
		assertEquals("fat@gmail.com", test.getEmail()); 
		assertNotSame("fat@yahoo.com",test.getEmail());
	}
	@Test
	public void getPasswordTest(){
		test.setPassword("fat");
		assertEquals("fat", test.getPassword()); 
		assertNotSame("fatty",test.getPassword());
	}
	

	public static void main(String[] args){
		org.junit.runner.JUnitCore.main("AccountTest");
	}
	
	

}
