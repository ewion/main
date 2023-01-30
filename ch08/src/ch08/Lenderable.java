package ch08;

public interface Lenderable {
	/*
	 상태값 표시
	 인터페이스에는 상수와 추상메소드만 존재할 수 있음
	 인터페이스에는 선언한 변수는 상수로 취급되어 final static이 생략되어있음, 상수는 관례적으로 모두 대문자로 선언
	 메소드 앞에도 abstract 생략되있음
	 */
	int BORROW = 1; // 빌려간 상태, 타입 앞에 파이널 스태틱 생략
	int NORMAL = 0; // 대여 가능 상태
	
	void checkOut (String borrower, String date);
	void checkIn();
}

class SeperateVolume implements Lenderable {
	
	String title;
	String date;
	String borrower;
	int	status;

	public SeperateVolume(String title) {
		this.title = title;
	}
	//책 대여
	@Override
	public void checkOut(String borrower, String date) {
		if(status != NORMAL) return;
		this.date = date;
		this.borrower = borrower;
		status = BORROW;
		//BORROW = 1; 안댐
		System.out.println(borrower+" 가 "+title+ "을 "+date+" 에 대여했다");
	}

	@Override
	public void checkIn() {
		if(status != BORROW) return;
		System.out.println(borrower+" 가 "+title+"을 반납했다");
		date = null;
		title = null;
		borrower = null;
		status = NORMAL; //0
	}
	
}
