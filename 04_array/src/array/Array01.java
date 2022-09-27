package array;
/*
 * int[]ar = {10, 20, 30};//객체
 * int ar;
 * ar = new int[3];
 * int[]ar = new int[]{10,20,30}
 */
public class Array01 {

	public static void main(String[] args) {
		int[]ar;//배열 선언
		ar = new int[5];//생성
		ar[0]=25;
		ar[1]=78;
		ar[2]=30;
		ar[3]=43;
		ar[4]=52;
		System.out.println("배열명 ar = "+ar);
		System.out.println("배열 크기 = "+ar.length);
		for(int i=0; i<ar.length; i++) {//i가 ar의 길이보다 작을때까지
			System.out.println("ar["+i+"] = "+ar[i]);
		}
		System.out.println();	
		
		System.out.println("거꾸로 출력");
		for(int i=(ar.length-1); i>=0; i--) {
			System.out.println("ar["+i+"] = "+ar[i]);
		}
		System.out.println();
		
		System.out.println("짝수 데이터만");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2==0)
				System.out.println("ar["+i+"] = "+ar[i]);
		}
		System.out.println();
		
		System.out.println("확장 for문");
		for(int data : ar) {
			if(data%2==0) System.out.println(data);
		}
//		ar.length라고 안써도 배열의 크기만큼 for문이 반복된다
	}

}
