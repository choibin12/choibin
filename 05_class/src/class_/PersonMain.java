package class_;
class Person{//Person.class
		private String name;
		private int age;
		
		public void setName(String n) {
			name = n;
		}
		public void setAge(int a) {
			age = a;
		}
		String getName(){
			return name;
		}
		int getAge(){
			return age;
		}
		public void setData(String x , int y) {
			name = x; 
			age = y;
		}
		public void setData() { //오버로드
			
		}
}
//-----------
public class PersonMain {//PersonMain.class

	public static void main(String[] args) {
		Person aa;// 객체
		aa = new Person();//메모리 생성
		System.out.println("객체 aa = "+aa);
		aa.setName("홍길동");//함수호출
		aa.setAge(25);
		System.out.println("이름 : "+aa.getName()+"\t나이 : "+aa.getAge());
		System.out.println();
		Person bb = new Person();
		System.out.println("객체 bb = "+bb);
		bb.setAge(13);
		bb.setName("코난");
		System.out.println("이름 : "+bb.getName()+"\t나이 : "+bb.getAge());
		Person cc = new Person();
		cc.setData("둘리", 5);
		System.out.println("이름 : "+cc.getName()+"\t나이 : "+cc.getAge());
		
	}

}
