import java.util.Scanner;
/**Used to log activities such 
 * as exercise and sleep on the user's
 * account. Each user has one ActivityLogger
 * @author Ana J. Garcia
 * @version 1.0 (11/11/2016)
 * @see User.java
 * @see Activity.java 
 *
 */
public class ActivityLogger {
	private int accountID;
	public Scanner userInput = new Scanner(System.in);

	public ActivityLogger(int accountID) {
		this.accountID = accountID;
	}
/**Return an Activity logged by the user 
 * @return an instance of Activity (Workout or Sleep) 
 * 		   or null if there was an error logging in an activity
 * @see logWorkout()
 * @see logSleep()
 * 
 */
	public Activity logActivity(){
		System.out.println("What kind of activity would you like to log?");
		String choice = userInput.nextLine();
		if(choice.equals("workout")){
			Workout w1 = logWorkout();
			return w1;
		}			
		if(choice.equals("sleep")){
			Sleep s1 = logSleep();
			return s1;
		}
		else{
			System.out.println("Couldn't log activity");
		}
		
		return null;
	}
/**Return an instance of Workout
 * 
 * @return Run, Swim (Workout subclasses) or null if there was an error creating a new instance of type Workout
 * @see logRun()
 * @see logSwim()
 */
	private Workout logWorkout (){
		System.out.println("What kind of workout did you do?");
		String workoutChoice = userInput.nextLine();
		if(workoutChoice.equals("run")){
			Run r1 =  logRun();
			return r1;
		}
		if(workoutChoice.equals("swim")){
			Swim sw1 = logSwim();		
			return sw1;
		}
		return null;
	}

	/**Prompt the user for details 
	 * on his or her run and return an 
	 * instance of Run 
	 * @return r1, a newly created Run instance
	 * @see Run.java
	 */
	private Run logRun(){
		System.out.println("Run duration in minutes: ");
		int duration = userInput.nextInt();
		System.out.println("Number of Km run: ");
		int km = userInput.nextInt();
		Run r1 = new Run (accountID, duration, false, km);
		return r1;
	}

	private Swim logSwim(){
		System.out.println("Swim duration in minutes: ");
		int duration = userInput.nextInt();
		System.out.println("Number of laps: ");
		int numLaps = userInput.nextInt();
		System.out.println("Number of cycles: ");
		int numCycles = userInput.nextInt();
		Swim sw1 = new Swim(accountID,duration,false);
		sw1.setNumLaps(numLaps);
		if(numCycles > 0){
			sw1.setNumCycles(numCycles);
		}
		return sw1;		
	}

	public Sleep logSleep(){
		boolean isNap = false;
		System.out.println("Would you like to log a nap?: ");
		String nap = userInput.nextLine();
		if(nap.equals("yes"))
			isNap = true;
		System.out.println("Length of sleep in minutes: ");
		int duration = userInput.nextInt();
		Sleep s1 = new Sleep(accountID, duration, false, isNap);
		return s1;
	}



}