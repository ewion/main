package ch10;

public class MyException1 extends Exception {
	
	@Override
	public String getMessage() {

		String errMsg="";
		
		errMsg = "급여가 180만원(최저시급) 보다 낮습니다 고용노동부 연락시급";
		
		return errMsg;
	}

}
