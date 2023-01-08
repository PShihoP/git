package j07_repeat.Random;

import java.util.Random;

public class RandomThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * a, b, c 값 비교
		 * 가장 큰 값을 Max
		 * 반복은 20회, 범위는 50
		 * 
		 * */

		Random random = new Random();
		
		int i = 0;
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		int max = 0;
		
		while(i < 20) {
			a = random.nextInt(50);
			b = random.nextInt(50);
			c = random.nextInt(50);
			
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
			
			// 문제를 잘못 이해했네....
			// 3개씩 계속 뽑아내서 누적해서 그 중에서 최대값을 내는 거였음
			
//			if(a > b) {
//				if(a > c) {
//					max = a;
//				}else {
//					max = c;
//				}
//			} else {
//				if(b > c) {
//					max = b;
//				}else {
//					max = c;
//				}
//			}
			
			if(a > b) {
				if(max < a) {
					max = a;
				}
			}else {
				if(max < b) {
					max = b;
				}
			}
			if(max < c) {
				max = c;
			}
			
			System.out.println("max : " + max);
			System.out.println();
			
			i++;
		}
		
		System.out.println("max : " + max);
		
	}

}
