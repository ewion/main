package ch05;

class Var {
	//class 변수
	static int k;
	//인스턴스 변수
	String color = "멋있어";
	int speed = 33;

	//메소드 선언, 메소드 내에서 로컬변수 s 선언
 	void scope() {
		int s = 77;
		System.out.println(s+" scope method");
	}
}

public class Variable {

	public static void main(String[] args) {
		
		Var.k =10;
		Var var1 = new Var();
		var1.speed = 55;
		System.out.println("k-> " +var1.k);
		System.out.println("speed-> " +var1.speed);
		var1.scope();
		//밑 코드는 메소드 내에 존재하는 로컬변수를 불러 올 수 없기 때문에 컴파일오류 발생
//		System.out.println("scope.s->" +var1.s);
	}

}
