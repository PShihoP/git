package j06_conditional;

public class Input {

	public static void main(String[] args) {
		/*
		 * 돈 3000 이상이고 카드 유 -> 택시
		 * 돈 3000 미만이거나 카드 유 -> 버스
		 * 그렇지 않으면 걷기
		 * */
		int money = 0;
		boolean card = true;
		
		if (money > 3000 && card) {
			System.out.println("택시");
		}else if(money <= 3000 || card) {
			System.out.println("버스");
		}else {
			System.out.println("걷기");
		}
		
	}

}
