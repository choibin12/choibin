package for_;

public class MultiFor02 {

	public static void main(String[] args) {
		int dan, i;
		for (i = 1; i <= 9; i++) {
			for (dan = 2; dan <= 9; dan++) {
				System.out.println(dan + "*" + i + "=" + i * dan);
			}
			System.out.println();
		}
	}

}
