package variable;

import java.text.DecimalFormat;

/*변환문자
 * 
 */
public class CalcTest {

	public static void main(String[] args) {
		int x = 320 , y = 258 , sum = x+y , sub = x-y , mul = x*y;
		double div = (double)x/y;
		System.out.printf("%d + %d = %d\n",x,y,sum);
		System.out.printf("%d - %d = %d\n",x,y,sub);
		System.out.printf("%d * %d = %d\n",x,y,mul);
		System.out.printf("%d * %d = %s\n",x,y,new DecimalFormat().format(mul));
//		System.out.println(x+" * "+y+" = "+new DecimalFormat().format(mul));
//		System.out.println(x+" / "+y+" = "+String.format("%7.5f", div));
		System.out.printf("%d / %d = %.5f",x,y,div);
	}

}
/*
[문제] 변수를 이용하여 320, 258의 합을 구하시오
[실행결과] 
320 + 258 = xxx
320 - 258 = xxx
320 * 258 = xxx
320 / 258 = xxx
*/
