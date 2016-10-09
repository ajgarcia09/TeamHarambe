import java.util.*;

public class CreditCard {
	private int number;
	private String expirationDate;
	private int CVS;
	
	public CreditCard(int number, String expirationDate, int cVS) {
		this.number = number;
		this.expirationDate = expirationDate;
		CVS = cVS;
	}

	public int getNumber() {
		return number;
	}

	public String getExpirationDate() {
		return expirationDate;
	}
	
	
	


}
