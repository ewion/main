package ch05;

class Car1 {
	String color;
	int speed;
	//동일 클래스 내의 모든 인스턴스들이 공유하는 변수 즉 클래스 변수
	static int wheel;
	
	void speedUp() {
		speed++;
		System.out.println(speed+" speed up.");
	}
	
	void speedDown() {
		speed--;
		System.out.println(speed+" speed down.");
	}
	
	void print() {
		System.out.println("color : "+color);
		System.out.println("speed : "+speed);
		System.out.println("wheel : "+wheel);
	}
}

public class Car1Ex {
	//m + cnt space로 메인메소드 자동완성가능
	public static void main(String[] args) {
		
		Car1.wheel = 8;
		
		Car1 c1 = new Car1();
		Car1 c2 = new Car1();
		
		c1.color = "red";
		c1.speed = 200;
		c1.wheel = 4;
		
		c2.color = "yellow";
		c2.wheel = 3;
		
		c1.print();
		c2.print();
	}

}

