package j07_repeat;

public class WhileFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단
		
		int dan = 2;
		int num = 0;
		
		// 클린 코딩??
		
		// 1번
		while(num < 9) {
			System.out.println(dan + " x " + (num + 1) + " = " + (dan * (num + 1)));
			num++;
		}
		
		// 2번
		
		num = 0;
		int realNum = 0;
		
		while(num < 9) {
			realNum = num + 1;
			System.out.println(dan + " x " + realNum + " = " + (dan * realNum));
			num++;
		}
		
		

	}

}
