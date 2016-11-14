/**Stores Activity Tracking System users' data
 * (such as sleep and exercise) in daily, 
 * weekly, and monthly views. 
 * @author Ana J. Garcia
 * @version 1.0 (11/14/2016)
 * @see DailyTrend
 * @see WeeklyTrend
 * @see MonthlyTrend
 *
 */
public class Trend {
	private int accountID;
	private int sleepTime;
	private int workoutTime;
	private int numSteps;
	private String month;
	
	public Trend(int accountID, int sleepTime, int workoutTime, int numSteps, String month) {
		this.accountID = accountID;
		this.sleepTime = sleepTime;
		this.workoutTime = workoutTime;
		this.numSteps = numSteps;
		this.month = month;
	}

	/**
	 * 
	 * @return accountID - the user's account number
	 */
	public int getAccountID() {
		return accountID;
	}

	/**
	 * 
	 * @return sleepTime - the user's total sleep time 
	 */
	public int getSleepTime() {
		return sleepTime;
	}

	/** 
	 * 
	 * @return workoutTime - the user's total workout time
	 */
	public int getWorkoutTime() {
		return workoutTime;
	}

	/**
	 * 
	 * @return numSteps - the user's total number of steps taken
	 */
	public int getNumSteps() {
		return numSteps;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public void setSleepTime(int sleepTime) {
		this.sleepTime = sleepTime;
	}

	public void setWorkoutTime(int workoutTime) {
		this.workoutTime = workoutTime;
	}

	public void setNumSteps(int numSteps) {
		this.numSteps = numSteps;
	}

}
