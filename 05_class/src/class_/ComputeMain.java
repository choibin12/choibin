package class_;


public class ComputeMain {

	public static void main(String[] args) {//Object<compute>[]ar = new Object<compute>[3]; <-- <>!!
		
		Compute[]ar = new Compute[3];//객체배열 생성, 결합도 1:1관계
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = new Compute();//배열 선언
			ar[i].setX();
			ar[i].setY();
			ar[i].calc();
			System.out.println();
		}
		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV\t");
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i].getX()+"\t"+ar[i].getY()
					+"\t"+ar[i].getSum()+"\t"+ar[i].getSub()
					+"\t"+ar[i].getMul()+"\t"+String.format("%.2f", ar[i].getDiv()));
		}
	}

}
/*
객체배열을 이용하여 작성하시오
데이터는 키보드로부터 입력 받으세요

클래스명 : Compute
필드 : int x,y,sum,sub,mul
       double div
메소드 : setX(~)
       setY(~)
       calc() - 합차곱몫을 계산
       getX()
       getY()
       getSum()
       getSub()
       getMul()
       getDiv()

클래스명 : ComputeMain

[실행결과]
x 입력 : 320
y 입력 : 258

x 입력 : 256
y 입력 : 125

x 입력 : 452
y 입력 : 365


X      Y      SUM      SUB      MUL      DIV
320      258
256      125
452      365
*/