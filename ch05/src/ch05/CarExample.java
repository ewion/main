package ch05;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.color = "red";
		myCar.speed = 200;
		myCar.speedUp();
		myCar.print();
		
		Car yourCar = new Car();
		yourCar.color = "green";
		yourCar.speed = 150;
		yourCar.speedDown();
		yourCar.print();
	}

}
