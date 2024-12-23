package tasksOn20122024;

public class MultiplicationTableNestedLoops {

	public static void main(String[] args) {
		int n = 1;
		int m = 10;
		
		for (int i = n; i <= m; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(n + " * " + j + " = " + n * j);
			}
			n += 1;
		}

	}

}
