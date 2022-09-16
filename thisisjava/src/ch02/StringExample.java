package ch02;

public class StringExample {

	public static void main(String[] args) {
		//참조타입의 변수선언
		//타입 변수명 = new 참조타입생성자();
		String message = new String("hello");
		System.out.println(message);
		
		//타입 변수명 = 문자열리터럴
		String name="홍길동";
		System.out.println(name);
		
		//escape문자 - 인용부호용 문자 \"
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		//\t는 문자 t가 아니고 tab만큼 띄우는 기능을 함. 띄어쓰기를 넣은 것은 띄어쓰기도 적용이 된다는 것을 보여주기 위함.
		str = "번호     \t이름\t직업";
		System.out.println(str);
		
		//※print와 println의 차이 : println은 출력 후 자동 줄내림, print는 출력 후 바로 이어 붙일 수 있게 둠.
		System.out.print("나는야 ");
		System.out.print("퉁퉁이");

		//print 구문 안에 \n을 두면 줄내림 가능. 
		System.out.print("\n나는야\n");
		System.out.print("퉁퉁이\n");
		//그렇다면, print 안 ""속에서 엔터도 적용 되는지 확인해봄.
		System.out.print("나는야"
				+ "퉁"
				+ "퉁"
				+ "이\n");
		//확인 결과, 엔터 넣으면 +"" 가 입력 되어 추가적으로 문자 넣게 해줌.
		
		//역슬래시u는 16진수 유니코드에 해당하는 문자를 나타냄. 
		//즉, D64D는 16진수 유니코드 상에서 '홍'이며, ACCA는 '곊'
		System.out.println("\uD64D" +"\uACCA");
		
		//디렉터리 경로 \ 표시용 \\
		System.out.println("E:\\Users\\admin\\eclipse-workspace\\thisisjava\\src\\ch01\\Hello.java");
		

	}

}
