
public class EStore {
	public static void main(String[]args){
		Customer customer1 = new Customer("Ana","ajgarcia","honeyButterBiscuit","Wallaby 42, Sydney");
		CreditCard card1 = new CreditCard(13456789,"08/2020", 123);
		System.out.println(customer1.getName());
		System.out.println(customer1.getUserName());
		System.out.println(customer1.getPassword());
		System.out.println(customer1.getHomeAddress());
		System.out.println();
		
		customer1.addCreditCard(card1);
		customer1.printCardList();
		System.out.println();
		
		Manager manager1 = new Manager("Pepe","pepe10","handsomePepe","123456");
		System.out.println(manager1.getName());
		System.out.println(manager1.getUserName());
		System.out.println(manager1.getPassword());
		System.out.println(manager1.getEmployeeID());
		System.out.println();
		
		Book book1 = new Book("The Old Man and the Sea",10.00);
		System.out.println(book1.getTitle());
		System.out.println(book1.getPrice());
		System.out.println();
		
		MusicCD cd1 = new MusicCD("Absolution",20.00);
		System.out.println(cd1.getTitle());
		System.out.println(cd1.getPrice());
		System.out.println();
		
		ComputerSoftware sw1 = new ComputerSoftware("VMware",200.00);
		System.out.println(sw1.getTitle());
		System.out.println(sw1.getPrice());
		System.out.println();
		
		customer1.addToCart(book1);
		customer1.addToCart(cd1);
		customer1.addToCart(sw1);
		customer1.printCartContents();
		
	}
}
// hello poochy 