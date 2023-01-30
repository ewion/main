package ch06;
//***중요
class Data {
	int kor;
	int eng;
	int math;
	
	//call by reference 참조 호출
	void addRef(Data d1, Data d2) {
		d1.kor = d2.eng;
		System.out.println("call by reference addRef Method 국어 점수 : "+d1.kor);
	}
	
	//call by value 값 호출
	void addValue(int kor, int eng) {
		kor = eng;
		System.out.println("call by value addValue Method 국어 점수"+kor);
	}
}

public class DataEx {

	public static void main(String[] args) {
		Data d1 = new Data();
		Data d2 = new Data();
		Data d3 = new Data();
		d1.kor = 50;
		d1.math = 70;
		d2.eng = 80;
		//참조타입변수(객체, 배열, String변수등)
		d3.addRef(d1, d2); // 인스턴스를 넘겨주면 주소값을 반환하는 효과
		System.out.println("Main 국어 점수 : "+d1.kor);
		//기본타입변수
		d3.addValue(80, 70); // 직접 생성자에 값을 넘겨줌
		System.out.println("Main 국어 점수 : "+d3.kor);
		

	}

}
