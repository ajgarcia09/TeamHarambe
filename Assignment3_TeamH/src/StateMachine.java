import java.util.*;

public class StateMachine {
	public static boolean recoveryFailure = false;
	public static String currentState = "Normal State";
	public static Scanner scan = new Scanner(System.in);

	
	public static void main (String [] args){
		doThisNow();
	}
	
	public static void doThisNow() {
		while(recoveryFailure == false){
			printCurrentState();
			if(currentState.equals("Normal State")){
				normalState();
			}
			
			else if(currentState.equals("Recovery Identification")){
				Recovery_Identification_State();
			}
			
			else if(currentState.equals("Pressure Recovery")){
				Presure_Recovery_State();
			}
			
			else if(currentState.equals("Temperature Recovery")){
				Temperature_Recovery_State();
			}
		}
		System.out.println("End of the simulation");
	}
	
	private static void Presure_Recovery_State() {
		System.out.println("");
		System.out.println("Your event options are: ");
		System.out.println("            s)   Recovery Success");
		System.out.println("            f)   Recovery Failure");
		
		System.out.println("Choose an option: ");
		char event = scan.next().charAt(0);
		
		if((event == 's') || (event == 'S')){
			currentState = "Normal State";
			return;
		}
		
		else if((event == 'f') || (event == 'F')){
			recoveryFailure = true;
			return;
		}
	}
	
	private static void Temperature_Recovery_State() {
		System.out.println("");
		System.out.println("Your event options are: ");
		System.out.println("            s)   Recovery Success");
		System.out.println("            f)   Recovery Failure");
		
		System.out.println("Choose an option: ");
		char event = scan.next().charAt(0);
		
		if((event == 's') || (event == 'S')){
			currentState = "Normal State";
			return;
		}
		
		else if((event == 'f') || (event == 'F')){
			recoveryFailure = true;
			return;
		}
	}
	
	public static void Recovery_Identification_State(){
		System.out.println("");
		System.out.println("Your event options are: ");
		System.out.println("            p)   Pressure");
		System.out.println("            t)   Temperature");
		System.out.println("            f)   Recovery Failure");
		
		System.out.println("Choose an option: ");
		char event = scan.next().charAt(0);
		
		if((event == 'p') || (event == 'P')){
			currentState = "Pressure Recovery";
			return;
		}
		
		if((event == 't') || (event == 'T')){
			currentState = "Temperature Recovery";
			return;
		}
		
		else if((event == 'f') || (event == 'F')){
			recoveryFailure = true;
			return;
		}
	}
	
	public static void normalState(){
		System.out.println("");
		System.out.println("Your event options are: ");
		System.out.println("            a)   Anomaly");
		
		System.out.println("Choose an option: ");
		char chosenEvent = scan.next().charAt(0);
		
		if((chosenEvent == 'a') || (chosenEvent == 'A'))
			currentState = "Recovery Identification";
	}
	
	public static void printCurrentState() {
		System.out.println("-----------------------------");
		System.out.println("Current State: "+ currentState);
	}

}
