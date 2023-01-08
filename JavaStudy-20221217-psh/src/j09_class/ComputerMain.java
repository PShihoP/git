package j09_class;

public class ComputerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Computer());
		System.out.println(new Computer());
		
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		
		c1.cpu = "i7";
		c2.cpu = "i5";
		
		c1.showInfo();
		System.out.println();
		c2.showInfo();
		
		c1.company = "삼성";
		c1.ram = 8;
		c1.year = 2022;
		c1.Graphic = "RTX3060";
		
		c2.company = "LG";
		c2.ram = 16;
		c2.year = 2021;
		c2.Graphic = "GTX1080";
		
		c1.showInfo();
		System.out.println();
		c2.showInfo();
		
		c1.addRam(30);
		c1.showInfo();
		c2.addRam(20);
		c2.showInfo();
		
		c2.removeRam(15);
		c2.showInfo();
		c2.removeRam(21);
		c2.showInfo();
	}

}
