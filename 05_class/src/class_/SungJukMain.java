package class_;

public class SungJukMain {

	public static void main(String[] args) {
		SungJuk s = new SungJuk();
		s.setData("홍길동",55,77,83);
		s.calc();
		System.out.println("----------------------------------------------------\r\n"
			+ "이름\t국어\t영어\t수학\t총점\t평균\t학점\r\n"
			+ "----------------------------------------------------");	
		System.out.println(s.getName()+"\t"+s.getKor()+"\t"+s.getEng()+"\t"
			+s.getMath()+"\t"+s.getTot()+"\t"+String.format("%.2f", s.getAvg())+"\t"+s.getGrade());
		//-----------------
		SungJuk c = new SungJuk();
		c.setData("프로도", 100, 89, 75);
		c.calc();
		c.print();
		SungJuk d = new SungJuk();
		d.setData("죠르디", 75, 80, 48);
		d.calc();
		d.print();
		
	}
	

}
/*[실행결과]
----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동   90      95      100
*/