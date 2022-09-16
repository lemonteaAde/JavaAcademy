package ch02.sec09;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 20;
		//byte result2 =v1+v2;
		//byte result2 =(byte)(v1+v2);
		int result2 = v1+v2;
		
		byte result1 = 10 + 20; //리터럴 - 컴파일시 계산되어 바뀜(byte)
		System.out.println(result1 + "\n" + result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;
		
		char v6 = 'A';
		char v7 = 1;
		//char result4 = v6 + v7; //연산자가 있으므로, 연산되어 우변이 int 타입이 되어 있는 형태. 따라서 char 선언하면 오류
		int result4 = v6+v7;//char타입 + char타입 => int타입 + int타입 => int타입(int타입보다 적은 타입(byte, short, char)는 연산 시 모두 int 타입으로 변환되어 연산에 참여함

		System.out.println(result4);
		System.out.println((char)result4); //유니코드 상 'A'가 유니코드 65로 변환되고, 거기서 1을 더한 66은 유니코드 상에서 'B'를 의미하므로 B가 출력됨.
		
		int v8 = 10;
		int result5 = v8/4;
		System.out.println(result5);
		
		int v9=10;
		double result6 = v9/4.0; //double/double
		System.out.println(result6);
		
		int v10=1;
		int v11=2;
		//double result7 = v10/v11; //int/int => int
		double result7 = (double)(v10/v11); //(v10/v11)은 (int/int)이므로 (int)가 되어 이미 0이 되어 있는 상태. 따라서 앞에서 (double)로 타입 변환해도 0이 나옴.
		System.out.println(result7);
		double result8 = (double)v10/v11; // v10/v11의 결과가 double로 변환되어 있는 상태.
		System.out.println(result7 + "\t"+result8);
	}

}
