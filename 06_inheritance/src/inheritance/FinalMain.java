package inheritance;
enum Color{
	RED,GREEN,BLUE
}
class Final{
		public final String FRUIT = "사과";
		public final String FRUIT2;
		public static final String ANIMAL = "사자";
		public static final String ANIMAL2;//static은 생성자안에서 초기화불가하고 static 영역에서 초기화 가능
//		public static final int RED = 0;
//		public static final int GREEN = 1;
//		public static final int BLUE = 2;
		
		Final(){
			this.FRUIT2 = "딸기";
		}
		static {
			ANIMAL2 = "기린";
		}
	}


public class FinalMain {//final 클래스는 상속불가

	public static void main(String[] args) {
		final int AGE = 10;
		System.out.println("AGE = "+AGE);
//		AGE = 20; //final상수는 변경불가
		final int AGE2;
		AGE2 = 20; //초기화 기회 1번
//		AGE2 = 30; 에러  이미 위에서 초기화 되었기때문에 변경불가
		System.out.println("AGE2 = "+AGE2);
		System.out.println();
		
		Final f = new Final();
		System.out.println("FRUIT = "+f.FRUIT);
		System.out.println("FRUIT2 = "+f.FRUIT2);
		System.out.println();
		System.out.println("ANIMAL = "+Final.ANIMAL);
		System.out.println("ANIMAL2 = "+Final.ANIMAL2);
		System.out.println();
//		System.out.println("빨강 = "+Color.RED);
//		System.out.println("빨강 = "+Color.BLUE);
//		System.out.println("빨강 = "+Color.GREEN);
		System.out.println();
//		-------------------------------
		for(Color data : Color.values()) {
			System.out.println(data.ordinal()+" : "+data);
		}
	}

}
