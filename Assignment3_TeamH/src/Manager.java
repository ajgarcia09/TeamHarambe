
public class Manager extends User{
	private String employerID;

	public Manager(String name, String userName, String password, String employerID) {
		super(name, userName, password);
		this.employerID = employerID;
		// TODO Auto-generated constructor stub
	}
	
	public createItem(){
		System.out.println("createItem");
	}
	
	public updateItem(Item t){
		System.out.println("updateItem");
	}
	
	public deleteItem(Item t){
		System.out.println("deleteItem");
	}
	
	public createCustomer(Customer c){
		System.out.println("createCustomer");
	}
	
	public updateCustomer(Customer c){
		System.out.println("updateCustomer");
	}
	
	public deleteCustomer(Customer c){
		System.out.println("deleteCustomer");
	}
	

}
