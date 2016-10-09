
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
		
		Manager manager1 = new Manager("Pepe","pepe10","handsomePepe","123456");
		System.out.println(manager1.getName());
		System.out.println(manager1.getUserName());
		System.out.println(manager1.getPassword());
		System.out.println(manager1.getEmployeeID());
		
	}
}
// hello poochy 