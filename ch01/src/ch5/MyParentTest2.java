package ch5;

import ch6.MyParent;

class MyChild extends ch6.MyParent{
	public void printMembers() {
//에러	System.out.println(prv);
//에러	System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
	
}
public class MyParentTest2 {

	public static void main(String[] args) {
		 MyChild c = new MyChild();
//에러		System.out.println(c.prv);
//에러		System.out.println(c.dft);
//에러		System.out.println(c.prt);
			System.out.println(c.pub);
		
	}
}
