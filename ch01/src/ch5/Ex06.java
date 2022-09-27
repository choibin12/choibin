package ch5;
class Data2{int x;}
public class Ex06 {

	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = "+d.x);
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = "+d.x);
		change2(d);
		System.out.println("After change2(d)");
		System.out.println("main() : x = "+d.x);
		
		
	}
	static void change(Data2 x) {
		x.x = 1000;
		System.out.println("change() : x = "+x.x);
	}
	static void change2(Data2 x) {
		x.x = 2000;
		System.out.println("change() : x = "+x.x);
	}
	
}
