
public class Manager extends User{
	private String employerID;

	public Manager(String name, String userName, String password, String employerID) {
		super(name, userName, password);
		this.employerID = employerID;
	}
	
	public void printManagerInfo(){
		System.out.println("Manager: " + getName());
		System.out.println("Username: " + getUserName());
		System.out.println("Password: " + getPassword());
		System.out.println("EmployerID: " + getEmployerID());
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

	public String getEmployerID() {
		return employerID;
	}

}
