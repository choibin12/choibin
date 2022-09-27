package ch6;
class Product2{
	int price;
	int bonusPoint;
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
}
class Tv2 extends Product2{
	Tv2(){super(100);}
	public String toString() {return "Tv";}
}
class Computer2 extends Product2{
	Computer2(){super(200);}
	public String toString() {return "Computer";}
}
class Audio2 extends Product2{
	Audio2(){super(50);}
	public String toString() {return "Audio";}
}
class buyer2 {
	int money = 1000;
	int bonusPoint;
	Product2[]cart = new Product2[10];//구매한 물건을 담을 배열
	int i = 0;
	void buy(Product2 x) {
		if (money<x.price) {
			System.out.println("잔액이 부족하여 물건을 구매할 수 없습니다");
			return;
		}
		money -= x.price;
		bonusPoint += x.bonusPoint;
		cart[i++] = x;
		System.out.println(x+"를/을 구매하셧습니다");
	}
	void summary() {//구매한 물품에 대한 정보를 요약해서 보여줌.
		int sum = 0; // 구입한 물품의 가격합계
		String ItemList = ""; // 구입한 물품 목록
	//반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다 
		for (int i=0; i<cart.length; i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			ItemList += cart[i]+",";
		}
		System.out.println("구매하신 물품의 총 금액은 "+sum+"만원 입니다");
		System.out.println("구매하신 제품은 "+ItemList+"입니다");
	}
}
public class Sale2 {

	public static void main(String[] args) {
		buyer2 b = new buyer2();
		b.buy(new Computer2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}

}
