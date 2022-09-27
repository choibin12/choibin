package abstract_;

import java.util.Scanner;

abstract class ShapeTest{//추상클래스
	protected double area;
	protected Scanner sc = new Scanner(System.in);

	public ShapeTest() {
		System.out.println("ShapeTest 기본생성자");

	}

	public abstract void calcArea();//추상메서드

	public abstract void dispArea();//추상메서드
}
//--------------------
class SamTest extends ShapeTest{
	protected int base,height;
	public SamTest() {
		System.out.print("밑변 : ");
		base = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();

	}
	@Override //
	public void calcArea() {
		area = base*height/2.0;
	}
	@Override
	public void dispArea() {
		System.out.println("삼각형 넓이 : "+area);

	}
}

class SaTest extends ShapeTest{
	protected int width,height;
	public SaTest() {
		System.out.print("가로 : ");
		width = sc.nextInt();
		System.out.print("세로 : ");
		height = sc.nextInt();

	}
	@Override
	public void calcArea() {
		area = width*height;
	}
	@Override
	public void dispArea() {
		System.out.println("사각형 넓이 : "+area);

	}
}

class SadariTest extends ShapeTest{
	protected int top,bottom,height;
	public SadariTest() {
		System.out.print("윗변 : ");
		top = sc.nextInt();
		System.out.print("밑변 : ");
		bottom = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();

	}
	@Override
	public void calcArea() {
		area = (top+bottom)*height/2.0;
	}
	@Override
	public void dispArea() {
		System.out.println("사다리꼴 넓이 : "+area);

	}
}
//--------------------
public class ShapeMain {

	public static void main(String[] args) {
//		SamTest sam = new SamTest();
//		sam.calcArea();
//		sam.dispArea();
//		System.out.println();
//		
//		SaTest sa = new SaTest();
//		sa.calcArea();
//		sa.dispArea();
//		System.out.println();
//		
//		SadariTest sadari = new SadariTest();
//		sadari.calcArea();
//		sadari.dispArea();
		/* 부모는 모든 자식클래스를 참조 가능
		 * 부모 = 자식 가능
		 * 자식 = 부모 불가능
		 * 자식 = (자식)부모 ->downCast 가능 형변환이 있어야 자식클래스로 부모클래스 참조 가능
		 * 
		 */
		//결합도 낮추기
		ShapeTest shape;
		shape = new SamTest();//부모 = 자식, 다형성
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SaTest();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new SadariTest();
		shape.calcArea();
		shape.dispArea();
	}
}