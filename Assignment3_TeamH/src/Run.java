
public class Run extends Workout{
	
	private int numKm;
	private static int runRecord;
	
	public Run(int accountID,int duration, boolean inProgress, int numKm) {
		super(accountID, duration, inProgress);
		this.numKm = numKm;
	}

	public int getNumKm() {
		return numKm;
	}

	public int getRunRecord() {
		return runRecord;
	}

	public void setNumKm(int numKm) {
		this.numKm = numKm;
	}

	public void setRunRecord(int runRecord) {
		this.runRecord = runRecord;
	}

}
