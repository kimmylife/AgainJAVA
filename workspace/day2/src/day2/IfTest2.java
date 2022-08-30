package day2;

import java.util.Scanner;

public class IfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 심리테스트 
		 * 당신이 좋아하는 색을 선택하세요 
		 * 1. 빨강색
		 * 2. 노랑색
		 * 3. 검정색 
		 * 4. 흰색
		 * 
		 * 빨강색 : 불같다
		 * 노랑색 : 발랄하다
		 * 검정색 : 든든하다
		 * 흰색 : 천사같다 
		 */
		
		Scanner sc = new Scanner(System.in);
		int num = 0; 
		String result = "";
		String msgRed = "불같다" , msgYellow = "발랄하다", msgBlack= " 든든하다", msgWhite="천사같다";
		
		
		System.out.println("-----심리테스트------");
		System.out.println("당신이 좋아하는 색을 선택하세요");
		System.out.println("1. 빨강색");
		System.out.println("2. 노랑색");
		System.out.println("3. 검정색");
		System.out.println("4. 흰색");
		num = sc.nextInt();
		
		if(num == 1) {
			result = msgRed;
		}else if(num == 2){
			result = msgYellow;
		}else if(num == 3){
			result = msgBlack;
		}else if(num == 4){
			result = msgWhite;
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		System.out.println(result);
		
		
	}

}
