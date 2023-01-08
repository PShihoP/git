package j05_input;

import java.util.Scanner;

public class InputTwo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = null;
		int birth = 0;
		String address = null;
		String phone = null;

		
		System.out.print("이름 : ");
		name = scanner.next();
		
		System.out.print("생일 : ");
		birth = scanner.nextInt();
		
		System.out.print("주소 : ");
		// 함정이다... 버퍼 개념
		// 넥스트라인 전에는 엔터를 먹을 수 있는 넥스트라인을 적어줘야 함.
		scanner.nextLine();
		address = scanner.nextLine();
		
		System.out.print("연락처 : ");
		phone = scanner.next();
		
		System.out.println("사용자의 이름은 "+ name + "이고 생일은 " + birth + "입니다.");
		System.out.println("주소는 "+ address + "에 거주중입니다.");
		System.out.println("연락처는 "+ phone);
	}

}
