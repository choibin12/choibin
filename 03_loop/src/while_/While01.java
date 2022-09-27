package while_;

public class While01 {

	public static void main(String[] args) {
		int i =1;//초기치
		//1~10까지
		while(i<=10) {//조건
			System.out.print(i+" ");
			i++;//증감치 
		}
		System.out.println();
		int b=0;
		while(b<10) {
			b++;
			System.out.print(b+" ");
		}
		System.out.println();
		int c=0;
		while(true) {//무한루프
			c++;
			System.out.print(c+" ");
			if(c==10) break; //c가 10일때 while문 탈출
		}
		
	}

}
