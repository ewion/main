package ch06;

public class ComputerEx {

	public static void main(String[] args) {
		
		Computer myCom = new Computer();
//arry 배열로 삽입		
		int[] arrays = {1, 2, 3};
		int  result1 = myCom.sum1(arrays);
		System.out.println("result1 : "+result1);

		int  result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2 : "+result2);
		
		int  result3 = myCom.sum2(1, 2);
		System.out.println("result3 : "+result3);
		
		int  result4 = myCom.sum2(1, 2, 3);
		System.out.println("result4 : "+result4);
		
		int  result5 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result5 : "+result5);
	}

}
