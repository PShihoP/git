package j07_repeat;

public class DoubleWhileTwo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		int cls = 0;
		int min1 = 0;
		int min2 = 0;
		
//		while(i < 4) {
//			cls = i + 1;
//			System.out.println(cls + "교시");
//			
//			while(j < 50) {
//				min1 = j + 1;
//				System.out.println("\t" + min1 + "분");
//				j++;
//			}
//			
//			System.out.println("\t10분쉬는시간");
//			
//			j = 0;
//			
//			while(j < 10) {
//				min1 = j + 1;
//				System.out.println("\t" + min1 + "분");
//				j++;
//			}
//			
//			j = 0;
//			
//			i++;
//		}
		
		// 어떻게 한번만 쓰지??
		
		while(i < 4) {
			cls = i + 1;
			System.out.println(cls + "교시");
			
			// ??
			j = 0;
			while(j < 60) {
				if(j < 50) {
					min1 = j + 1;
					System.out.println("\t" + min1 + "분");
				}else {
					if(j == 50) {
						System.out.println("\t10분쉬는시간");
					}
					min1 = j - 50 + 1;
					System.out.println("\t" + min1 + "분");
				}
				j++;
			}
			
			
			
			// ??
			
			i++;
		}
	}
}
