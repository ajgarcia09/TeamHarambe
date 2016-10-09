
public class User {
	private String name;
	private String userName;
	private String password;
	
	
	public User(String name, String userName, String password) {
		this.name = name;
		this.userName = userName;
		this.password = password;
	}
	
	public String getName() {
		//System.out.println("in user superclass");
		return name;
	}
	public String getUserName() {
		//System.out.println("in user superclass");

		return userName;
	}
	public String getPassword() {
		//System.out.println("in user superclass");

		return password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	private void setPassword(String password) {
		this.password = password;
	}
	
	public void browseItem(){
		System.out.println("browseItem");
	}
	
	public void register(){
		System.out.println("register");
	}
	

}
