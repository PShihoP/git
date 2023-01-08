package j06_conditional;

public class IfOne {

	public static void main(String[] args) {
		boolean money = false;
		
		if (money) {
			System.out.println("택시 탑승 가능");
		}
		if (!money) {
			System.out.println("걷기");
		}
		
		boolean money2 = false;
		if (money2) System.out.println("택시 탑승 가능");
			System.out.println("잔돈 받기");
		if (!money2) {
			System.out.println("걷기");
		}
		
		boolean money3 = false;
		
		if(money3) {
			System.out.println("택시 탑승 가능");
		}else {
			System.out.println("걷기");
		}
		
		// ctrl + shift + f : 자동정렬
		
		/*
		 * if 문 기본 구조
		 * if(조건문) {
		 * 		<수행문장>
		 *  	<수행문장>
		 * 		....
		 * }else {
		 * 		<수행문장>
		 *  	<수행문장>
		 * 		....
		 * }
		 * 
		 * */
		
	}

}
