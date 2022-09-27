package ch6;
class MyPoint{
	int x;
	int y;
}
//class Circle extends MyPoint{//상속
//	int r;
//}
class Circle{//포함
	MyPoint p = new MyPoint();
	int r;
}
public class Ex01 {
		

	public static void main(String[] args) {
			Circle c = new Circle();
			c.p.x = 2;
			c.p.y = 3;
			c.r = 4;
			System.out.println("c.x = "+c.p.x);
			System.out.println("c.y = "+c.p.y);
			System.out.println("c.r = "+c.r);
	}

}
