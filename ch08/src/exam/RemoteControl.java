package exam;

public interface RemoteControl {
	
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//자바8부터 인터페이스는 추상메소드 외에 디폴트메소드와 정적메소드 사용 가능
	//디폴트 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("Volume Off");
		} else {
			System.out.println("Volume On");
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("battery change");
	}
}
