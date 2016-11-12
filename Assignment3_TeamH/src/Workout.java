/** A subclass of Activity that allows
 * creation of different kinds of workouts
 * @author Ana J. Garcia
 * @see Activity.java
 * @see Run.java
 * @see Swim.java
 *
 */
public class Workout extends Activity{	
	
	public Workout(int accountID, int duration, boolean inProgress) {
		super(accountID, duration, inProgress);		
	}
}	
