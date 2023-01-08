package j06_conditional;

public class IfTwo {
	public static void main(String[] args) {
		int score = 75;
		String result = null;
		
		if(score < 0 || score > 100) {
			System.out.println("점수는 0~100점 사이여야 함.");
			result = "계산 불가";
		}else if (score > 89) {
			System.out.println("90점대");
			result = "A";
		}else if (score > 79) {
			System.out.println("80점대");
			result = "B";
		}else if (score > 69) {
			System.out.println("70점대");
			result = "C";
		}else if (score > 59) {
			System.out.println("60점대");
			result = "D";
		}else {
			System.out.println("0~59점 사이");
			result = "F";
		}
		
		
		System.out.println("출력 : " + result);
	}
}