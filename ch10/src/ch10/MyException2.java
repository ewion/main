package ch10;

public class MyException2 extends Exception {
	
	@Override
	public String getMessage() {
	
		String errMsg="";
		
		errMsg = "급여가 1000만원(사규 최대치) 보다 높습니다";
		
		return errMsg;

	}

}
