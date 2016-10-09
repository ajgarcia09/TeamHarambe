
public class MusicCD extends Item{
	private String title;
	private double price;
	public MusicCD(String title, double price) {
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
	
	public void playSample(){
		System.out.println("playSample");
	}
	
	

}
