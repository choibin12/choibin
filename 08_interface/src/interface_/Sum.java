package interface_;

import java.util.Scanner;

public class Sum implements Compute {
	Scanner sc = new Scanner(System.in);	
	int x,y;
	int sum;
	public void setData() {
		System.out.print("x 입력 : ");
		x=sc.nextInt();
		System.out.print("y 입력 : ");
		y=sc.nextInt();
	}
	@Override
	public void calc() {
		sum = x+y;
	}
	@Override
	public void disp() {
		System.out.println(x+"+"+y+"="+sum);
	}
}
