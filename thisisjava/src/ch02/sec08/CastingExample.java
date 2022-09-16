package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		int var1 = 10;
		byte var2 = (byte)var1;
		System.out.println(var2);
		
		long var3 = 300;
		int var4 = (int)var3;
		System.out.println(var4);
		
		int var5 = 65; //var5 는 65 숫자지만,
		char var6 = (char)var5; //char 변환하여 var5(65)를 var6에 넣었으므로 유니코드 65가 저장됨
		System.out.println(var6); //따라서, 유니코드상 65가 의미하는 문자인 A가 출력.
		
		double var7 = 3.14;
		int var8 =(int)var7; // 3.14를 정수형 변환했으므로 소숫점 버림되어 3
		System.out.println(var8);


	}

}
