package class_;

class This{
	private int a;// private 외부에서 접근불가 data를 사용하게해주는 method를 만들어야함
	
	public void setA(int a) {
		System.out.println("this = "+this);//객체와 동일한 주소 
		this.a = a;//변수명이 같기때문에 this를 사용해서 지정
		
	}
		
	public int getA() {
		return a;//this생략
	}
	
}

public class ThisMain {

	public static void main(String[] args) {
		This t = new  This();
		System.out.println("객체 t = "+t);//객체 t 와 t안으ㅣ this
		t.setA(10);
		System.out.println(t.getA());
		
		This s = new  This();
		System.out.println("객체 s = "+s);
		s.setA(10);
		System.out.println(s.getA());
		
		
	}

}
