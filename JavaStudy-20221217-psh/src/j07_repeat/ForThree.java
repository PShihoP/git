package j07_repeat;

public class ForThree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * str = abcdefghijk
		 * 
		 * a
		 * b
		 * c
		 * ....
		 * k
		 * 
		 */
		
		String str = "abcdefghijk";
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(i, i + 1));
		}
		
	}
}
