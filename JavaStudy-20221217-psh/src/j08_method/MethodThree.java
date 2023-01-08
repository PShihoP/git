package j08_method;

public class MethodThree {

	/*
	 * 메소드 오버로딩
	 * : 매개변수의 형태가 다르면 동일한 메소드명을 사용해서
	 * 메소드를 정의할 수 있다.
	 */
	
	public static void test1() {
		System.out.println("매개변수가 없는 test1");
	}
	
	public static void test1(int num) {
		System.out.println("매개변수가 하나이고 인트 자료형인 test1");
	}
	
	public static void test1(int num, int num2) {
		System.out.println("매개변수가 둘이고 둘다 인트 자료형인 test1");
	}
	
	public static void test1(int num, String str) {
		System.out.println("매개변수가 둘이고 첫번째 매개변수는 인트, "
				+ "두번째 매개변수는 스트링인 test1");
	}
	
	public static void test1(String str, int num) {
		System.out.println("매개변수가 둘이고 첫번째 매개변수는 스트링, "
				+ "두번째 매개변수는 인트인 test1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test1(1);
		test1(1, 2);
		test1(1, "야");
		test1("야", 1);
	}

}
