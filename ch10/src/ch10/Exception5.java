package ch10;

public class Exception5 {
	
		static void method(boolean b) {
			try {
				System.out.println(1 + "b --> "+b);
				if(b) throw new ArithmeticException();
				System.out.println(2);
				//예외가 발생하면 실행되지 않는 문장
			} catch(RuntimeException r) {
				System.out.println("RuntimeException --> "+3);
				return;
				// 메소드 빠져나옴
			} catch(Exception e) {
				System.out.println(4);
				return;
			} finally {
				//예외여부와 관계없이 실행되는 문장
				System.out.println("예외여부와 관계없이 실행되는 문장 "+5);
			}
			System.out.println("정상종료시 실행되는 문장 ");
		}

		public static void main(String[] args) {
			
			method(true);
			method(false);
		
	}
}

