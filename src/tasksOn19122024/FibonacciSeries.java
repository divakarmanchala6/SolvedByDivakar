package tasksOn19122024;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int count = 10;
		int a = 0; 
		int b = 1;
		
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 2; i < count; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			
			
		}

	}

}
