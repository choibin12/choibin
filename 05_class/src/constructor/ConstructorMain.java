package constructor;
class Hello{
	private String name;
	private int age;
	
	public Hello() {//객체 생성되면 바로 생성
		System.out.println("기본생성자");
	}
	public Hello(String name) {
		this.name = name;
	}
	public Hello(int age) {
//		this("코난");
		this();//overload 된 다른 생성자를 호출할수있다.
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
public class ConstructorMain {//생성자

	public static void main(String[] args) {
		Hello h = new Hello();
		System.out.println(h.getName());
		Hello g = new Hello("홍길동");
		System.out.println(g.getName()+"\t"+g.getAge());
		System.out.println();
		Hello o = new Hello(25);
		System.out.println(o.getName()+"\t"+o.getAge());
		System.out.println();
	}

}
