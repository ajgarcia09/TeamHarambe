import java.util.HashSet;
import java.util.Iterator;

public class Customer extends User{
	private String homeAddress;
	HashSet<CreditCard> cardList = new HashSet<CreditCard>();
	HashSet<Item> shoppingCart = new HashSet<Item>();

	public Customer(String name, String userName, String password, String homeAddress) {
		super(name, userName, password);
		this.homeAddress = homeAddress;
		//		cardList.add(c);
	}

	public void addCreditCard(CreditCard c){
		if(cardList.size()>=1 || cardList.size() == 0){
			cardList.add(c);
			System.out.println("card added successfully");
			return;
		}
		else{
			System.out.println("Cannot remove. Must have at least 1 credit"
					+ "card on record.");
		}				
	}
	
	public void printCardList(){
		for(Iterator it=cardList.iterator(); it.hasNext();){
			CreditCard c = (CreditCard)it.next();
			System.out.println("Credit card # " + c.getNumber());
			System.out.println("Expiration date: "+ c.getExpirationDate());
			//System.out.println("");
		}
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	public void addToCart(Item t){
		shoppingCart.add(t);
		//System.out.println("Item " + t.getTitle() + " was added to cart");
	}
	
	

	public void printCartContents(){
		for(Iterator it=shoppingCart.iterator(); it.hasNext();){
			//System.out.println("Printing cart contents");
			Item item = (Item)it.next();
			//System.out.println("Item " + item.getTitle());
			System.out.println("Price: "+ item.getPrice());
			//System.out.println("");
		}		//System.out.println("addToCart");
	}

	public void checkoutCart(){
		System.out.println("checkoutCart");
	}

}
