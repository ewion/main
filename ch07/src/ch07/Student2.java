package ch07;

public class Student2 extends Person2{
	private String sno;
	Student2(String name, int age, String sno) {
		super(name, age);
		this.sno = sno;
	}
	public void print() {
		super.print();
		System.out.println("학번 : "+sno);
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
}

class Teacher extends Person2 {
	private String sub;
	Teacher(String name, int age, String sub) {
		super(name, age);
		this.sub = sub;
	}
	public void print() {
		super.print();
		System.out.println("과목 : "+sub);
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
}

class Manager extends Person2 {
	private String part;
	Manager(String name, int age, String part) {
		super(name, age);
		this.part = part;
	}
	public void print() {
		super.print();
		System.out.println("직무 : "+part);
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
}