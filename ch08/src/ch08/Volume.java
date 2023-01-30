package ch08;

public interface Volume {
	
	void volumeUp();
	void volumeDown();

}

class TV implements Volume {

	@Override
	public void volumeUp() {
		System.out.println("TV volume ++");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("TV volume --");
		
	}
	
	public void play() {
		System.out.println("watching TV");
	}
	
}

class Audio implements Volume {

	@Override
	public void volumeUp() {
		System.out.println("Audio volume ++");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("Audio volume --");
		
	}
	
	public void play() {
		System.out.println("playing Audio");
	}
	
}

class Speaker implements Volume {

	@Override
	public void volumeUp() {
		System.out.println("Speaker volume ++");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("Speaker volume --");
		
	}
	
	public void play() {
		System.out.println("Speaker on");
	}
	
}
