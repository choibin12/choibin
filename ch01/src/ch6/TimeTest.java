package ch6;
class Time { 
	private int hour;//0~23의 값을 가져야함
	private	int minute;
	private int second;
	public void setHour(int hour) {
		if(isNotVaildHour(hour)) return;
		this.hour = hour;
	}
	//매개변수로 넘겨진hour가유효한지 확인시켜주는 메서드
	private boolean isNotVaildHour(int hour) {
		return hour<0 || hour>23;
	}
	public int getHour() {return hour;}
}
public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		//t.hour = 23;
		t.setHour(21);
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());

	}

}
