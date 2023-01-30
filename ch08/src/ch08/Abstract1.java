package ch08;

//하나이상의 추상메소드가 선언되야 추상클래스
abstract class AbsClass{
	int kkk = 0;
	public void setkkk(int kkk) {
		this.kkk = kkk;
	}
	public AbsClass() {
		System.out.println("추상Class 생성자");
	}
	//추상메소드 선언
	//추상메소드란 메소드의 선언부만 존재하는 메소드
	abstract void print();
}

//추상클래스 AbsClass를 상속하는 클래스 구현
//추상클래스의 추상메소드를 구현해야함
class ImplAbsclass extends AbsClass {
	@Override
	void print() { 
		System.out.println("ImplAbsClass kkk--> "+kkk);
	}
	
}

public class Abstract1 {

	public static void main(String[] args) {
		/*
		추상클래스는 인스턴스가 생성될 수 없음
		따라서 추상클래스가 아닌 추상클래스를 상속하는 클래스로 객체를 생성해야함
		AbsClass ac = new Absclass(); <- 에러뜸
		추상클래스와 인터페이스의 차이점 숙지할것
		 */
		AbsClass ac = new ImplAbsclass();
		ac.setkkk(12);
		ac.print();

	}

}
