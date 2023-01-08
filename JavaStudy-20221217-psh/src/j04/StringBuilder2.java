package j04;

public class StringBuilder2 {
	public static void main(String args[]) {
		String name = "판사님, 검사님, 의사님";
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(name);
		
		int index = 0;
		
		index = stringBuilder.toString().indexOf("님");
		stringBuilder.delete(index, index+3);
		
		index = stringBuilder.toString().indexOf("님");
		stringBuilder.delete(index, index+3);
		
		index = stringBuilder.toString().indexOf("님");
		stringBuilder.delete(index, index+3);
		
		System.out.println(stringBuilder.toString());
	}

}
