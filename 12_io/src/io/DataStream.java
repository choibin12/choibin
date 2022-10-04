package io;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) {
		try {
			DataOutputStream d = new DataOutputStream(new FileOutputStream("result.txt"));
			d.writeUTF("홍길동");
			d.writeInt(25);
			d.writeDouble(182.5);
			d.close();
			//파일로부터 입력
			DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
			String name = dis.readUTF();
			int age = dis.readInt();
			double height = dis.readDouble();
			System.out.println("이름 = "+name);
			System.out.println("나이 = "+age);
			System.out.println("키 = "+height);
			dis.close();
		}
		 catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
/*
Application(*.java) -> buffer -> result.txt
App > DataOutputStream buf > FileOutputStream > rst
읽어들일때는 역순

*/
