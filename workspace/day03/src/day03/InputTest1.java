package day03;

import java.util.Scanner;

public class InputTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 초기값 
		정수 :  0
		실수 : 0.0
		문자 : ' '
		문자열 : " ", null
		*/
		 // option + shift + r : 이름 한번에 변경 
		
		Scanner scan = new Scanner(System.in);
		String lastName = "";
		String firstName = "";
		
		System.out.print("이름 : ");
		lastName = scan.next();
		firstName = scan.next();
		
		System.out.println(lastName + firstName +   "님 안녕하세요"); 
		
	}
}
