package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStream {
	
	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		
		int data;
		while((data=bis.read())!=-1) {
			System.out.print(data);//(1310 = enter)
			System.out.println((char)data);
		}
		bis.close();
		
	}
}
/*
app <-buf <- file
 BufferdInputStream FileInputStream
 enter - 1.맨앞으로 이동 2.다음줄로 간다 = \r\n ASCII 13,10
*/