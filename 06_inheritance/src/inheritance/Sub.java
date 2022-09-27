package inheritance;

public class Sub extends Super {
	protected String name;
	protected int age;
	
	public Sub() {
		System.out.println("Sub 기본 생성자");
	}
	public Sub(String name , int age , double weight , double height) {
		System.out.println("Sub 생성자");
		this.name = name;
		this.age = age;
		super.weight = weight;			//	this.weight = weight;
		super.height = height;			//	this.height = height;
	}
	void output() {
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
		System.out.println("몸무게 = "+weight);
		System.out.println("키 = "+height);
	}
	public static void main(String[] args) {
		Sub s = new Sub("홍길동",25,70.5,182.3);
		s.disp();
		System.out.println();
		s.output();
		System.out.println("--------------------");
		Super u = new Sub("코난",13,35.6,152.7);//Super를 참조
		u.disp();
//		u.output();//Super를 참조하기때문에 Sub의 함수를 호출할수 없믐
	}

}
