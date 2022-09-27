package ch6;//추상클래스는 객체생성불가
abstract class Player{//추상클래스(미완성 클래스)
	boolean pause;		//일시정지 상태저장 변수
	int currentPos;		//현재 play 되고있는 위치저장 볍ㄴ수
	Player(){//추상 클래스도 생성자가 있어야함
		pause = false;
		currentPos = 0;
	}
	/*지정된 위치(pos)에서 재생을 시작하는 기능이 수행되도록 작성해야한다.*/
	abstract void play(int pos); //추상메서드
	/* 재생을 즉시 멈추는 기능을 수행하도록 작성되어야 한다*/
	abstract void stop();//추상메서드
	void play() {
		play(currentPos);//객체를 생성할수 없어서 추상메서드 사용가능
	}
}
class AudioPlayer extends Player {
	void play(int pos) { System.out.println(pos+"위치부터 play합니다");}
	void stop(){}
}
public class AbsEx {

	public static void main(String[] args) {
//		Player p = new Player(); // 추상클래스 객체를 생성
		AudioPlayer ap = new AudioPlayer();
		Player ap1 = new AudioPlayer();//다형성
		ap.play(100);
		ap.stop();

}
	
}
