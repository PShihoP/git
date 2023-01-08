package j07_repeat;

import java.util.Scanner;

public class WhileThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("반복회수 입력 : ");
		
		int n = 0;
		n = scanner.nextInt();
		
		int i = 0;
		
		while(i < n) {
			System.out.println("i = " + (i + 1));
			i++;
		}
		
		System.out.println("---------------------");
		
		i = 0;
		
		while(i < n) {
			System.out.println("i = " + (n - i));
			i++;
		}
	}

}
