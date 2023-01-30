package exam;
/*
 * 인터페이스 생성 시에 구현하는 인터페이스를 명시하면
 * 자바에서 추상메소드를 모두 정의해줌
 */
public class Audio implements RemoteControl {

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio On");

	}

	@Override
	public void turnOff() {
		System.out.println("Audio Off");
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("now Audio volume : "+volume);
	}
}
