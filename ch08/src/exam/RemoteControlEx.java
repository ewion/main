package exam;

public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc1 = null;
		RemoteControl rc2 = null;
		
		rc1 = new Television();
		//구현클래스의 메소드 호출
		rc1.turnOn();
		rc1.turnOff();
		rc1.setVolume(13);
		//인터페이스의 디폴트 메소드 호출
		rc1.setMute(true);
		//인터페이스의 정적메소드 호출
		RemoteControl.changeBattery();

		rc2 = new Audio();
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(13);
		rc2.setMute(true);
		RemoteControl.changeBattery();
	}
}
