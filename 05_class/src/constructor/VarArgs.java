package constructor;

public class VarArgs {
//	int sum(int a,int b) {
//		return  a+b;
//	}
//	int sum(int a,int b, int c) {
//		return a+b+c;
//	}
//	int sum(int a,int b, int c ,int d) {
//		return a+b+c+d;
//	}
	public int sum(int...ar) {//배열로 정리
		int sum = 0;
		for(int i=0; i<ar.length; i++) {
			sum+=ar[i];
		}
		return sum;
	}
	public VarArgs() {
		System.out.println("기본생성자");
	}
	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		System.out.println("합 = " + va.sum(10,20));
		System.out.println("합 = " + va.sum(10,20,30));
		System.out.println("합 = " + va.sum(10,20,30,40));
	}


}
