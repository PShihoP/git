package j08_method;

public class MethodOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		
		System.out.println(num1 + " + " + num2 + " = " + sum + "이다.");
	}
	
	// 같게 안 적어주는게 좋다. 헷갈림...
	public static int add (int n1, int n2) {
		int res = n1 + n2;
		return res;
	}

}
