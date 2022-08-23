package day03;

import java.util.Scanner;

public class InputTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 두 정수를 입력받은 뒤 곱셈의 결과를 출력한다. 
		//next 만을 사용한다. 
		
		Scanner sc = new Scanner(System.in);
		
		//자료형이 같은 변수는 함께 선언 가능 
		int num1 = 0, num2 = 0, result = 0;
		//출력할 메세지도 변수로 저장 가능 
		String n1Msg = "첫번째 정수 : ", n2Msg = "두번째 정수 : ", resultMsg = "결과 : ";
		String resultMsgF = "%d * %d = %d";
		
		
		System.out.println(n1Msg);
		//입력받고 숫자를 강제 형변환 후 num1에 저장 
		num1 = Integer.parseInt(sc.next()); 
		
		System.out.println(n2Msg);
		num2 = Integer.parseInt(sc.next()); 
		
		result = num1 * num2;
		//System.out.println(resultMsg + result);
		System.out.printf(resultMsgF, num1, num2, result);
		
	}

}
