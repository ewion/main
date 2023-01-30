package ch06;

class Car2 {
	String name;
	String color;
	int speed;
	
	Car2(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;		
	}
	
	void print () {
		System.out.println(name +"\t"+color+"\t"+speed);
	}
}
public class Car2Ex {

	public static void main(String[] args) {
		
		Car2 c1 = new Car2("소나타","빨강",150);
		c1.print();

	}

}
