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
		
//		Sleep s1 = new Sleep(1234,30,true,false);
//		System.out.println("s1's getClass = " + s1.getClass().getSuperclass());
//		System.out.println("s1 is a " + s1.getClass());
//		System.out.println();
		

	}

}
