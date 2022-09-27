package operator;

public class Operator04 {

	public static void main(String[] args) {
		int a = 5;
		a += 2;// a = a+2 , 7
		a *= 3;// a = a*3 , 21	
		
		a++; 	// a += 1 ; , 22
		System.out.println(a);
		int b = a++;
		System.out.println(b);//22
		System.out.println(a);//23
		int c = ++a - b--; //2 , 24-22
		System.out.println("a="+a+"b="+b+"c="+c);
		System.out.println("a++"+a++);//후행
		System.out.println("a"+a);

	}

}
