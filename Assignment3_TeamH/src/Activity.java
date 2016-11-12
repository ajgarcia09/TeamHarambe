/**Superclass activity that allows for the 
 * creation of various Activites
 * @author Ana J. Garcia
 * @version 1.0 (11/11/2016)
 * 
 *
 */
public class Activity {
	private int accountID;
	private int duration;
	private boolean inProgress;
	
	public Activity(int accountID, int duration, boolean inProgress) {
		super();
		this.accountID = accountID;
		this.duration = duration;
		this.inProgress = inProgress;
	}

	public int getAccountID() {
		return accountID;
	}

	public int getDuration() {
		return duration;
	}

	public boolean isInProgress() {
		return inProgress;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setInProgress(boolean inProgress) {
		this.inProgress = inProgress;
	}
	
	/**Prints the subclass type of an 
	 * instance of type activity 
	 * @param activity1 an activity whose type needs to be printed
	 * @see User.java
	 */
	public void printActivityType(Activity activity1){
		System.out.println("Activity is of type:  " +  activity1.getClass().getTypeName());
		
	}
	
}
