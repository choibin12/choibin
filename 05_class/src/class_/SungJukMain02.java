package class_;

public class SungJukMain02 {

	public static void main(String[] args) {
		SungJuk aa = new SungJuk();
		SungJuk [] ar = new SungJuk[3];// 객체배열
		ar[0] = new SungJuk();
		ar[1] = new SungJuk();
		ar[2] = new SungJuk();
		ar[0].setData("홍길동",55,77,83);
		ar[1].setData("프로도", 100, 89, 75);
		ar[2].setData("죠르디", 75, 80, 48);
			for(int i = 0; i<ar.length; i++) {
				ar[i].calc();
				ar[i].print();
			}
			System.out.println();
			for(SungJuk d : ar) {
				d.calc();
				d.print();
			}
	}

}
