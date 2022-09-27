package array;

public class Array02 {

	public static void main(String[] args) {
		String[]ar = {"사자","코끼리","호랑이","카멜레온","오리너구리","기린","원숭이"};
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar["+i+"] = "+ar[i]);
			System.out.println("ar["+i+"] 의 크기 = "+ar[i].length());
			System.out.println("첫번째 문자 = "+ar[i].charAt(0));//문자열의 0번째문자
			System.out.println("마지막 문자 = "+ar[i].charAt(ar[i].length()-1));//문자열 길이-1=문자열의 마지막 문자
			System.out.println();
		}
		System.out.println();
		
		System.out.println("확장형 for문");
		for(String data : ar) {
			System.out.println(data);
		}
	}

}
