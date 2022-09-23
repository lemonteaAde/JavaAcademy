package ch06.sec08;

public class ReturnExample {
	
	void method1() {
		System.out.println("메소드에서");
		System.out.println("reutrn문이 하는 역할은");
		System.out.println("reutrn문 전까지의 명령실행 후 ");
		System.out.println("reutrn문 에서 실행을 멈추고");
		System.out.println("메소드를 호출한 곳으로 되돌아 가는 명령");
		return;
}
	
	public static void main(String[] args) {
		ReturnExample re= new ReturnExample();
		re.method1();
		System.out.println("끝");
		

	}

}
