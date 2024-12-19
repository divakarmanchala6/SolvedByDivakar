package tasksOn19122024;

public class ReverseTriPattern {

	public static void main(String[] args) {
		int n = 5;
		
		for (int i = 1; n >= i; i++) {
			for (int j = n-i; j >= 0; j--) {
				System.out.print("* ");
			}
			System.out.println("");
		}

	}

}
