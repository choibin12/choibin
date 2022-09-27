package ch5;

public class Ex04 {

	public static void main(String[] args) {
		MyMath a = new MyMath();
		long result1 = a.add(5L, 3L);
		long result2 = a.subtract(5L, 3L);
		long result3 = a.multiply(5L, 3L);
		double result4 = a.divide(5L, 3L);
		long result5 = a.max(5, 3);
		a.printGugudan(6);//구구단()을 출력
		System.out.println("add(5L,3L) = "+result1);
		System.out.println("subtract(5L,3L) = "+result2);
		System.out.println("multiply(5L, 3L) = "+result3);
		System.out.println("divide(5L, 3L) = "+result4);
		System.out.printf("max(5L,3L) = "+ result5);
		
		
	}

}
class MyMath{
	void printGugudan(int dan) {
		if(!(2<=dan&&dan<=9))
			return;
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n ",dan,i,dan*i);
		}
	}
	long add(long a, long b) {
		long result = a+b;
		return result;
		// return a+b; // 위 두줄 간소화
	}
	long max(long a, long b) {
		if(a>b)
			return a;
		else
			return b;
		//return a > b ? a:b; 
	}
	long subtract(long a,long b) {return a-b;}
	long multiply(long a,long b) {return a*b;}
	double divide(double a,double b) {return a/b;}
	
}