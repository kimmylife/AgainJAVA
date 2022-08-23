package day03;

public class Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "유기현";
		int age = 20;
		double height = 125.83;
		
		System.out.println("이름 : name");
		System.out.printf("이름 : %s\n", name);
		
		//나이를 서식문자로 활용해서 출력 
		System.out.println();
		System.out.printf("나이 : %d\n", age);
		
		System.out.printf("몸무게 : %.2fcm", height); //%.2 는 소수점 두번째 자리까지 출력
	}

}
