package ch03;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop1 : for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					
//						break Loop1;
//						break;						
//						continue;
//						continue Loop1;
						System.out.println(i+"*"+j+"="+i*j);
				}
		}System.out.println("끝");

	}

}
