import java.util.HashSet;
import java.util.Iterator;

/*Customer is subclass of superclass User.
 * Customer has a Cart instance, shoppingCart, 
 * (which is a HashSet of type Item) and a 
 * HashSet of type CreditCard which saves all the
 * credit cards associated with a particular customer 
 */
public class Customer extends User{
	private String homeAddress;
	Cart shoppingCart;
	HashSet<CreditCard> cardList = new HashSet<CreditCard>();

	public Customer(String name, String userName, String password, String homeAddress) {
		super(name, userName, password);//calls the constructor in the superclass (User)
		this.homeAddress = homeAddress;
		shoppingCart = new Cart();//initializes a new, empty cart
	}
	
	//add a new CreditCard into the cardList HashSet
	public void addCreditCard(CreditCard c){
		cardList.add(c);
	}

	//Use an Iterator to traverse the HashSet
	public void printCardList(){
		for(Iterator it=cardList.iterator(); it.hasNext();){
			CreditCard c = (CreditCard)it.next();
			System.out.println("Credit card # " + c.getNumber());
			System.out.println("Expiration date: "+ c.getExpirationDate());
		}
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public void addToCart(Item t){
		shoppingCart.addToCart(t);
	}	

	public void checkoutCart(){
		System.out.println("checkoutCart");
	}

	public void printCartContents() {
		shoppingCart.printCartContents();		
	}
}
