package ch01;

public class VarEX2 {

	public static void main(String[] args) {
		int x = 'A';
		System.out.println(x);
		System.out.println(x+5);
		boolean power = true;
		System.out.println(power);
		byte b = 127;
		System.out.println(x+b);
		int oct = 010;
		int hex = 0x10;
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(oct+hex);
		long l = 10_000_000_000L;
		float y = 3.14f;
		double z = 3.45;
		System.out.println(y*z);
		System.out.println(y+z);
		System.out.println(String.format("%.2f",y/z));
		System.out.println(y-z);
		
		

	}

}
