package ch01;

public class LiteralExam2 {

	public static void main(String[] args) {
		char var1 = 'A';//문자타입 char변수에 문자 리터럴 'A'저장
		System.out.println(var1);
		
		char var3 = '가'; // 문자타입 char변수에 문자 리터럴 '가'저장
		System.out.println(var3);
		
		char c=65; //문자타입 char변수에 정수리터럴 97이 char타입으로 변환되어 저장.
		System.out.println(c);//유니코드 숫자로 되어서 출력값이 유니코드 번호에 해당하는 문자가 출력됨.
		
		c=0x0041; //리터럴 0x0041(16진법)이 char타입으로 변환되어 저장.
		System.out.println(c);
		
		c=' '; //문자는 ''사이에 공백을 넣어주어야 오류가 안남.(문자타입은 빈문자 리터럴인 경우 공백하나 있어야 오류가 안남)
		
		String s="";//참고:문자열 리터럴은 공백이 없는 문자열도 가능.

	}

}
