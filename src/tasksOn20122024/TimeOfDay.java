package tasksOn20122024;

import java.util.Scanner;

public class TimeOfDay {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Please enter the time between 0 to 23: ");
		
		int t = myObj.nextInt();
		
		
		if (t >=0 && t <= 23 ) {
			if (t >= 5  && t <= 11) {
				System.out.println("Morning");
			}
			
			else if (t >=12 && t <= 17 ) {
				System.out.println("Afternoon");
			}
			
			else if (t >=18 && t <= 21 ) {
				System.out.println("Evening");
			}
			
			else if (t >= 22 || t <= 4) {
				System.out.println("Good Night");
			}
		}
		else {
			System.out.println("Please give the number in between 0 to 23");
		}
		
		myObj.close();
		

	}

}
