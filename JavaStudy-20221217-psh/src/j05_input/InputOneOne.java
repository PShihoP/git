package j05_input;

import java.util.Scanner;

public class InputOneOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String str = null;
		int num = 0;
		
		System.out.print("내용 입력 : ");
		str = scanner.nextLine();
		System.out.print("내용 입력 : ");
		num = scanner.nextInt();
		
		System.out.println("출력 : " + str);
		System.out.println("출력2 : " + num);
	}

}
