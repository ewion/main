package ch06;

class Encapsule {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0) { System.out.println("나이입력 오류");
		this.age = age;
		}
	}
}

public class EncapsuleEx {

	public static void main(String[] args) {
		Encapsule ec1 = new Encapsule();
		ec1.setName("홍길동");
		System.out.println("이름 : "+ec1.getName());
		System.out.println("나이 : "+ec1.getAge());

	}

}
