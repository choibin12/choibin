package operator;

public class Operator05 {

	public static void main(String[] args) {
		int a =0 ,  b = 0;
		boolean result; 
		result = ((a+=10)<0&&(b+=10)>0);
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);
		result = ((a+=10)>0||(b+=10)>0);
		System.out.println(result);
		System.out.println(a+","+b);
		
	}

}

