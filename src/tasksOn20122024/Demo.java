package tasksOn20122024;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Please Enter The Number: ");
		int n = myObj.nextInt();
		
		int r = 0;
		
		while (n > 0) {
			int lastNum = n % 10;
			r = r * 10 + lastNum;
			n = n / 10;
		}
		System.out.println(r);
		myObj.close();
		
	}
	

}
