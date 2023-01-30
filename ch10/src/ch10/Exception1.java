package ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception1 {
//throws로 에러 잡는건 바쁠때 사용
	public static void main(String[] args) throws NumberFormatException, IOException {	
		int kkk = 0;
		float fVar = (float) 22.31;
		String kStr = "문자열";
		//라인을 읽어서 버퍼로 축척해놓는 객체
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
		//while문을 빠져나올 수 있도록 탈출로직 구현해야함
		while(true) {
			System.out.println();
			System.out.println("첫번째 값을 입력하세요 -> ");
			int num1 = Integer.parseInt(in.readLine());
			
			System.out.println("두번째 값을 입력하세요 -> ");
			int num2 = Integer.parseInt(in.readLine());
			
			System.out.println(num1+ " / "+num2+" = "+num1/num2);
			// printf에서 %d 숫자형으로 출력, %s 문자형으로 출력, %f float형태로 출력
			System.out.printf("1.printf --> %d / %d = %d", num1, num2, num1/num2);
			System.out.println();
			System.out.printf("2.printf --> 문자 : %s 소수점 : %f", kStr, fVar);
			System.out.println();
			System.out.println("종료합니다");
			System.exit(0);
		}

	}

}
