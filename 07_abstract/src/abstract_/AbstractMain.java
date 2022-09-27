package abstract_;

public class AbstractMain extends AbstractTest {
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		AbstractMain AM = new AbstractMain();
		AM.setName("홍길동");
		System.out.println(AM.getName());
		
	}

}
