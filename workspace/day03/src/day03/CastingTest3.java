package day03;

public class CastingTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 다른 자료형을 문자열로 
		System.out.println(1 + "3"); //연결, 13
		System.out.println(1 + "" + 9); //연결, 19
		
		//두 정수를 더하여 결과가 정수로 나오게 하기 
		String data1 = "1";
		String data2 = "3";
		String data3 = "3.7";
		
		System.out.println(data1 + data2); //13 
		
		//Integer 라는 메소드 안에 있는 parseInt 활용
		System.out.println(Integer.parseInt(data1) + Integer.parseInt(data2)); //4
		System.out.println(Double.parseDouble(data3)+1); //4.7
	}

}
