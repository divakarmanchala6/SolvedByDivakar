package tasksOn19122024;

public class ReverseNumber {
	public static void main(String[] args) {
		int n = 123;
		int r = 0;
		
		while (n > 0) {
			int lastNum = n % 10;
			r = r * 10 + lastNum;
			n /= 10;
		}
		System.out.println(r);
	}

}
