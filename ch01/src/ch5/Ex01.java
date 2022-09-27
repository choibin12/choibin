package ch5;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Tv t = new Tv();
		t.channel = 7;
		
		System.out.println("현재 채널은 "+t.channel+"입니다.");
		t.channelDown();
		System.out.println("현재 채널은 "+t.channel+"입니다.");
		System.out.printf("Tv의 색을 입력 하십시오 : ");
		t.color = sc.nextLine();
		System.out.println("현재 Tv의 색상은 "+t.color+"입니다");
	}

}
class Tv{
	//Tv의 속성
	String color;
	boolean power;
	int channel;
	//Tv의 기능
	void power() {power = !power;} //Tv를 켜꺼나 끄는 기능
	void channelUp() { ++channel;} //Tv 채널 높이기
	void channelDown() { --channel;} //Tv 채널 낮추기
}
