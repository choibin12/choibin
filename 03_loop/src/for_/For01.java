package for_;

public class For01 {

	public static void main(String[] args) {
		int i;
		for( i=0; i<10; i++) {
			System.out.println("Hello Java : "+i);
		}
		System.out.println();
		//10,9,8,7....1
		for( i=10; i>0; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		//A B C D E F ...Z
		for(i='A'; i<='Z'; i++) {
			System.out.print((char)i+" ");
		}
	}	
		
	
}
