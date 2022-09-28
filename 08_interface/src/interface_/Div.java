package interface_;

import java.util.Scanner;

public class Div implements Compute{
	Scanner sc = new Scanner(System.in);	
	int x,y;
	double div;
	public void setData() {
		System.out.print("x 입력 : ");
		x=sc.nextInt();
		System.out.print("y 입력 : ");
		y=sc.nextInt();
	}
	@Override
	public void calc() {
		div=(double)x/y;
	}@Override
	public void disp() {
		System.out.println(x+"/"+y+"="+String.format("%.3f", div));		
	}
}
