package com.zoo;

public class Zoo2 {

	public static void main(String[] args) {
		Zoo z = new Zoo();//같은 패키지 안에 있으므로 import할 필요가 없음
		z.tiger();
		z.elephant();
		z.giraffe();
//0		z.lion(); lion()이 private으로 잡혀있으므로 호출 불가능
		
	}

}
