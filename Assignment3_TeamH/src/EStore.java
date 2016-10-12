
public class EStore {
	public static void main(String[]args){
		
		Customer customer1 = new Customer("Ana","ajgarcia","honeyButterBiscuit","Wallaby 42, Sydney");
		CreditCard card1 = new CreditCard(13456789,"08/2020", 123);
		CreditCard card2 = new CreditCard(98765432,"10/2025", 321);
		customer1.printCustomerInfo();
		System.out.println();
		
		//Cart.printCustomerID(customer1);
		
		customer1.addCreditCard(card1);
		customer1.addCreditCard(card2);
		customer1.printCardList();
		System.out.println();
		
		Manager manager1 = new Manager("Pepe","pepe10","handsomePepe","123456");
		manager1.printManagerInfo();
		System.out.println();
		
		Book book1 = new Book("The Old Man and the Sea", 10.00);
		System.out.println(book1.getTitle());
		System.out.println(book1.getPrice());
		System.out.println();
		
		System.out.println("Book1 is of: " + book1.getClass());
		System.out.println("Test from Item class:  ");
		book1.printItemType(book1);
		
		MusicCD cd1 = new MusicCD("Absolution", 20.00);
		System.out.println(cd1.getTitle());
		System.out.println(cd1.getPrice());
		System.out.println();
		
		System.out.println("cd1 is of: " + cd1.getClass());

		
		ComputerSoftware sw1 = new ComputerSoftware("VMware",200.00);
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
