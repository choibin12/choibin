package ch5;//overloading 한클래스 안에 같은 이름의 메서드 여러 개 정의
//ex.   
//void println()
//void println(boolean x)
//void println(char x)
//void println(char[]x)
//void println(double x)
//void println(float x)......
class MyMath3{
	int add(int a,int b) {
		System.out.print("int add(int a, int b) -");
		return a+b;
	}
	long add (long a , long b) {
		System.out.print("long add(long a,long b) -");
		return a+b;
		
	}
	int add (int[] a) { // 배열의 모든 요소의 합을 결과로 돌려준다
		System.out.print("int add(int [] a) -");
		int result = 0;
		for(int i=0; i<a.length; i++) 
			result+=a[i];
		return result;
		
	}
}
public class Ex10 {

	public static void main(String[] args) {
		MyMath3 a = new MyMath3();
		// The method add(int,long) is ambiguous for the type MyMath3
		System.out.println("a.add(3,3) 의 결과 : "+a.add(3,3));
		System.out.println("a.add(3L,3) 의 결과 : "+a.add(3L,3));
		System.out.println("a.add(3,3) 의 결과 : "+a.add(3,3L));
		System.out.println("a.add(3,3) 의 결과 : "+a.add(3L,3L));
		int[] b = {100,200,300};
		System.out.println("a.add(b)의 결과 : "+a.add(b));
	}

}
