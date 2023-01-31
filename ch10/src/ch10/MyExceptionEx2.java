package ch10;

import java.util.Scanner;

public class MyExceptionEx2 {

	public static void main(String[] args) {
		// parameter로 급여 받아 옴 
		// 과제 --> 180 < 급여 < 1000
		
		MyException1 e1 = new MyException1();
		MyException2 e2 = new MyException2();
		Scanner sc = new Scanner(System.in);
		
		int sal = 0;
		try {
			/* 1. sal로 args로 넣어준 급여 가져옴
			 * 2. sal이 180미만이면 myException1발생
			 * 3. sal이 1000초과이면 MyException2발생
			 * 4. sal이 정수가 아닌 경우 Exception발생
			 */
			//외부 파라미터로 가져오는 식
//			sal = Integer.parseInt(args[0]);
			
			System.out.println("급여를 입력해 주세요");
			sal = sc.nextInt();
			if (sal<180) {
				throw new MyException1();
			} else if (sal>1000) {
				throw new MyException2();
			} 
			System.out.println("급여 : "+sal);
			
			//catch가 많을수록 코드는 안정화되고 디버그도 쉬워짐 
		} catch (ArrayIndexOutOfBoundsException e) {
			e.getMessage();
		} catch (MyException1 e) {	
			System.out.println(e1.getMessage());
		} catch (MyException2 e) {
			System.out.println(e2.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
	}

}
