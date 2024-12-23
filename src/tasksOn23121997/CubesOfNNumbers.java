package tasksOn23121997;
import java.util.Scanner;

public class CubesOfNNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int n = sc.nextInt();
		int m = 1;
		while (n > 0) {
			System.out.println("Number is : " + m + "a nd cube of " + m + " is : " + (m*m*m));
			n -= 1;
			m +=1 ;
		}
		sc.close();
		

	}

}
