import static org.junit.Assert.*;

import org.junit.Test;

public class ProfileTest {

	@Test
	public void test() {
		Profile test = new Profile();
		boolean output1 = test.changePassword();
		boolean output2 = test.changeUsername();
		assertFalse(output1);
		assertFalse(output2);
	}
	public static void main(String [] args){
		org.junit.runner.JUnitCore.main("GoalsTest.java");
	}
}
