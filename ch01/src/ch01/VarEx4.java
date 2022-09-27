package ch01;

public class VarEx4 {

	public static void main(String[] args) {
//변수값 교환 x,y 값이있을때 x에서 z y에서 x
//
		int x = 10 , y=20;
		int tmp;
		tmp=x;//x의 값을 tmp에 저장
		x=y;//y값을 x에 저장
		y=tmp;//tmp의 값을 y에저장
		System.out.println("x="+x);
		System.out.println("y="+y);
		
	}

}
