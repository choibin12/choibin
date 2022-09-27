package while_;

public class DoWhile {

	public static void main(String[] args) {
		//A B C D E F......X Y Z
		char ch = 'A';
		int i=0;
		do {
			System.out.print(ch);
			ch++;
			i++;
			if (i%7==0) System.out.println();//i가7일때마다 줄바꿈
		} while(ch<='Z');
	}

}
