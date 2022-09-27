package for_;

public class For06 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			int a = 0;
			if(i%2!=0) a = -i;
			if(i%2==0) a = i;
			System.out.print(a);
			if(i<10)System.out.print("+");
			if(i==10)System.out.print("=");
			sum+=a;
			
		}
		System.out.println(sum);
	}

}
