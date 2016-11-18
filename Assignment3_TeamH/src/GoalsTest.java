import org.junit.Test;

import junit.framework.TestCase;

public class GoalsTest extends TestCase {

	@Test
	public void test1(){
		Goals test = new Goals();
		boolean output1 = test.getRandomData();
		boolean output2 = test.selectWorkoutType();
		boolean output3 = test.askWorkoutType();
		assertTrue(output1);
		assertTrue(output2);
		assertTrue(output3);
	}
	public static void main(String [] args){
		org.junit.runner.JUnitCore.main("GoalsTest.java");
	}
}
