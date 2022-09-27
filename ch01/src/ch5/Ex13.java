package ch5;
class Car2{
	String color;
	String geartype;
	int door;
	Car2(){//다른 생성자 호출시 첫 줄에서만 사용가능, 생성자에서 다른 생성자 호출 할때 this사용
		this("white","auto",4);
	}
	Car2(String color){
		this(color,"auto",4);
		
	}
	Car2(String color,String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
}
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
