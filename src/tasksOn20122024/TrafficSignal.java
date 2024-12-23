package tasksOn20122024;

import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {
		
		System.out.println("Please Enter the input: ");
		
		Scanner myObj = new Scanner(System.in);
		
		String signal = myObj.nextLine();
		
		
		
		if (signal.equals("red")) {
			System.out.println("Stop");
		} else if(signal.equals("yello")) {
			System.out.println("Ready");
		} else if (signal.equals("green")) {
			System.out.println("Go");
		} else {
			System.out.println("Please give valid input");
		}
		
		myObj.close();

	}

}
