package ch07;

public class CarEx {
	
	String kind;
	/*
	 객체에서 객체 사용 방법
	 1. 상속관계 사용
	 2. 연관관계(Association) 사용
	 */
	Engine eg; //알파엔진, 베타엔진
	int kkk = 0; //Debug 용도
	
	//Engine eg = new Engine으로 생성하거나, 생성자를 통해 Engine객체를 참조하는 변수 eg선언 가능(연관관계)
	CarEx(String kind, Engine eg) {
		this.kind = kind;
		this.eg = eg;
	}
	
	void print() {
		System.out.println("종류 : "+kind);
		kkk++;
		eg.print();
		System.out.println("==== kkk-> "+kkk);
		}

	public static void main(String[] args) {
		 Engine eg1 = new Engine("알파엔진", 2000);
		 Engine eg2 = new Engine("베타엔진", 3000);
		 //----
		 CarEx[] car = new CarEx[3];
		 car[0] = new CarEx("모닝", eg1);
		 car[1] = new CarEx("소나타", eg1);
		 car[2] = new CarEx("그랜저", eg2);
		 
		 //모닝, 소나타, 그랜저
		 for (CarEx c : car) {
			c.print();
		 }
	}

}
