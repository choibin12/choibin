package ch04;

import java.util.Arrays;

public class Arr08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// index:0~2 3개
		String []strarr = {"가위","바위","보"};
		System.out.println(Arrays.toString(strarr));
		for(int i =0; i<10; i++) {
		int a = (int)(Math.random()*3);
		int b = (int)(Math.random()*3);
		System.out.println("a : "+strarr[a]);
		System.out.println("b : "+strarr[b]);
		
			if(a==0) {
				if (b==0) { 
					System.out.println("비겻습니다");
				}
				else if (b==1) { 
					System.out.println("b승");
				}
				else if (b==2) { 
					System.out.println("a승");
				}
				
			}

			if(a==1) {
				if (b==0) { 
					System.out.println("a승");
				}
				else if (b==1) { 
					System.out.println("비겻습니다");
				}
				else if (b==2) { 
					System.out.println("b승");
				}
				
			}

			if(a==2) {
				if (b==0) { 
					System.out.println("b승");
				}
				else if (b==1) { 
					System.out.println("a승");
				}
				else if (b==2) { 
					System.out.println("비겻습니다");
				}
				
			}
			
	
		}
	}

}
