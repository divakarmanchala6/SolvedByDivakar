package tasksOn19122024;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 153;
		int m = n;
		int aN = 0;
		
		while (0 < m) {
			int individualNum = m % 10;
			aN += individualNum * individualNum * individualNum  ;
			m /= 10;
			
		}
		
		if (n == aN ) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}

	}

}
