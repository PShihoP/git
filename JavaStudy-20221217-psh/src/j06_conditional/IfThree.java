package j06_conditional;

public class IfThree {

	public static void main(String[] args) {
		int x = -1;
		int y = 1;
		String result = null;
		
		if (x > 0 && y > 0) {
			result = "1사분면";
		}else if (x < 0 && y > 0) {
			result = "2사분면";
		}else if (x < 0 && y < 0) {
			result = "3사분면";
		}else {
			result = "4사분면";
		}
				
		System.out.println("x : " + x);
		// ctrl + alt + ↓
		System.out.println("y : " + y);
		System.out.println("결과 : " + result);

	}

}
