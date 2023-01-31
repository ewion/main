package ch10;

import java.util.Scanner;

public class MyExceptionEx {

	public static void main(String[] args) {
		
		int dice = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 주사위 숫자 입력");
		
		try {
			dice = sc.nextInt();
			if (dice>6) throw new MyException();
			System.out.println("주사위 값은 : "+dice);
		} catch (MyException e) {
			 System.out.println("MyException --> "+e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception --> "+e.getMessage());
		}
		
	}

}
