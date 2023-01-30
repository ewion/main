package ch07;

public class Car2Ex {

	public static void main(String[] args) {
		Car2[] cars = new Car2[3];
		//부모객체에는 자식객체 대입 가능, 객체생성을 배열사용하여 로직화
		cars[0] = new Bus();
		cars[1] = new Ambulance();
		cars[2] = new FireEngine();
		
		//향상된 for문
		for (Car2 car : cars) {
			//실행은 부모와 같은 이름의 오버라이딩된 자식 메소드가 실행
			car.move();
			//멤버변수는 부모것만 적용
			System.out.println("for Car2--> "+car.a);
			System.out.println("for Car2--> "+car.a);
			//부모와 다른 메소드 실행하는 방법, car객체가 Ambulance랑 같다면
			if(car instanceof Ambulance) {
				//강제타입변환을 사용해서 자식클래스의 메소드를 사용할수있다
//				((Ambulance) car).special();
				Ambulance amb = (Ambulance) car;
				amb.special();
				amb.printa();
				System.out.println("amb Car2--> "+amb.a);
			}
			
		}
	}

}
