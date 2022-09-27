package back;

public class D {
		int d(int x) {
			int SN = x;
			String y = Integer.toString(SN);
			int result = 0;
			for(int i=0; i<y.length(); i++) {
				if(y.charAt(i)=='0')continue;
				result+=(y.charAt(i)-48);
			}
			result+=x;
			return result;
		}

}
