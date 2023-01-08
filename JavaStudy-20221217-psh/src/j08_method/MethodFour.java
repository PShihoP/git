package j08_method;

public class MethodFour {

	// 오버로드 시 매개 변수가 작은 것부터 위에서 써주는 것이 좋다
	public static String add(int a) {
		System.out.println("한개의 수를 받았습니다.");
		return "한개 수의 덧셈은 안됩니다.";
	}

	
	public static int add(int a, int b) {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println();
		
		return a + b;
	}
	
	public static int add(int a, int b, int c) {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println();
		
		return a + b + c;
	}
	
	/*
	 * 매개변수 1개만 던진다면
	 * 1. syso(add(5));
	 * 
	 * 한개의 수를 받았습니다.
	 * 한개 수의 덧셈은 안됩니다.
	 * 
	 * 2. add(5);
	 * 
	 * 한개의 수를 받았습니다.
	 * 
	 * */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2,3));
		System.out.println();
		System.out.println(add(5,6));

		System.out.println();
		
		System.out.println(add(5));
		System.out.println();
		add(5);
	}
	
	

}
