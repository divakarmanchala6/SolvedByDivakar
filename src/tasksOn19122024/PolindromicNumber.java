package tasksOn19122024;

public class PolindromicNumber {

	public static void main(String[] args) {
		
		int z = 12121;
		int n = z;
		int m = 0;
		
		
		
		
		while (n > 0) {
			int lastNum = n % 10;
			m = m * 10 + lastNum;
			n /= 10;
		}
		
		
		if (z == m) {
			System.out.println("Polindromic");
		} else {
			System.out.println("Not Polindromic");
		}
		
	}

}
