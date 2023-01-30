package ch07;

class Parent {
	int a = 7;
	int b = 7;
	void display() {
		System.out.println("Parent 대박");
	}
	void print() {
		System.out.println("Parent 난 부모 print 메소드");
	}
}

class Child extends Parent {
	int a = 10;
	void print() {
		super.print();
		System.out.println("Child 부모멤버 a = "+super.a);
		System.out.println("Child 난 자식 메소드 a = "+a); //a앞에 this. 가 생략되있음
		System.out.println("Child 난 자식 메소드 b = "+b);
		System.out.println("========");
	}
}

public class Super1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.print();
		c.display();
	}
}

