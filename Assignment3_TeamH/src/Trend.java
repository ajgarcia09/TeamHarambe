
public class Trend {
	private int accountID;
	private int sleepTime;
	private int workoutTime;
	private int numSteps;
	
	public Trend(int accountID, int sleepTime, int workoutTime, int numSteps) {
		super();
		this.accountID = accountID;
		this.sleepTime = sleepTime;
		this.workoutTime = workoutTime;
		this.numSteps = numSteps;
	}

	public int getAccountID() {
		return accountID;
	}

	public int getSleepTime() {
		return sleepTime;
	}

	public int getWorkoutTime() {
		return workoutTime;
	}

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
