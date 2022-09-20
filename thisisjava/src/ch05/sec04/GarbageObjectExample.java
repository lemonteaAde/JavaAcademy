package ch05.sec04;

public class GarbageObjectExample {
	public static void main(String[] args) {
		String hobby = "여행";//string타입 객체는 리터럴로 생성시 new String()으로 자동 생성
		System.out.println(hobby.hashCode());
		hobby = null; // "여행"에 해당하는 String 객체를 쓰레기로 만듦. null은 기본타입에서는 사용 불가, 참조타입의 초기화로 사용가능.
		//null pointer 예외발생 java.lang.NullpointerException 참조 변수가 어떤 객체도 참조하고 있지 않을 때 뜨는 에러.
		System.out.println(hobby.hashCode());
		
		
		//char c = '여';
		String kind1 = "자동차";
		String kind2 = kind1; // kind1 변수에 저장되어 있는 번지를 kind2 변수에 대입
		kind1 = null; // "자동차"에 해당하는 String 객체는 쓰레기가 아님
		System.out.println("kind2: " + kind2);
	}
}