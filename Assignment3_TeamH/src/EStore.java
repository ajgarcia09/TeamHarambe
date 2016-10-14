/*Class creates sample objects
 * to test out classes User, Customer,
 * Manager, Item, Book, MusicCD, 
 * ComputerSoftware, CreditCard, and Cart
 * to represent an electronic store. 
 */
public class EStore {
	public static void main(String[]args){
		
		Customer customer1 = createNewCustomer("Ana Garcia","ajgarcia","honeyButterBiscuit","500 Mulberry St. Springfield, IL");
		CreditCard card1 = createNewCreditCard(13456789,"08/2020", 123);
		CreditCard card2 = createNewCreditCard(98765432,"10/2025", 321);
		customer1.addCreditCard(card1);
		customer1.addCreditCard(card2);
		customer1.printCardList();
		System.out.println();
		
		Manager manager1 = createNewManager("George McFly","georgie10","back2TheFuture","123456");
		System.out.println();
		
		Book book1 = createNewBook("The Old Man and the Sea", 10.00);
		MusicCD cd1 =createNewMusicCD("Absolution", 20.00);
		ComputerSoftware sw1 = createNewSoftware("VMware",200.00);		
		
		book1.printItemType(book1);
		cd1.printItemType(cd1);
		sw1.printItemType(sw1);		
		System.out.println();
		
		customer1.addToCart(book1);
		customer1.addToCart(cd1);
		customer1.addToCart(sw1);
		customer1.printCartContents();		
		System.out.println();
		
		System.out.println("Total cost: " +
		customer1.shoppingCart.calculateCombinedPrice());
		
	}
	
	public static Customer createNewCustomer(String name, String userName, String password, String homeAddress){
		Customer customer1 = new Customer(name,userName, password, homeAddress);
		customer1.printCustomerInfo();
		System.out.println();
		return customer1;
	}
	
	public static CreditCard createNewCreditCard(int number,String expirationDate, int CVS){
		CreditCard card1 = new CreditCard(number, expirationDate, CVS);
		return card1;
	}
	
	public static Manager createNewManager(String name,String userName,String password,String employerID){
		Manager manager1 = new Manager(name, userName,password,employerID);
		manager1.printManagerInfo();
		return manager1;
	}
	
	public static Book createNewBook(String title,double price){
		Book book1 = new Book(title, price);
		System.out.println(book1.getTitle());
		System.out.println(book1.getPrice());
		System.out.println();
		return book1;
	}
	
	public static MusicCD createNewMusicCD(String title,double price){
		MusicCD cd1 = new MusicCD(title, price);
		System.out.println(cd1.getTitle());
		System.out.println(cd1.getPrice());
		System.out.println();
		return cd1;
	}
	
	public static ComputerSoftware createNewSoftware(String title, double price){
		ComputerSoftware sw1 = new ComputerSoftware(title, price);
		System.out.println(sw1.getTitle());
		System.out.println(sw1.getPrice());
		System.out.println();
		return sw1;
	}
}
