package class2;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str, ",");// , 빼고
		System.out.println("토큰개수 = "+st.countTokens());
		
		while(st.hasMoreTokens()) {//현위치에 토큰이 있을때 true,없으면 false
			System.out.println(st.nextToken());//st의 토큰을 꺼내고 다음토큰으로 이동
			
		}
		System.out.println();
		
		String[]ar = str.split(",");
		for(String data : ar) {
			System.out.println(data);
		}

	}

}
