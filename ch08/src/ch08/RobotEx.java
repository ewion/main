package ch08;
/*
 * 1) 양식의 역할을 함 표준화
 * 2) 다중상속 지원(극히 일부분)
 * 3) class와 class를 연결 해줌(중요)
 */
public class RobotEx {
	
	static void action(Robot r) {
		if (r instanceof DanceRobot) {
			((DanceRobot)r).dance();
		} else if(r instanceof DrowRobot) {
			((DrowRobot)r).drow();
		} else {
			SingingRobot sr = (SingingRobot) r;
			sr.singing();
		}
	}
	
	public static void main(String[] args) {
		
		Robot[] rb = new Robot[3];
				rb[0] = new DanceRobot();
				rb[1] = new DrowRobot();
				rb[2] = new SingingRobot();
				
				for (Robot r : rb) {
					action(r);
				}

	}

}
