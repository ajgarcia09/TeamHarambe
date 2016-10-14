
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Account {
	static int id;
	static String email;
	static String password;

	public static void main(String[] args) throws FileNotFoundException{

			boolean isUsingApp = true;
			while(isUsingApp){
				Scanner input = new Scanner(System.in);
				System.out.println("What operation would you like to do?");
				System.out.println("Enter 1 to sign in");
				System.out.println("Enter 2 to create account");
				System.out.println("Enter any other number to exit program");
				int operation = input.nextInt();
				if(operation == 1){
					 getAccountID2();
					int signInn = id;
					if(id != 0)
						System.out.println("You have signed inn. This is your user ID:" + signInn);
					    System.out.println(" ");
					}
				else if(operation == 2){
					createAccount();
				}
				else{
					isUsingApp = false;
				}
			}
	}

	public static void getAccountID2() throws FileNotFoundException{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your email: ");
		email = input.nextLine();
		System.out.println("Enter your password: ");
		password = input.nextLine();
		id = getAccountID();
		int id2 = id;
		//User user1 = new User(id);
	}

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

	public static boolean checkAccountExists() throws FileNotFoundException{
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
					readFile.nextLine();
					if(email2.equals(email) && password2.equals(password)){
						return true;
					}
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
}


