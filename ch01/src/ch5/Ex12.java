package ch5;
class Car{
	String color;
	String gearType;
	int door;
	Car(){}
	Car(String a, String b, int c){
		color = a;
		gearType = b;
		door = c;
	}
	
}
public class Ex12 {

	public static void main(String[] args) {
		Car a = new Car("white","auto",4);
		
	}

}
