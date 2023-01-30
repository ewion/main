package ch05;

public class Car3Ex {
	
	public static void main(String[] args) {
		//오버로딩 구현
		Car3 c1 = new Car3();
		c1.name = "소나타";
		c1.inTime = 11;
		c1.outTime = 13;
		
		Car3 c2 = new Car3("그랜저", 9, 20);
		Car3 c3 = new Car3("소나타", 12, 13);
		
		c1.print();
		c2.print();
		c3.print();
		
	}
}
