import java.util.HashSet;
import java.util.Iterator;

/*used in the Customer Class,
 * Only one cart per customer.
 * A cart is represented by a HashSet 
 * that contains objects of type Item.
 */
public class Cart {
	HashSet<Item> shoppingCart;

	public Cart() {
		shoppingCart = new HashSet<Item>();
	}

	public void addToCart(Item t){
		shoppingCart.add(t);
		System.out.println("Item " + t.getTitle() + " was added to cart");
		System.out.println();
	}

	/* Use an iterator to traverse the HashSet,
	 * access each item's price and compute the total price
	 */
	public double calculateCombinedPrice(){
		double totalPrice = 0.0;
		for(Iterator it=shoppingCart.iterator(); it.hasNext();){
			Item item = (Item)it.next();
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}
	
	public void printCartContents(){
		System.out.println("Cart contents are: ");
		System.out.println();
		for(Iterator it=shoppingCart.iterator(); it.hasNext();){
			Item item = (Item)it.next();
			System.out.println("Item: " + item.getTitle());
			System.out.println("Price: "+ item.getPrice());
		}		
	}
	
	public void printCustomerID(Customer customer1){
		System.out.println("Customer Name: " + customer1.getName());
		System.out.println("Username: " +customer1.getUserName());
	}
	
	public void orderByPrice(){
		System.out.println("orderByPrice");
	}

}
