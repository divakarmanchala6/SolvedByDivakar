package tasksOn20122024;

import java.util.Scanner;

public class CharacterClassification {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Please Enter the single letter: ");
		
		char n = myObj.next().charAt(0);
		
		
		
		if (n >= 'a' && n <= 'z') {
			System.out.println("Lower Case");
		} 
		
		else if (n >= 'A' && n <= 'Z') {
			System.out.println("Upper Case");
		} 
		
		else if (n >= '0' && n <= '9') {
			System.out.println("Digit");
		} 
		
		else {
			System.out.println("Special Character");
		}
		
		myObj.close();

	}

}
