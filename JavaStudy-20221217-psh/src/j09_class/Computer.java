package j09_class;

public class Computer {
	int year;
	String company;
	String cpu;
	int ram;
	String Graphic;
	
	void showInfo() {
		System.out.println("제조년: " + year + "년");
		System.out.println("제조사: " + company);
		System.out.println("cpu: " + cpu);
		System.out.println("RAM: " + ram);
		System.out.println("그래픽카드: " + Graphic);
		System.out.println();
	}
	
	void removeRam(int gigaByte) {
		if(ram > 1) {
			ram -= gigaByte;
			if(ram < 1) {
				System.out.println("램은 최소 1기가바이트 이상 장착할 것");
			}
		}else {
			System.out.println("램 제거 못하겠음");
		}
	}
	
	void addRam(int gigaByte) {
		int overRam = ram;
		if(ram < 32 ) {
			ram += gigaByte;
			if(ram > 32) {
				overRam = ram - 32;
				System.out.println("램은 최대 32기가바이트 이상 장착할 수 없음(" + overRam + "기가바이트 초과)");
			}
		}else {
			System.out.println("램 추가 불가");
		}
	}
}
