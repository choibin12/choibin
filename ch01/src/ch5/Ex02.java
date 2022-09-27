package ch5;

import java.util.Scanner;
class time {
	Scanner sc = new Scanner(System.in);
	int[] hour = new int[3];
	int[] minute = new int[3];
	int[] second = new int[3];
	
	void timerandom() {
		for(int i=0; i<hour.length; i++) {
			hour[i] = (int)(Math.random()*12+1);
		}
		for(int i=0; i<minute.length; i++) {
			minute[i] = (int)(Math.random()*60+1);
		}
		for(int i=0; i<second.length; i++) {
			second[i] = (int)(Math.random()*60+1);
		}
			
	
	}
	
	void timereading() {
		
		int i = sc.nextInt()-1;
		System.out.println((i+1)+"번 에 저장된 시간은"+hour[i]+"시 "+minute[i]+"분 "+second[i]+"초입니다.");
	
}
}



public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		time t = new time();
		t.timerandom();
		t.timereading();
		
		
	}

}
