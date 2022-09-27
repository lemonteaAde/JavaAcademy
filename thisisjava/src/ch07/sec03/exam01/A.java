package ch07.sec03.exam01;

public class A extends Object{ //자바에서 모든 클래스의 최상위 부모는 Object.(extends Object는 기본으로 생략가능)
	public A() {
		System.out.println("A생성자");
	}
}

//부모클래스의 생성자는 상속안됨.
//super()로만 호출됨.
class B extends A{
	public B(){
		super();//컴파일시 추가됨.
		System.out.println("B생성자");
	}
}
