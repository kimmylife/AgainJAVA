package day03;

public class CastingTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자동형변환 
		System.out.println(11/9); //1
		System.out.println(11/9.0); //1.2222222222222223
		
		//강제형변환
		System.out.println(11/(double)9);
		System.out.println((int)8.43 + 2.59); //10.59
		System.out.println(8.43 + (int)2.59); //10.43
		System.out.println((int)(8.43 + 2.59)); //11
		
		//8.43 + 2.59 = 10
		
		System.out.println((int)8.42 + (int)2.59);
	}

}
