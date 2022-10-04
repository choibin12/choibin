package nested;

public class AbstractMain{
	
	public static void main(String[] args) {
		AbstractTest AT = new AbstractTest() {//익명 inner 클래스 anonymous , AbstractMain$1.class
			@Override
			public void setName(String name) {
				this.name = name;
			}
		};
		
		InterA IA = new InterA() {//익명 inner 클래스 anonymous , AbstractMain$2.class
			
			@Override
			public void bb() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void aa() {
				// TODO Auto-generated method stub
				
			}
		};
		AbstractExam AE = new AbstractExam() {};//익명 inner 클래스 anonymous , AbstractMain$3.class ,override 필요가 없음
		//추상메서드가 없기때문에 원하는 메서드를 override해주면 됨
		
		
	}

	

}
