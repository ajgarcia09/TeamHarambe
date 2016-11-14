import java.util.*;

public class DailyTrend extends Trend{
	private boolean isNewDay = true;
	private int date;
//	private static int dayCount;
//	private static int weekSleep;
//	private static int weekWorkouts;
//	private static int weekSteps;
//	private boolean reachedWeek; 	
//	private HashMap<String, Integer> dailySleepTime = new HashMap<String, Integer>();
//	private HashMap<String, Integer> dailyWorkoutTime = new HashMap<String, Integer>();
//	private HashMap<String, Integer> dailyStepCount = new HashMap<String, Integer>();
//	
	public DailyTrend(int accountID, int sleepTime, int workoutTime, int numSteps,String month,int date) {
		super(accountID,sleepTime,workoutTime,numSteps, month);
		this.date = date;
//		dailySleepTime.put(date, sleepTime);
//		dailyWorkoutTime.put(date, workoutTime);
//		dailyStepCount.put(date, numSteps);
		//checkDayCount();		
	}

	/**If data for a new day was entered,
	 * increment dayCount as long as data for 7 
	 * consecutive days hasn't been entered.
	 * If dayCount is equal to 7, then we have
	 * a week's worth of data, and we need to
	 * reset dayCount to 0 in order to store
	 * data for another week.
	 */
//	private void checkDayCount() {
//		if(dayCount >= 0 && dayCount < 7){
//			dayCount++;
//			incrementWeekSleep();
//			incrementWeekWorkouts();
//			incrementWeekSteps();
//		}
//		else{
//			reachedWeek = true;
//			weekSleep = 0;
//			weekWorkouts =0;
//			weekSteps =0;			
//			dayCount = 0;
//		}		
//	}

//	private void incrementWeekSteps() {
//		for(Iterator it= dailyStepCount.keySet().iterator();it.hasNext();){
//			int todaySteps = 
//		}
//		
//	}
//
//	private void incrementWeekWorkouts() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private void incrementWeekSleep() {
//		// TODO Auto-generated method stub
//		
//	}
	
	

		
	

}
