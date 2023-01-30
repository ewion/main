package ch05;

public class Car {
	
	String color;
	int speed;
	
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
	}

}
