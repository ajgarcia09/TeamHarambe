
public class Book extends Item{
	private String title;
	private double price;

	public Book(String title, double price) {
		super(title, price);
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
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
	
	public void showPreview(){
		System.out.println("showPreview");
	}
}
