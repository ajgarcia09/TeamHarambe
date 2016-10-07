
public class User {
	private String name;
	private String userName;
	private String password;
	
	
	public User(String name, String userName, String password) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public String getUserName() {
		return userName;
	}
//	public String getPassword() {
//		return password;
//	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	private void setPassword(String password) {
		this.password = password;
	}
	
	public browseItem(){
		System.out.println("browseItem");
	}
	
	public register(){
		System.out.println("register");
	}
	

}
