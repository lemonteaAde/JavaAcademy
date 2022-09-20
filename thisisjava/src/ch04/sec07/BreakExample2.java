package ch04.sec07;

public class BreakExample2 {

	//두개의 주사위를 던져서 두 눈의 합이 6이 될때 반복문을 빠져나가도록 수정하시오.
	// x+y=6(1<= x <=6, 1<= y <=6)
	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random()*6) + 1; // 1<= 범위 <7
			int num2 = (int)(Math.random()*6) +1;
			System.out.println("num1: " + num1+ ", num2: "+num2+"\n");
			if(num1+num2 == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");

	}

}
