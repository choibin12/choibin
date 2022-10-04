package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		PersonDTO PD = new PersonDTO("홍길동", 25, 182.5);
		
		ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		OOS.writeObject(PD);
		OOS.close();
		
		ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("result2.txt"));
		PersonDTO dto = (PersonDTO) OIS.readObject();//객체를 불러와서 형변환PersonDTO dto = new 불가
		
		System.out.println("이름 = "+dto.getName());
		System.out.println("나이 = "+dto.getAge());
		System.out.println("키 = "+dto.getHeight());
		OIS.close();
		
		
	}

}
/*객체 직렬화
 * 객체는 파일이나 네트워크로 전송이 안되므로 
 * 객체를 byte[]로 변환시켜서 전송해야된다
 * Serializable
 * 
 * 
 * 
 * 
 */
