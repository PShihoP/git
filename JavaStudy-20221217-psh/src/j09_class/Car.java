package j09_class;

public class Car {
	
	public Car() {
		System.out.println("생성자 호출");
		// 생성자는 무조건 주소 값을 리턴
		// 생성자는 무조건 클래스와 이름이 동일
	}
	
	String company;
	String model;
	String color;

	void showCarInfo() {
		System.out.println("회사명 : " + company);
		System.out.println("모델명 : " + model);
		System.out.println("색깔 : " + color);
		System.out.println();
	}
}
