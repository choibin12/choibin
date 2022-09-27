package ch6;
import java.util.*;
class Point2{
	int x;
	int y;
	Point2(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x :"+x+", y :"+y;
	}
}
class Point3D2 extends Point2{
	int z;
	Point3D2(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	public String toString() {
		return "x :"+x+", y :"+y+", z :"+z;
	}
}
public class OverrideTest2 {

	public static void main(String[] args) {
		Point2 b = new Point2(5,4);
		System.out.println(b);
		Point3D2 a = new Point3D2(0,0,4);
		
		System.out.println(a);
		// TODO Auto-generated method stub

	}

}
