package tasksOn19122024;

public class PrimeNumbersRange {

	public static void main(String[] args) {
		int n = 3; 
		int m = 13;
		
		if (n < m ) {
			for (int i = n; i <= m; i++) {
				int count = 0;
				for (int j = 2; i > j; j++) {
					if (i % j == 0) {
						count+=1;
					}
				}
				if (count == 0) {
					System.out.println(i);
				}
				
			}
		} else {
			System.out.println("Please give valid inputs");
		}

	}

}
