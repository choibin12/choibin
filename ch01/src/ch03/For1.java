package ch03;

public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345, sum = 0;
		for(num = 12345; num>0; num = num/10) {
			System.out.println(num%10);
			sum += num%10;
		}
		System.out.println("각 자리 수의합 = "+sum);
	}
	

}
