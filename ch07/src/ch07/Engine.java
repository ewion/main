package ch07;

public class Engine {
	String type;
	int cc;
	
	//생성자, 멤버변수를 만들거나 인스턴스 초기화 역할
	Engine(String type, int cc) {
		this.type = type;
		this.cc = cc;
	}
	
	void print() {
		System.out.println("type = "+type);
		System.out.println("cc = "+cc);
	}

}
