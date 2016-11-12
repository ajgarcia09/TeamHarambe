
public class Swim extends Workout{
	private int numCycles;
	private int numStyles;
	private int numLaps;
	private boolean freeStyle;
	private boolean butterfly;
	private boolean backStroke;
	private boolean breastStroke;
	
	public Swim(int accountID, int duration, boolean inProgress) {
		super(accountID, duration, inProgress);
	}	

	public int getNumCycles() {
		return numCycles;
	}

	public int getNumStyles() {
		return numStyles;
	}

	public boolean isFreeStyle() {
		return freeStyle;
	}

	public boolean isButterfly() {
		return butterfly;
	}

	public boolean isBackStroke() {
		return backStroke;
	}

	public boolean isBreastStroke() {
		return breastStroke;
	}

	public void setNumCycles(int numCycles) {
		this.numCycles = numCycles;
	}

	public void setNumStyles(int numStyles) {
		this.numStyles = numStyles;
	}

	public void setFreeStyle(boolean freeStyle) {
		this.freeStyle = freeStyle;
	}

	public void setButterfly(boolean butterfly) {
		this.butterfly = butterfly;
	}

	public void setBackStroke(boolean backStroke) {
		this.backStroke = backStroke;
	}

	public void setBreastStroke(boolean breastStroke) {
		this.breastStroke = breastStroke;
	}

	public int getNumLaps() {
		return numLaps;
	}

	public void setNumLaps(int numLaps) {
		this.numLaps = numLaps;
	}

}
