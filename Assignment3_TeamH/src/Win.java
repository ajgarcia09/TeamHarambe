import java.lang.*;public class Win {
	/*public User(int accountID, String name, String userName, String email, String password, boolean isNewMember) {
		this.accountID = accountID;
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.isNewMember = isNewMember;
	}
	*/
	public static void main(String[] args) {
		User user1 = new User(12345,"Ana","anaj","anaj@gmail.com","velvet",false);
		user1.logActivity();
		user1.logActivity();
		System.out.println(user1.getName());
		user1.printActivities();
		user1.newDailyTrend();
		user1.printDailyTrends();
//		Run r1 = new Run(1234,20,true,5);
//		System.out.println("r1's getClass = " + r1.getClass().getSuperclass());

	}

}
