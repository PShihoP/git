package j07_repeat.Random;

import java.util.Random;

public class RandomTwoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤 10개 뽑고 가장 큰 수 출력
		
		Random random = new Random();
		
		int i = 0;
		int tmp = 0;
		
		System.out.println("뽑은 숫자들");
		
		while(i < 10) {
			int rNum = random.nextInt(10);
			
			System.out.println("tmp : " + tmp);
			System.out.println("rNum : " + rNum);
			System.out.println();
			
			
//			System.out.println(rNum);
			if (i == 0) {
				tmp = rNum;
			}else {
				if(tmp > rNum) {
					tmp = rNum;
				}
			}
			i++;
		}
		
		System.out.println("가장 큰 수는 " + tmp);

	}

}
