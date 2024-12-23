package tasksOn23121997;
import java.util.Scanner;

public class SumAndAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the 1st input: ");
		int a = sc.nextInt();
		
		System.out.print("Please enter the 2nd  input: ");
		int b = sc.nextInt();
		
		System.out.print("Please enter the 3rd input: ");
		int c = sc.nextInt();
		
		System.out.print("Please enter the 4th input: ");
		int d = sc.nextInt();
		
		System.out.print("Please enter the 5th input: ");
		int e = sc.nextInt();
		
		int sum = a + b + c + d + e;
		double avg  = (double) sum / 5;
		
		System.out.println("The sum of 5 no is: " + sum);
		System.out.println("The avarage is: " + avg);
		
		sc.close();

	}

}
