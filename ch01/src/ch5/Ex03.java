package ch5;

public class Ex03 {

	public static void main(String[] args) {
		Card a = new Card();
		Card b = new Card();
		a.kind = "Heart";
		a.number = 7;
		b.kind = "Clover";
		b.number = 5;
		a.read();
		b.read();
		a.width = 50;
		a.height = 50;
		System.out.println("a의 width와height를 50,50으로 변경");
		a.read();
		b.read();
		a.height = 100;
		System.out.println("a의 height를 100으로 변경");
		b.read();
		
	}

}
class Card{
	String kind;
	int number;
	
	static int width = 100;
	static int height = 250;
	
	void read() {
		System.out.println("이 카드는 "+kind+number+" 이고 크기는(" +width+","+height+")");
	}
}
