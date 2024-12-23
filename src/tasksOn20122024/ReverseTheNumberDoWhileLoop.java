package tasksOn20122024;

import java.util.Scanner;

public class ReverseTheNumberDoWhileLoop {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Please Enter the Input: ");
		
		int n = myObj.nextInt();
	
		
		
		int r = 0;
		do {
			int lastNum = n % 10;
			n /= 10;
			r = r * 10 + lastNum;
		} while (n > 0);
		
		myObj.close();
		
		System.out.println(r);

	}

}
