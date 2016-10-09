
public class Manager extends User{
	private String employeeID;

	public Manager(String name, String userName, String password, String employeeID) {
		super(name, userName, password);
		this.employeeID = employeeID;
	}
	
	public void createItem(){
		System.out.println("createItem");
	}
	
	public void updateItem(Item t){
		System.out.println("updateItem");
	}
	
	public void deleteItem(Item t){
		System.out.println("deleteItem");
	}
	
	public void createCustomer(Customer c){
		System.out.println("createCustomer");
	}
	
	public void updateCustomer(Customer c){
		System.out.println("updateCustomer");
	}
	
	public void deleteCustomer(Customer c){
		System.out.println("deleteCustomer");
	}

	public String getEmployeeID() {
		return employeeID;
	}

}
