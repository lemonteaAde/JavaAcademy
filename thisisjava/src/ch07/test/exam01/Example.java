package ch07.test.exam01;

public class Example {
	public static void action(A a) {
		a.method1();
		if(a instanceof C) {
			c.method2();
		}
	}
	
	public static void main(String[] args) {
		action(new A());
		action(new B());
		action(new C());
		}

}
