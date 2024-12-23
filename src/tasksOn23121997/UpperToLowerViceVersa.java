package tasksOn23121997;

import java.util.Scanner;

public class UpperToLowerViceVersa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		String lowerCases = "abcdefghijklmnopqrstuvwxyz";
		String upperCases = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String s = "Hello World";
		String r = "";
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < lowerCases.length(); j++) {
				if (s.charAt(i) == lowerCases.charAt(j)) {
					r += upperCases.charAt(j);
				} else if (s.charAt(i) == upperCases.charAt(j)) {
					r += lowerCases.charAt(j);
				}
			}
			if (s.charAt(i) == ' ') {
				r += ' ';
			}
		}
		System.out.println(r);
		
	}

}
