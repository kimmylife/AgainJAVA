package day03;

import java.util.Iterator;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//암호화와 복호화
		String pw = "rladmsql";
		String en_pw = "";
		String de_pw = "";
		final int KEY = 3;
		
		for(int i =0; i < pw.length(); i++) {
			en_pw += (char)(pw.charAt(i) * KEY); //자동형변환과 강제형변환
		}
		
		for(int i =0; i < en_pw.length(); i++) {
			de_pw += (char)(en_pw.charAt(i) / KEY);
		}
		System.out.println(en_pw);
		System.out.println(de_pw);
	}

}
