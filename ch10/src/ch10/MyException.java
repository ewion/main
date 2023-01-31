package ch10;

public class MyException extends Exception{
	
	@Override
	public String getMessage() {

		String errMsg;
		errMsg = "6보다 큽니다";
		
		return errMsg;
	}

}
