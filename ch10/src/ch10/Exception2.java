package ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception2 {

	//보통 try catch문으로 에러 처리
	public static void main(String[] args) {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//while문을 빠져나올 수 있도록 탈출로직 구현해야함
		while(true) {
			int num1;
			try {
			System.out.println();
			System.out.println("첫번째 값을 입력하세요 -> ");
			num1 = Integer.parseInt(in.readLine());
			System.out.println("두번째 값을 입력하세요 -> ");
			int num2 = Integer.parseInt(in.readLine());
			
			System.out.println(num1+ " / "+num2+" = "+num1/num2);
			// printf에서 %d 숫자형으로 출력, %s 문자형으로 출력, %f float형태로 출력
			System.out.printf("1.printf --> %d / %d = %d", num1, num2, num1/num2);
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다. e:"+e.getMessage());
			}
			System.out.println();
			System.out.println("종료합니다");
			System.exit(0);
		}

	}

}
