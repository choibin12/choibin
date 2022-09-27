package operator;

public class Boxing {

	public static void main(String[] args) {
		int a = 25;
		double b = (double)a/3; //8 = 정수/정수 Casting(강제 형변환)
		System.out.println(b);
		String c = "25";
//		int d = (int)c; -- error
		int d = Integer.parseInt(c);
		System.out.println(d);
		//AutoBoxing
		int e = 5;
		Integer f = e; //jDK5.0부터 가능 , 서로 같은 타입만가능
		System.out.println(f);
		/* int e = 5;
		 * Integer g = new Integer(e);//JDK5.0이전버전 
		 */
		Integer h = 5;
		int i = h;// unAutoBoxing
//		int j = h.intValue();//JDK5.0 이전
	}

}
