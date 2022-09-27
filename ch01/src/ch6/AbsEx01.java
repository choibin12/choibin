package ch6;

public class AbsEx01 {

	public static void main(String[] args) {
//		Unit[] group = {new Marine(),new Tank(),new Dropship()};
//		Object		
		Unit[] group = new Unit[3];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();
		for(int i=0; i<group.length; i++) {
			group[i].move(100,200);
			
		}
	}
}
abstract class Unit {
	int x,y;
	abstract void move(int x, int y);
	void stop() {/*현재위치에 정지*/}
}
class Marine extends Unit{
	void move(int x, int y) {
		System.out.println("Marine[x ="+x+",y ="+y+"]");
	}
	void stimPack() {/*스팀팩 사용*/}
}
class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("Tank[x ="+x+",y ="+y+"]");
	}
	void changeMode() {/*공격모드 변경*/}
}
class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println("Dropship[x ="+x+",y ="+y+"]");
	}
	void load() {/*스팀팩 사용*/}
}
