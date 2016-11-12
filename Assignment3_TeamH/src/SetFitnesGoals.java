import java.util.*;
public class SetFitnesGoals {
	public static Scanner scan = new Scanner (System.in);
	
	public static char workoutType;
	public static boolean swimFlag = false;
	public static int num_Goal_Cycles;
	public static int [] swim_Style_Goal = new int [5];
	public static boolean isCycle;
	public static int swimRecord = 0;
	public static int numStyles;
	
	public static int numKmGoal;
	
	public static int numCycles;
	public static int [] swimStyle = new int[5];
	
	public static int numKm;
	public static int runRecord = 0;

	public static void main (String [] args){
		getRandomData();
		//Is the goal 
		selectWorkoutType();
		doThisFirst();
		if(swimFlag == true){
			if(isCycle == false)
				printCycleFalse();
			else
				printCycleTrue();
		}
		else
			printNumKm();
	}

	private static void printNumKm() {
		System.out.println("Congratulations!");
		System.out.println("You run " + numKm);
		
		int diff = numKmGoal - numKm;
		
		if(diff >=0 ){
			System.out.println("You were " + diff + " Km short of your goal!");
			System.out.println("Keep it up!!!");
		}
		
		else if(diff ==0){
			System.out.println("You reach your goal!");
			System.out.println("Congratulations!");
		}
		else if(diff <0){
			System.out.println("Congratulations! you set a new record!");
			runRecord = numKm;
		}
		
	}

	private static void getRandomData() {
		
		numCycles = 1 + (int)(Math.random() * ((10 - 1) + 1));
		
		for(int i = 0; i < swim_Style_Goal.length; i++)
			swimStyle[i] = 0 + (int)(Math.random() * ((7 - 0) + 0));
		
		numKm = 1 + (int)(Math.random() * ((100 - 1) + 1));
	}

	private static void printCycleFalse() {
		for(int i = 0; i < swimStyle.length; i++){
			if(i < numStyles){
				System.out.print("For Style number: "+(i+1) );
				System.out.println(" You did: " + swimStyle[i] + " Laps");
			}
		}
	}

	private static void printCycleTrue() {
		System.out.println("Congratulations!");
		System.out.println("You did " + numCycles + " number of Cycles!");
		
		int diff = num_Goal_Cycles - numCycles;
		
		if(diff >=0 ){
			System.out.println("You were " + diff + " Km short of your goal!");
			System.out.println("Keep it up!!!");
		}
		
		else if(diff ==0){
			System.out.println("You reach your goal!");
			System.out.println("Congratulations!");
		}
		else if(diff <0){
			System.out.println("Congratulations! you set a new record!");
			swimRecord = numCycles;
		}
	}
	
	private static void doThisFirst() {
		if(workoutType == 'S' || workoutType == 's'){
			swimFlag = true;
			swimWorkout();
		}
		
		else if(workoutType == 'R' || workoutType == 'r')
			runWorkout();
		
	}

	private static void runWorkout() {
		System.out.println("How many Kilometers will you run?");
		int runKm = scan.nextInt();
		numKmGoal = runKm;		
	}

	private static void swimWorkout() {
	//	Scanner scan = new Scanner (System.in);
		
		System.out.println("Will you be swimming cycles? ");
		char isCycles = scan.next().charAt(0);
		System.out.println("");
		if(isCycles == 'N' || isCycles == 'n'){
			isCycle = false;
			noCycle();
		}
		if(isCycles == 'Y' || isCycles == 'y'){
			isCycle = true;
			yesCycle();
		}
		//scan.close();
	}
	
	private static void yesCycle() {
		//Scanner scan = new Scanner (System.in);
		System.out.println("A cycle is back, breast, free, fly");
		System.out.println("How many Cycles will you swim?");
		int numLaps = scan.nextInt();
		num_Goal_Cycles = numLaps;
	//	swimFlag = "isInteger";
		//scan.close();
	}

	private static void noCycle(){
	//	Scanner scan = new Scanner (System.in);
		
		System.out.println("How many styles of Swimming will you be swimming? ");
		 numStyles = scan.nextInt();
		System.out.println("");
		System.out.println("Which Styles will you be swimming?");
		System.out.println("1)  FreeStyle");
		System.out.println("2)  Back Stroke");
		System.out.println("3)  Breast Stroke");
		System.out.println("4)  Butterfly Stroke");
		
		for(int i = 0; i < numStyles; i++){
			System.out.println("Which would be your "+(i+1)+" style?");
			int SS = scan.nextInt();
			System.out.println("Enter the number of laps you wish to do: ");
			int lapGoal = scan.nextInt();
			swim_Style_Goal[SS] = lapGoal;
		}
	//	scan.close();
	//	swimFlag = "isArray";
	}

	private static void selectWorkoutType() {
	//	Scanner scan = new Scanner (System.in);
		
		System.out.println("Select Workout Type:");
		System.out.println("");
		System.out.println("| R)   Running |");
		System.out.println("| S)   Swimming|");
		workoutType = scan.next().charAt(0);
		
	//	scan.close();
	}
}

