
public class ComputerSoftware extends Item{
	private String title;
	private double price;
	
	public ComputerSoftware(String title, double price) {
		super(title, price);
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		//System.out.println("now in computersoftware's getTitle");
		return title;
	}

	public double getPrice() {
		return price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
