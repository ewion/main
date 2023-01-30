package ch06;
//자원 절감
class Singleton {
		String str;
		private static Singleton instance;
		//아무나 나를 생성하지 못함
		private Singleton () {
		}
		//Singleton 을 생성할수 있는 로직
		public static Singleton getInstance() {
			if (instance == null) instance = new Singleton();
			return instance;
		}
}

public class SingletonEx {
	public static void main(String[] args) {
		Singleton st1 = Singleton.getInstance();
		// Singleton st2 = new Singleton();
		Singleton st2 = Singleton.getInstance();
		st1.str = "스스로 있는 자";
		System.out.println(st2.str);
		if (st1 == st2) System.out.println("같다");
		else System.out.println("다르다");
	}

}
