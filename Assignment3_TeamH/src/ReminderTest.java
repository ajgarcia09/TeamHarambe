import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReminderTest {
	
	Reminder x = new Reminder();
	
	@Test
    public void setRemindertest() {
		assertEquals(true, x.setReminder("poochy@gmail.com", "11/10/95 12:30pm", true));
		assertNotSame(false, x.setReminder("guccis@gmail.com", "11/10/95 12:31pm", true));
	}
	@Test
	public void setAlarmtest() {
		assertEquals(true, Reminder.setAlarm("11/10/95 12:30pm")); // this time exists in the reminders
		assertNotSame(true, Reminder.setAlarm("11/10/95 12:45pm")); // this time does not exist in the reminders
	}
	@Test
	public void checkRemindersTest(){
		assertEquals(true, x.checkReminders());
		assertNotSame(false, x.checkReminders());
	}
	
	public static void main(String[] args){
		org.junit.runner.JUnitCore.main("AccountTest");
	}

}
