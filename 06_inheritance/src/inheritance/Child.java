package inheritance;

public class Child extends Super{
	protected String name;
	protected int age;
	public Child() {
		System.out.println("Child 기본 생성자");
	}
	public Child(String name , int age,double weight,double height) {
		super(weight, height);
		System.out.println("Child 생성자");
		this.name = name;
		this.age = age;
//		super.weight = weight;//this.weight == weight;
//		super.height = height;//this.height == height;
	}
	public void disp() {//override 우선권은 상속받은 클래스가 갖는다 부모와 자식의 접근제어자가 같아도 되지만 상속받는 클래스의 접근제어자범위가 더 커야함	
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
		System.out.println("몸무게 = "+weight);
		System.out.println("키 = "+height);
	}
	
	public static void main(String[] args) {
		Child c = new Child("홍길동", 27, 75, 185);
		c.disp();
		System.out.println();
		
		Super h = new Child("코난",13,36.5,152.7);
		h.disp();
	}

}
