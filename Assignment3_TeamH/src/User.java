import java.util.*;
/* TODO we need to link the user to an account
 * 
 */
/**Represents a user of the Activity Tracking System.
 * Each user has various fields and methods for
 * storing and computing sleep and workout data 
 * @author Ana J. Garcia
 * @version 1.0 (11/14/2016)
 * @see ActivityLogger
 * @see Trend
 *
 */
public class User {
	private int accountID;
	private String name;
	private String userName;
	private String email;
	private String password;
	private boolean isNewMember;
	private int age;
	private int height;
	private int weight;
	private int bmi; //TODO add method to compute BMI, metric or US system?
	private static int numDayTrends;
	private static int numWeekTrends;
	private static int numDaySleep;
	private static int numDayWorkout;
	private static int numDaySteps;
	private static int numWeekSleep;
	private static int numWeekWorkouts;
	private static int numWeekSteps;
	private ActivityLogger activityLogger = new ActivityLogger(accountID);
	private HashSet<Activity> activities = new HashSet<Activity>();
	//TODO ArrayList instead of HashSet?
	private HashSet<DailyTrend> dailyTrends = new HashSet<DailyTrend>();
	private HashSet<WeeklyTrend> weeklyTrends = new HashSet<WeeklyTrend>();
	private HashSet<MonthlyTrend> MonthlyTrends = new HashSet<MonthlyTrend>();
	
	public User(int accountID, String name, String userName, String email, String password, boolean isNewMember) {
		this.accountID = accountID;
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.isNewMember = isNewMember;
	}
	
	/**@return accountID the user's account number
	 * 
	 */

	public int getAccountID(){
		return accountID;
	}
/**
 * @return name the user's name
 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return userName the user's username
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @return email the user's email
	 */
	public String getEmail(){
		return email;
	}	
	/**
	 * @return password the user's password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return isNewMember whether the user has previously used the system or not
	 */
	public boolean getIsNewMember(){
		return isNewMember;
	}
	/**
	 * @return age the user's age
	 */
	public int getAge(){
		return age;
	}

	/**
	 * @return height the user's height
	 */
	public int getHeight(){
		return height;
	}
	/**
	 * @return weight the user's weight
	 */
	public int getWeight(){
		return weight;
	}
	/**
	 * @return bmi the user's Body Mass Index (BMI)
	 */
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
	
	//TODO	implement this. Are we using metric, or US system?
	public int computeBMI(){
		return -1;
	}
	
	/**Creates a new object of type Activity and adds
	 * it to the user's set of activities
	 * @see User#activityLogger
	 * @see User#activities
	 * @see ActivityLogger
	 */
	public void logActivity(){
		//System.out.println("now in user.logActivity");
		Activity a1 = this.activityLogger.logActivity();
		addActivity(a1);
	}

	/**Adds an activity to the user's set of activities
	 * 
	 * @param a1 an object of type Activity
	 * @see User#activities 
	 */
	public void addActivity(Activity a1){
		activities.add(a1);
	}

	/**Removes an activity from the user's set of activities
	 * 
	 * @param a1 an object of type Activity
	 * @see User#activities
	 */
	public void removeActivity(Activity a1){
		activities.remove(a1);
	}
	
	/**Print the user's logged activities
	 * by traversing its HashSet of type Activity
	 * @see User#activities
	 */
	public void printActivities(){
		System.out.println("User's logged activites: ");
		for(Iterator it = activities.iterator(); it.hasNext();){
			Activity activity = (Activity)it.next();
			activity.printActivityType(activity);
		}
	}
	
