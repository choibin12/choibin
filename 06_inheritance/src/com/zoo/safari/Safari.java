package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{

	public static void main(String[] args) {
		Zoo z = new Zoo();//Zoo로 생성하면 protected method 호출 불가
		z.tiger();
//		z.giraffe();
//		z.elephant(); 
//		z.lion();  
		System.out.println();
		
		Safari f = new Safari();//상속받았기때문에 protected method 호출 가능
		f.tiger();
		f.giraffe();
//		f.elephant(); default는 같은 패키지까지 가능
//		f.lion(); // private 
	}

}
