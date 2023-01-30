package ch05;

class Person {
	String name;
	int age;
	String gender;
	
	void print() {
		System.out.println("이름 : "+name+" \t나이 : "+age+" \t성별 : "+gender);
	}
}

public class PersonEx {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();

		p1.name = "홍길동"; p1.age = 22; p1.gender = "M";
		p2.name = "연개소문"; p2.age = 32; p2.gender = "M";
		p3.name = "궁예"; p3.age = 42; p3.gender = "M";
		
		p1.print();
		p2.print();
		p3.print();
	}

}
