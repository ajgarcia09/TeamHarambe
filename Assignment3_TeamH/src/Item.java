
public class Item {
	private String itempType;
	private double price;
	
	public Item(String itempType, double price) {
		this.itempType = itempType;
		this.price = price;
	}

	public String getItemType() {
		return itempType;
	}

	public double getPrice() {
		return price;
	}

	public void setitempType(String itempType) {
		this.itempType = itempType;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printItemType(){
		System.out.println("Item type is: "+ getItemType());
	}	
}
