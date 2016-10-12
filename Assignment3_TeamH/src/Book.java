
public class Book extends Item{

	public Book(String title, double price) {
		super(title, price);
	}

	public void showPreview(){
		System.out.println("showPreview");
	}
}
