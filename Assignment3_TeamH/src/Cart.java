import java.util.HashSet;
import java.util.Iterator;

public class Cart {
	HashSet<Item> shoppingCart;

	public Cart() {
		shoppingCart = new HashSet<Item>();
	}

	public void addToCart(Item t){
		shoppingCart.add(t);
		System.out.println("Item " + t.getItemType() + " was added to cart");
	}

	public double calculateCombinedPrice(){
		double totalPrice = 0.0;
		for(Iterator it=shoppingCart.iterator(); it.hasNext();){
			Item item = (Item)it.next();
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}
	
	public void printCartContents(){
		for(Iterator it=shoppingCart.iterator(); it.hasNext();){
			//System.out.println("Printing cart contents");
			Item item = (Item)it.next();
			System.out.println("Item is a  " + item.getItemType());
			//System.out.println("Title" + item.getTitle());
			System.out.println("Price: "+ item.getPrice());
		}		
	}

	public void orderByPrice(){
		System.out.println("orderByPrice");
	}

}
