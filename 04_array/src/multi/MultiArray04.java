package multi;

public class MultiArray04 {

	public static void main(String[] args) {
		//가변길이
		int ar[][] = new int [3][];
		
		for(int i = 0; i<ar.length; i++) {
			ar[i] = new int[i+1];
			for(int j = 0; j<ar[i].length; j++) {
				ar[i][j]= j;
				System.out.println(ar[i][j]);
			}
		}
	}
}
