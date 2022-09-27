package class_;

import java.util.Scanner;

public class Compute {
	private int x,y,sum,sub,mul;
    private double div;
    Scanner sc = new Scanner(System.in);
    void setX (){
    	System.out.print("X 입력 : ");
    	x=sc.nextInt();
    }
    void setY (){
    	System.out.print("Y 입력 : ");
    	y=sc.nextInt();
    }
    void calc() {
    	sum = x+y;
    	sub = x-y;
    	mul = x*y;
    	div = (double)x/y;
    }
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
    public int getSum() {
    	return sum;
    }
    public int getSub() {
    	return sub;
    }
    public int getMul() {
    	return mul;
    }
    public double getDiv() {
    	return div;
    }
    
    
}
