package day2;

import java.util.Scanner;

public class Oper4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//사용자에게 키를 입력받고,
		//정수라면 정수로 출력 , 실수면 실수로 출력
		// 삼항 연산자 사용
		
		// 예) 
		// 183 -> 183 출력
		// 183.5 -> 183.5 출력
		
		//키를 저장할 변수 선언(double 8byte)
		double height = 0.0;
		//실수인지 정수인지를 담아줄 변수(boolean 1byte)
		boolean check = false;
		//서식문자를 담아줄 변수 
		String format = "";
		String msg = "키 : ";
		Scanner sc = new Scanner(System.in);
		
		System.out.print(msg);
		//사용자에게 실수를 입력하고 height에 담아주기 
		height = sc.nextDouble();
		
		check = height - (int)height == 0;
		
		format = check ? "%.0fcm" : "%.1fcm";

		System.out.printf(format, height);
		
	}

}
