package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		int intValue = 10;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue);

		//2진수로 표시
		System.out.println(Integer.toBinaryString(intValue));
		System.out.println(Integer.toBinaryString(byteValue));

		intValue = 1234567;
		System.out.println(Integer.toBinaryString(intValue));
		// 00000000 00010010 11010110 10000111
		byteValue = (byte)intValue;
		System.out.println(Integer.toBinaryString(byteValue));
		System.out.println(byteValue);

		char charValue = '가'; //char선언 한 charValue에 유니코드로 변환 되어 저장되는 문자 리터럴 '가'를 대입함.
		intValue = charValue; //따라서 charValue는 유니코드로 변환된 '가', 44032가 저장되어 있음.
		System.out.println("가의 유니코드: " + intValue); //가의 유니코드: 44032.

		intValue = 50; //
		long longValue = intValue; // 좌변 long - int 변환=> 좌변 long - long 
		System.out.println("longValue : " + longValue);

		longValue= 100;
		float floatValue = longValue; // 좌변 float - long 변환=> 좌변 float - float
		System.out.println("floatValue: " + floatValue);

		floatValue = 100.5F;
		double doubleValue = floatValue; // 좌변 double - float 변환=> 좌변 double - double
		System.out.println("doubleValue: " + doubleValue);

		doubleValue = (double)floatValue; // 좌변 double - float 변환=> 좌변 double - double
		System.out.println("doublevalue: " + doubleValue);

		System.out.println(10.5/10.0);
		System.out.println((int)10.5/(int)10.0); // 정수/정수 => 정수
		System.out.println((int)10.5/10.0);


	}

}


