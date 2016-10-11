
public class EStore {
	public static void main(String[]args){
		
		Customer customer1 = new Customer("Ana","ajgarcia","honeyButterBiscuit","Wallaby 42, Sydney");
		CreditCard card1 = new CreditCard(13456789,"08/2020", 123);
		CreditCard card2 = new CreditCard(98765432,"10/2025", 321);
		System.out.println("Name: " + customer1.getName());
		System.out.println("Username: " +customer1.getUserName());
		System.out.println("Password: " +customer1.getPassword());
		System.out.println("Home Address: " +customer1.getHomeAddress());
		System.out.println();
		
		customer1.addCreditCard(card1);
		customer1.addCreditCard(card2);
		customer1.printCardList();
		System.out.println();
		
		Manager manager1 = new Manager("Pepe","pepe10","handsomePepe","123456");
		System.out.println("Manager: " +manager1.getName());
		System.out.println("Username: " +manager1.getUserName());
		System.out.println("Password: " +manager1.getPassword());
		System.out.println("EmployerID: " +manager1.getEmployerID());
		System.out.println();
		
		Book book1 = new Book("The Old Man and the Sea","Book", 10.00);
		System.out.println(book1.getItemType());
		System.out.println(book1.getTitle());
		System.out.println(book1.getPrice());
		System.out.println();
		
		MusicCD cd1 = new MusicCD("Absolution","CD",20.00);
		System.out.println(cd1.getItemType());
		System.out.println(cd1.getTitle());
		System.out.println(cd1.getPrice());
		System.out.println();
		
		ComputerSoftware sw1 = new ComputerSoftware("VMware","Software",200.00);
		System.out.println(sw1.getItemType());
		System.out.println(sw1.getTitle());
		System.out.println(sw1.getPrice());
		System.out.println();
		
		customer1.addToCart(book1);
		customer1.addToCart(cd1);
		customer1.addToCart(sw1);
		customer1.printCartContents();
		System.out.println("Total cost: " +
		customer1.shoppingCart.calculateCombinedPrice());
		
	}
}
