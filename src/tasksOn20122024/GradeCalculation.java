package tasksOn20122024;

import java.util.Scanner;

public class GradeCalculation {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Please Enter The Marks: ");
		
		int m = myObj.nextInt();
		
		
		
		if (m >= 90 && m <= 100) {
			System.out.println("A");
		}
		
		else if (m >= 80 && m <= 89) {
			System.out.println("B");
		} 
		
		else if (m >= 70 && m <= 79) {
			System.out.println("C");
		}
		
		else if (m >= 60 && m <= 69) {
			System.out.println("D");
		} 
		
		else if (m>= 0 && m <= 59) {
			System.out.println("F");
		} 
		
		else {
			System.out.println("Please give valid marks");
		}
		
		myObj.close();

	}

}
