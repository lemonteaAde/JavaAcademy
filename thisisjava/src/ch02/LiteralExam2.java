package ch02;

public class LiteralExam2 {
	public static void main(String[] args) {
		char var1 = 'A';
		System.out.println(var1);
		
		char var3 = '가';
		System.out.println(var3);

		char c=65;
		System.out.println(c);
		//char타입은 유니코드에 대응. int로 바꾸면 65 출력될 것.

		int d=65;
		System.out.println(d);

		c=' ';//문자타입은 빈 문자 리터럴인 경우 공백 하나 있어야 오류 발생 X.
		System.out.println(c);// 참고: 문자'열' 리터럴은 공백이 없는 문자열도 가능.
		

	}

}
