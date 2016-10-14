
public class Item {
	private String title;
	private double price;
	
	public Item(String title, double price) {
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
	
	public void printTitle(){
		System.out.println("Item type is: "+ getTitle());
	}	
	
	/*Displays the type of item, for instance: 
	 * The Old Man and the Sea is of class Book
	 * Absolution is of class MusicCD
	 * VMware is of class ComputerSoftware 
	 */
	public void printItemType(Item item1){
		System.out.println(item1.getTitle() + " "
				+ "is of type " +  item1.getClass().getTypeName());
		
	}
}
