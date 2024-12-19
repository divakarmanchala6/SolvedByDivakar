package tasksOn19122024;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int n = 1;
		int m = 100;
		int sum = 0;
		
		for (int i = n; i <=m; i++ ) {
			if (i % 2 == 0 ) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

}
