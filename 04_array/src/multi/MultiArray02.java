package multi;

public class MultiArray02 {

	public static void main(String[] args) {
		// String.format(null, args) null 에 형태 args 에 값
		int [][]ar = new int [10][10];
		int num = 0;
//		for(int i = 0; i<ar.length; i++) {
//			for(int j = 0; j<ar[i].length; j++) {
//				num++;
//				ar[j][i]=num;//1,11,21,31~91순으로 찍히게
//			}
//		} 
//		for(int i = 0; i<ar.length; i++) {//ar[0][0]부터 [9][9]로 입력
//			for(int j = 0; j<ar[i].length; j++) {
//				num++;
//				ar[i][j]=num;
//			}
//		} 
		for(int i = ar.length-1; i>=0; i--) {//ar[9][9]부터 [0][0]로 입력
			for(int j = ar[i].length-1; j>=0; j--) {
				num++;
				ar[i][j]=num;
			}
		} 
		for(int i = 0; i<ar.length; i++) {//ar[]의 길이만큼진행
			for(int j = 0; j<ar[i].length; j++) {//ar[i][]의 길이만큼진행
				System.out.print(String.format("%4d", ar[i][j]));//출력
			}
			System.out.println();//ar[i][9] 이후 줄바꾸기
		} 
	}
}