	/**Create a new Daily Trend by retrieving data
	 * from the user's set of logged activities, 
	 * increments the static field numDayTrends, and
	 * adds the new Daily Trend into the user's set
	 * of daily trends.
	 * 
	 * @return dayTrend a new object of type DailyTrend
	 * @see User#activities
	 * @see validateNumDayTrends()
	 * @see User#dailyTrends
	 * @see User#numDayTrends
	 * @see DailyTrend
	 */
	public DailyTrend newDailyTrend(){
		System.out.println("entered newDailyTrend");
		int daySleep = countDaySleepTime();
		int dayWorkout = countDayWorkoutTime();
		int daySteps = 10000; //10,000 steps, fixed value for now
		String month = "November";
		int date = 13;
		DailyTrend dayTrend = new DailyTrend(accountID, daySleep,dayWorkout,daySteps,month,date);
		validateNumDayTrends();
		dailyTrends.add(dayTrend);
		return dayTrend;
	}
	
	/**Print the user's set of DailyTrends
	 * @see User#dailyTrends
	 */
	
	public void printDailyTrends(){
		System.out.println("entered printDailyTrends");
		System.out.println();
		for(Iterator it = dailyTrends.iterator(); it.hasNext();){
			DailyTrend currentDayTrend = (DailyTrend)it.next();
			System.out.println("user: " + this.getName());
			System.out.println("accountID = " + currentDayTrend.getAccountID());
			System.out.println("month + date = " + currentDayTrend.getDate() + " " + currentDayTrend.getMonth());
			System.out.println("sleepTime = " + currentDayTrend.getSleepTime());
			System.out.println("workoutTime = " + currentDayTrend.getWorkoutTime());
			System.out.println("numSteps = " + currentDayTrend.getNumSteps());
		}
	}	

	/**Checks how many DailyTrends the user has
	 * and increments the static field numDayTrends 
	 * if the number of daily trends is between 0 and 7.
	 * Once numDayTrends has reached 7, a new Weekly Trend 
	 * is created with data from the last 7 days, and 
	 * numDayTrends is reset to 0.
	 * 
	 * @see User#numDayTrends
	 * @see newWeeklyTrend()
	 */
	private void validateNumDayTrends() { //TODO add each 
		System.out.println("entered validateNumDayTrends");
		if(numDayTrends >= 0 && numDayTrends <7)
			numDayTrends++;
		else{
			newWeeklyTrend();
			numWeekTrends++;
			numDayTrends=0;
		}
		System.out.println("numDayTrends = " + numDayTrends);
	}
	
	/**Adds the user's total sleep time within
	 * a given time frame by traversing the user's 
	 * set of Activities.
	 * @return daySleep the total amount of sleep the user had in a day
	 * @see User#activities
	 * @see Activity
	 */
	private int countDaySleepTime() {
		int daySleep =0;
		for(Iterator it = activities.iterator(); it.hasNext();){
			Activity currentActivity = (Activity)it.next();
			System.out.println("currentActivity is of type: ");
			System.out.println(currentActivity.getClass().getTypeName());
			if(currentActivity.getClass().getTypeName().equals("Sleep")){
				daySleep += currentActivity.getDuration();
				System.out.println("daySleep = " + daySleep);
			}
		}
		return daySleep;
	}
	
	/**Adds the user's total workout time within
	 * a given time frame by traversing the user's 
	 * set of Activities.
	 * @return dayWorkout the total amount of sleep the user had in a day
	 * @see User#activities
	 * @see Activity
	 */
	private int countDayWorkoutTime() {
		System.out.println("entered countDayWorkoutTime");
		int dayWorkout =0;
		for(Iterator it = activities.iterator(); it.hasNext();){
			Activity currentActivity = (Activity)it.next();
			currentActivity.printActivityType(currentActivity);
			System.out.println("current activity's duration: " + currentActivity.getDuration());
			System.out.println(currentActivity.getClass().getSuperclass());
			if(currentActivity.getClass().getSuperclass().getTypeName().equals("Workout")){
				System.out.println("entered if statement in workout");
				dayWorkout += currentActivity.getDuration();
				System.out.println("dayWorkout = " + dayWorkout);
			}
		}
		System.out.println("end of method, dayWorkout= " + dayWorkout);
		return dayWorkout;
	}
	public WeeklyTrend newWeeklyTrend(){
		return null;
	}
	
	public MonthlyTrend newMonthlyTrend(){
		return null;
	}

}
