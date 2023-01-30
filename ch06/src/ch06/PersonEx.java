package ch06;

public class PersonEx {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("seaslug");
		st1.setAge(21);
		st1.setSno("1234");

		Teacher th1 = new Teacher();
		th1.setName("Quokka");
		th1.setAge(31);
		th1.setSubject("JAVA");
		
		Manager mg1 = new Manager();
		mg1.setName("bird");
		mg1.setAge(19);
		mg1.setPart("cleaner");
		
		System.out.println("이름 : "+st1.getName()+"\t 나이 : "+st1.getAge()+"\t 학번 : "+st1.getSno());
//		th1.printAll();
//		mg1.printAll();
	}

}
