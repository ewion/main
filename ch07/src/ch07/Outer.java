package ch07;

public class Outer {
	int width = 10;
	int height =10;
	
	Outer(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	/*
	 클래스 내부에서 클래스 선언(Inner클래스 또는 중첩클래스, API를 공유할수있음?
	 해당클래스와 밀접한관련이있는클래스이거나 해당클래스에서 쓰다가 버릴 클래스?
	 Outer클래스에서만 사용할것이기때문에 클래스내부에선언하여 일반메소드처럼 사용
	 */
	class Inner {
		int depth = 10;
		public int volume() {
			return width * height * depth;
		}
	}
	
	//메소드 선언, Inner형 리턴
	public Inner getInner() {
		return new Inner();
	}
}
