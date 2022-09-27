package ch6;
class Car{
	String color;
	int door;
	void Drive(){
		System.out.println("부릉");
	}
	void Stop() {
		System.out.println("멈춤");
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("물발사");
	}
}
public class Ex02 {

	public static void main(String[] args) {
		Car car = new Car();
		FireEngine f = new FireEngine();
		FireEngine f2 = new FireEngine();
		f.water();
		car = f;//형변환(Car)생략
//		car.water();//컴파일에러Car타입 참조변수로 water()를호출할수 없음
		f2 = (FireEngine) car;//조상타입에서 자손타입은 형변환 생략 불가
		f2.water();
		Car car2 = new Car();
//		car2.Drive(); //NullPointerException발생.		
		
	}

}
