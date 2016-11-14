import java.util.*;

public class DailyTrend extends Trend{
	private boolean isNewDay = true;
	private int date;

	public DailyTrend(int accountID, int sleepTime, int workoutTime, int numSteps,String month,int date) {
		super(accountID,sleepTime,workoutTime,numSteps, month);
		this.date = date;		
	}
	
	public int getDate(){
		return date;
	}

	
	

	/**If data for a new day was entered,
	 * increment dayCount as long as data for 7 
	 * consecutive days hasn't been entered.
	 * If dayCount is equal to 7, then we have
	 * a week's worth of data, and we need to
	 * reset dayCount to 0 in order to store
	 * data for another week.
	 */

	
	

		
	

}
