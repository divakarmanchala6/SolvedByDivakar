package tasksOn23121997;

public class RemovingSpace {

	public static void main(String[] args) {
		String s = "Hello World!";
		String r = "";
		
		for (int i = 0; i<s.length(); i++) {
			if (s.charAt(i) == ' ' ) {
				//r = r + "" ;
				continue;
			} else {
				r += s.charAt(i);
			}
		}
		System.out.println(r);

	}

}
