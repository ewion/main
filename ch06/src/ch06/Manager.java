package ch06;

public class Manager {
	
	private String name;
	private int age;
	private String part;
	
	public void printAll() {
		System.out.println("이름 : "+name+" \t나이 : "+age+" \t담당 : "+part);
	}

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
		if (age>0) {this.age = age;}
		else {age=0;}
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

}
