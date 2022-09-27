package ch6;
abstract class Unit2{
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춤");}
		
	
}
interface Fightable {
	void move(int x, int y);//public abstract생략
	void attack(Fightable f);//public abstract생략
}
class Fighter extends Unit2 implements Fightable{
	public void move(int x , int y) {//오버라이딩 규칙: 조상(public)보다 접근 제어자범위가 좁으면 안됨 public
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	//싸울수 있는 상대를 불러온다
	Fightable getFightable() {
		Fighter f = new Fighter();//Fighter 를 생성해서 반환
		return f;
	}
}
public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		f.getFightable();
		f.move(100, 200);
		Fightable f1 = new Fighter();
		Unit2 u = new Fighter();
		u.move(50, 100);
		f.attack(new Fighter());
		f.stop();
//		u.attack(new Fighter());// Unit2 에 attack() 이없어서 호출 불가능
//		f1.stop(); // Fightable 에는 stop() 이 없어서 호출 불가
	}

}
