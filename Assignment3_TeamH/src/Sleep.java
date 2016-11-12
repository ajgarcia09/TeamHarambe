
public class Sleep extends Activity{
	
	private int alarm;
	private boolean isNap;
	
	public Sleep(int accountID, int duration, boolean inProgress, boolean isNap) {
		super(accountID, duration, inProgress);
		this.isNap = isNap;
	}

	public int getalarm() {
		return alarm;
	}

	public boolean isNap() {
		return isNap;
	}

	public void setalarm(int alarm) {
		this.alarm = alarm;
	}

	public void setNap(boolean isNap) {
		this.isNap = isNap;
	}
	
	
	
	
	
	

}
