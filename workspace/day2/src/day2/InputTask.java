package day2;

import java.util.Scanner;

public class InputTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		[숙제]
//				한번에 두 개의 정수를 입력받는다
//				입력 예) 1 2
//				출력 예) 1 * 2 = 2
		
		String msg = "두 정수를 예시와 같이 입력하세요 \n 예) 12 13";
		String format = "%d * %d = %d";
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		
		System.out.println(msg);
		//num1 = Integer.parseInt(sc.next()); //문자열 값을 정수로 바꿀때 
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		result = num1*num2;
		
		System.out.printf(format, num1, num2, result);
		
	}

}
