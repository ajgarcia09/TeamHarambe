/**
 * Driver to test out creating a user within 
 * the system and logging in activities, as well
 * as creating a daily trend of activities
 * @author Ana J. Garcia
 * @version 1.0 (11/17/2016)
 * @see User
 *
 */
public class Win {
	public static void main(String[] args) {
		
		User user1 = new User(12345,"Ana","anaj","anaj@gmail.com","velvet",false);	
		user1.logActivity();
		user1.logActivity();
		user1.logActivity();
		System.out.println(user1.getName());
		user1.printActivities();
		user1.newDailyTrend();
		user1.printDailyTrends();
	
	}

}
