package tasksOn20122024;

import java.util.Scanner;

public class FactorialUsingWhileLoop {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Please Enter The Number: ");
		
		int n = myObj.nextInt();
		
		
		int result = 1;
		
		while ( 0 < n) {
			result = result * n;
			n -= 1;
		}
		
		System.out.println(result);
		myObj.close();

	}

}
