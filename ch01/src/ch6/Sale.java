package ch6;
class Product{
	int price;// 제품가격
	int bonusPoint;//제품구매시 부여하는 보너스
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);//보너스 점수는 제품 가격의10%
	}
}
class Tv extends Product{
	Tv() {
		super(100);
	}
	public String toString() {return "티비";}
}
class Computer extends Product{
	Computer(){super(200);}
	public String toString() {return "컴퓨터";}
}
class Audio extends Product{
	Audio(){super(50);}
	public String toString() {return "오디오";}
}
class Buyer {
	int money = 1000;
	int bonusPoint;
	Product[]cart = new Product[10];//구매한 물건을 담을 배열
	int i = 0;
	void buy(Product x ) {
		if(money < x.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다");
			return;
		}
		
		money-=x.price;
		bonusPoint+=x.bonusPoint;
		cart[i++] = x;
		System.out.println(x+"을/를 구입하셧습니다.");
	}
	
}
public class Sale {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Tv());
		System.out.println("현재 남은돈은 "+b.money+"만원입니다");
		System.out.println("현재 보너스 점수는 "+b.bonusPoint+"점입니다");
		
	}

}
