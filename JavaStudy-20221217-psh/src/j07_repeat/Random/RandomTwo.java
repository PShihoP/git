package j07_repeat.Random;

import java.util.Random;

public class RandomTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int rNum = random.nextInt(10);
		System.out.println(rNum);
		
		int i = 0;
		while(i < 10) {
			int rNum2 = random.nextInt(10);
			System.out.println(rNum2);
			i++;
		}
	}

}
