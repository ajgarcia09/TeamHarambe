
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/** An account class to register and log in user.
 * 
 * @author Hector Cervantes
 *  @version 1.0 (11/10/16)
 *  @since version 1.0
 */

public class Account {
	static int id;
	static String email;
	static String password;

	/** Asks user whether to sign in or sign up
	 * @throws FileNotFoundException if file is not found or does not exist
	 * */
	public static boolean logInPage(boolean test, int operation) throws FileNotFoundException{
		boolean isUsingApp = true;
		boolean signedIn = false;
		Scanner input = new Scanner(System.in);
		int operation1 = 0;
		while(isUsingApp){
			if(test){
				operation1 = operation;
			}
			else{
			System.out.println("What operation would you like to do?");
			System.out.println("Enter 1 to sign in");
			System.out.println("Enter 2 to create account");
			System.out.println("Enter any other number to exit program");
			operation1 = input.nextInt();
			}
			if(operation1 == 1){
				if(!test){
				retrieveAccountID();
				}// used to retrieve user info
				if(id != 0){
					System.out.println("You have signed inn. This is your user ID:" + id);
					return true;
				}
				System.out.println(" ");
			}
			else if(operation1 == 2){
				if(!test){
					createAccount();
				}
				return true;
			}
			else{
				isUsingApp = false;
				
			}
		}
		
		return false;
	}
	/** Asks user for log in information to retrieve id.
	 * @throws FileNotFoundException if file is not found or does not exist
	 * */
	public static void retrieveAccountID() throws FileNotFoundException{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your email: ");
		email = input.nextLine();
		System.out.println("Enter your password: ");
		password = input.nextLine();
		id = getAccountID();
		int id2 = id;
		
		//User user1 = new User(id);
	}
	
	/** Checks if a user exists within the text file, if so 
	 * returns the user id.
	 * @throws FileNotFoundException if file is not found or does not exist
	 * @return user id to retrieve user information 
	 * @see Accounts.txt 
	 * */
	public static int getAccountID() throws FileNotFoundException{
		
		try {
			File testFile = new File("Accounts.txt");
			Scanner readFile = new Scanner(testFile);

			while(readFile.hasNextLine()){
				String name = readFile.nextLine();
				String email2 = readFile.nextLine();
				String password2 = readFile.nextLine();
				id= readFile.nextInt();
				boolean checkEmail = checkEmailExists();
				if(!checkEmail){
					System.out.println("Your account does not exist");
					readFile.close();
					return 0;
				}
				if(email2.equals(email) && password2.equals(password)){
					readFile.close();
					return id;
				}
				readFile.nextLine();
			}
			readFile.close();
		} 
		catch (NoSuchElementException e) {
			System.out.println("Either your email or password is incorrect. Please sign inn again.");
			System.out.println();
			return 0;

		}

		return 0;
	}
	/** Creates a user account with email, password and user ID. If the email entered does not 
	 * exist in the system, it wont create the account.
	 * @throws FileNotFoundException if file is not found or does not exist
	 * @see Accounts.txt
	 * */
	public static void createAccount() throws FileNotFoundException{

		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter your full name:");
		String name = input.nextLine();
		System.out.println("Please Enter email:");
		email = input.nextLine();
		boolean accountExists = checkEmailExists();
		if(accountExists){
			System.out.println("Your account exists");
			return;
		}
		System.out.println("Please enter your password: ");
		String firstPassword = input.nextLine();
		System.out.println("Please re-enter your password: ");
		String reEnteredPassword = input.nextLine();
		if(!firstPassword.equals(reEnteredPassword)){
			System.out.println("The passwords did not match");
			boolean run = true;
			while(run){
				System.out.println("Please enter password:");
				firstPassword = input.nextLine();
				System.out.println("Please re-enter password");
				reEnteredPassword = input.nextLine();
				if(firstPassword == reEnteredPassword){
					run = false;
				}
			}
		}
		Random number = new Random();
		id = number.nextInt((999999999 - 100000000) + 1) + 1000000000;
		String idString = Integer.toString(id);
		try{
			File f = new File("Accounts.txt");
			FileWriter fileWritter = new FileWriter(f.getName(),true);
			BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
			bufferWritter.newLine();
			bufferWritter.append(name);
			bufferWritter.newLine();
			bufferWritter.append(email);
			bufferWritter.newLine();
			bufferWritter.append(firstPassword);
			bufferWritter.newLine();
			bufferWritter.append(idString);
			bufferWritter.close();
		}catch(IOException e1){
			e1.printStackTrace();
		}
		System.out.println("Your account has been created");
		System.out.println(" ");
	}

	/** Checks if an email exists to prevent duplicate emails.
	 * @throws FileNotFoundException if file is not found or does not exist
	 * @return true if email exists in the text file
	 * @see Accounts.txt
	 * */
	public static boolean checkEmailExists() {
		try{
			try{
				File testFile = new File("Accounts.txt");
				Scanner readFile = new Scanner(testFile);
				String currentLine;
				while(readFile.hasNext()){
					String name = readFile.nextLine();
					String email2 = readFile.nextLine();
					String password2 = readFile.nextLine();
					id = readFile.nextInt();
					if(email2.equals(email)){
						return true;
					}
					readFile.nextLine();
				}
				readFile.close();
			}
			catch(NoSuchElementException e1){
				return false;
			}
		}
		catch(FileNotFoundException e2){
			System.out.println("No file found");
		}
		return false;
	}
	
	/** Updates the value of email
	 * @parameter it takes in the new email
	 * */
	public void setEmail(String e){
		email = e;
	}
	
	/** Returns the value of email
	 * @return user email 
	 * */
	public String getEmail(){
		return email;
	}
	
	/** Updates the value of password
	 * @parameter it takes in the new password
	 * */
	public void setPassword(String p ){
		password = p;
	}
	
	/** Returns the value of email
	 * @return user password
	 * */
	public String getPassword(){
		return password;
	}
	/** Updates user id
	 * @param new id
	 * */
	public void setID(int i) {
		id = i;
		
	}
	
}