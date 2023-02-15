package javaIOStudy;

import java.io.*;

public class javaIOStudy {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null; // 입력스티림
		FileOutputStream fos = null; // 출력스트림

		fis = new FileInputStream("javaIOStudy.txt"); // 존재하는 파일과 연결
		fos = new FileOutputStream("result.txt"); // 존재하지 않으면 파일 생성 / 존재하면 파일 덮어쓰기

		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int data;
		while ((data = bis.read()) != -1) {
			// data에 읽어온 바이트를 저장하는데, data의 값이 -1이 아닐 때까지 반복한다.
			// -1 : EOF(End Of File)
			bos.write(data);
		}
		// 파일과의 연결을 닫는 작업
		bis.close();
		bos.close();

	} // main method

} // javaIOPackage class