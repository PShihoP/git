package j08_method;

public class MethodTwo {
	// 메소드 종류
	// 반환, 매개변수 없는 메소드
	
	public static void test1() {
		System.out.println("test1 메소드 호출");
		return;
	}
	
	// 반환X, 매개변수 하나인 메소드
	
	public static void test2(int num) {
		System.out.println("num : " + num);
		System.out.println("test2 메소드 호출");
	}
	
	// 반환X, 매개변수 둘인 메소드
	public static void test3(int num, int num2) {
		System.out.println("num : " + num);
		System.out.println("num2 : " + num2);
		System.out.println("test3 메소드 호출");
	}
	
	// 반환O, 매개변수X 인 메소드
	
	public static int test4() {
		System.out.println("test4 메소드 호출");
		return 100;
	}
	
	// 반환O, 매개변수O 인 메소드
	public static String test5(String name, int index) {
		
		System.out.println("name : " + name);
		System.out.println("index : " + index);
		return name + index;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2(100);
		test3(100, 200);
		int a = test4();
		
		System.out.println(a);
		
		System.out.println(test4());
		
		System.out.println(test5("상훈", 1));
	}

}
