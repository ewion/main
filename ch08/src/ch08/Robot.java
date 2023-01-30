package ch08;

public interface Robot {
//무
}

class DanceRobot implements Robot {
	void dance() {
		System.out.println("춤춥니다");
	}
}

class DrowRobot implements Robot {
	void drow() {
		System.out.println("그립니다");
	}
}

class SingingRobot implements Robot {
	void singing() {
		System.out.println("노래합니다");
	}
}
