package tasksOn23121997;
import java.util.Scanner;

public class FindDaysInMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the month number: ");
		int month = sc.nextInt();
		System.out.print("Please enter the year: ");
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0 || year % 400 ==0 ) && month == 2) {
			System.out.println("29 Days");
		} else {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 ||month == 12) {
				System.out.println("31 Days");
			} else {
				System.out.println("30 Days");
			}
		}
		sc.close();
	}

}
