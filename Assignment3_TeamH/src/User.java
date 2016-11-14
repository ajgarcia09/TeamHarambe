import java.util.*;
/*we need to link the user an account
 * 
 */
public class User {
	public int accountID;
	private String name;
	private String userName;
	private String email;
	private String password;
	private boolean isNewMember;
	private int age;
	private int height;
	private int weight;
	private int bmi;
	private ActivityLogger activityLogger = new ActivityLogger(accountID);
	HashSet<Activity> activities = new HashSet<Activity>();

	public User(int accountID, String name, String userName, String email, String password, boolean isNewMember) {
		this.accountID = accountID;
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.isNewMember = isNewMember;
	}

	public int getAccountID(){
		return accountID;
	}

	public String getName() {
		return name;
	}
	public String getUserName() {
		return userName;
	}
	public String getEmail(){
		return email;
	}	

	public String getPassword() {
		return password;
	}

	public boolean getIsNewMember(){
		return isNewMember;
	}

	public int getAge(){
		return age;
	}

	public int getHeight(){
		return height;
	}

	public int getWeight(){
		return weight;
	}

	public int getBmi(){
		return bmi;
	}	

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setNewMember(boolean isNewMember) {
		this.isNewMember = isNewMember;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setBmi(int bmi) {
		this.bmi = bmi;
	}
	
	public void logActivity(){
		//System.out.println("now in user.logActivity");
		Activity a1 = this.activityLogger.logActivity();
		addActivity(a1);
	}

	public void addActivity(Activity a1){
		activities.add(a1);
	}

	public void removeActivity(Activity a1){
		activities.remove(a1);
	}
	
	/**Print the user's logged activities
	 * by traversing its HashSet of type Activity
	 * @see #activityLogger
	 */
	public void printActivities(){
		System.out.println("User's logged activites: ");
		for(Iterator it = activities.iterator(); it.hasNext();){
			Activity activity = (Activity)it.next();
			activity.printActivityType(activity);
		}
	}

}
