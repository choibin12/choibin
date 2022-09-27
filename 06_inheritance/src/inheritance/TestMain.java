package inheritance;
class AA {
	public int a = 3;
	public void disp() {
		a+=5;
		System.out.println("AA : "+a+" ");
	}
}
class BB extends AA{
	public int a = 8;
	public void disp() {
		this.a += 5;
		System.out.println("BB : "+a+" ");
	}
}
public class TestMain {

	public static void main(String[] args) {
		AA a = new AA();
		BB b = new BB();
		AA c = new BB();//부모 ->자식참조
		a.disp();//8
		System.out.println("a : "+a.a);//8
		System.out.println();
		b.disp();//13
		System.out.println();
		System.out.println("b : "+b.a);//13
		System.out.println();
		c.disp();//override / 8+5=13
		System.out.println("c : "+c.a);//override 안됨 AA의 a, 3
		System.out.println();
		BB d = (BB)c;//자식 ->(자식)부모
		d.disp();//BB : 18 13+5
		System.out.println("d : "+d.a);//d :18
	}
	
}
