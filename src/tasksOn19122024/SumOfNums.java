package tasksOn19122024;


// Reference by Ravi Kumar and Java T Points

public class SumOfNums {

	public static void main(String[] args) {
		
		//here is the num is given number and initializer.
		// 
		int num = 1234, sum = 0;
		
		while (num > 0) {
			sum += num % 10; // last digit sum for every iteration.
			num /= 10; // updation 
		}
		
		System.out.println(sum);

	}
	

}
