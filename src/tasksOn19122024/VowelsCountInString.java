package tasksOn19122024;

public class VowelsCountInString {

	public static void main(String[] args) {
		String w = "Hello World!";
		
		int vowelsCount = 0;
		
		for (int i = 0; i < w.length(); i++) {
			
			char l = w.charAt(i);
			
			if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
				
				vowelsCount += 1;
			}
		}
		 
		System.out.println(vowelsCount);

	}

}
