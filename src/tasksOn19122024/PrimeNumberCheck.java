package tasksOn19122024;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		int n = 4;
		int count = 0;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count += 1;
			}
		}
		
		if (n == 0 || n == 1 ) {
			System.out.println(n + " is Not Prime Number");
		} else if (count == 0) {
			System.out.println(n + " is a Prime Number");
		} else {
			System.out.println(n + " is Not Prime Number");
		}
	}

}
