package multi;

public class MultiArray01 {
	
	public static void main (String [] args) {
	   int [][] ar = new int [3][2];  //동적 할당
	   ar[0][0] = 10;
	   ar[0][1] = 20;
	   ar[1][0] = 30;
	   ar[1][1] = 40;
	   ar[2][0] = 50;
	   ar[2][1] = 60;
	   int [][] ar1 = { {10,20} , {30,40} , {50,60} };
	   int [][] ar2 = new int [3][2];
	   int count = 0;
	   for(int i = 0; i<ar2.length; i++) {
		   for(int j = 0; j<ar2[i].length; j++) {
			   count++;
			ar2[i][j] = 10*count;
		   }
	   }
	   for (int i=0; i<ar.length; i++) {
		   for(int j=0; j<ar[i].length; j++) {
			   System.out.println("ar["+i+"]["+j+"] = "+ar[i][j]);
		   }
	   }
	}
}	
