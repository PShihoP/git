package j06_conditional;

public class SwitchCase {

	public static void main(String[] args) {
		// 시작점 잡고 밑의 문들을 다 실행할 때 switch문 실행
		
//		switch ("30") {
//		case "10":
//			System.out.println("10");
//			break;
//		case "20":
//			System.out.println("20");
////			break;
//		case "30":
//			System.out.println("30");
////			break;
//		case "40":
//			System.out.println("40");
//			break;
//		case "50":
//			System.out.println("50");
////			break;
//		} 
		String select = "30";
		switch (select) {
		case "10":
			System.out.println("10");
//			break;
		case "20":
			System.out.println("20");
//			break;
		case "30":
			System.out.println("30");
//			break;
		case "40":
			System.out.println("40");
//			break;
		case "50":
			System.out.println("50");
//			break;
		default :
			System.out.println("그 외 실행");
		// 디폴트는 해당값이 없을 때도 무조건 실행
		} 
	}

}
