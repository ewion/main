package ch10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception7 {
	
	public static void main(String[] args) throws IOException {
		
		FileReader reader;
		//배열의 크기만큼 저장됨
		char[] buffer = new char[10000];
		String file_name = ".classpath";
		
		try {
			// FileReader = file을 읽기 위한 class
			reader = new FileReader(file_name);
			
			//buffer에서 0부터 시작해서 100바이트분량까지 읽기, char[]배열의 최대치까지 읽을수 있음
			reader.read(buffer, 0, 1100);
			String str = new String(buffer);
			System.out.println("읽은건 "+str);
			reader.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		} catch(IOException e) {
			System.out.println("파일을 읽을 수 없습니다");
		} finally {
			System.out.println("파일을 읽는데 성공하였습니다");
		}
		
	}

}
