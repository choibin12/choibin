package constructor;

public class ExamMain {

	public static void main(String[] args) {
		Exam e = new Exam();
		e.setData();
		e.compare();
		System.out.println("이름\t1\t2\t3\t4\t5\t점수");
		System.out.print(e.getName()+"\t");
		for(char data :e.getOx()) {
			System.out.print(data+"\t");
		}
		System.out.print(e.getScore());
		
		
	}

}
