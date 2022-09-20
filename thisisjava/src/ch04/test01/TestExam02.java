package ch04.test01;

import java.util.Scanner;

public class TestExam02 {

	public static void main(String[] args) {
	
		//4_1. 조건문과 반목문에 대해 잘못 설명한 것은 무엇입니까? -> 2번: switch 문에서 사용할 수 있는 변수의 타입은
		//                                                      int, double이 될 수 있다.
		
		//4_2. 문제에 주어진 switch문을 Expression(표현식)으로 변경해서 작성해 보시오.
		String grade = "B";
		
		int score1 = switch(grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			//Java 13부터 가능
			yield result;
		}
		default -> 60;
	};
	System.out.println("score1: " + score1);

	
	//4_3. for 문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 출력하는 코드를 작성
	int sum = 0;
	int i;
		
	for(i=1; i<=100; i++) {
		if(i%3==0)
		{
		sum += i; //복합 대입 연산
		}
	}
		
	System.out.println("3의 배수의 총합 : " + sum);
	
	
	//4_4. while문과 Math.random()메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을(눈1, 눈2)형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
	// 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
	
	while(true) {
		int num1 = (int)(Math.random()*6) + 1; // 1<= 범위 <7
		int num2 = (int)(Math.random()*6) +1;
		System.out.println("num1: " + num1+ ", num2: "+num2+"\n");
		if(num1+num2 == 5) {
			break;
			}
		}
	System.out.println("프로그램 종료");
	
	
	//4_5. 중첩 for문을 이용하여 방정식 4x+5y=60의 모든 해를 구해서 (x, y)형태로 출력하는 코드를 작성해 보세요. 단 x와 y는 10이하의 자연수 입니다.
	
	for(i=1;i<=10;i++) {
		
		for(int j=1;j<=10;j++) {
			
			int solve = (60-(4*i))-(5*j);
			
			if(solve == 0) {
				System.out.println("(" + i + ", " + j + ")");
				}
			}	
		}
	
	
	//4_6. for문을 이용해서 다음과 같은 실행 결과가 나오는 코드를 작성해보세요.
	
	for(i=1;i<=5;i++) {
		
		for(int j=1;j<=i;j++) {
		
			System.out.print("*");
		}
		System.out.print("\n");
		}
	
	
	//4_7. while문과 Scanner의 nextLine()메소드를 이용해서 교재에서의 실행 결과와 같이 키보드로부터 입력된 데이터로
	//     예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요.
	
	Scanner scanner = new Scanner(System.in);
	boolean run = true;
	int balance = 0;
	int tempBalance=0;

	while(run) {
		System.out.println("----------------------------------");
		System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
		System.out.println("----------------------------------");
		System.out.print("선택: ");
		//키보드로 부터 값 입력받기
		String strNum = scanner.nextLine();

		if(strNum.equals("1")) { // if("1".equals(strNum)) 이랑 같다
			System.out.println("예금액: ");
			String strNum2 = scanner.nextLine();
			balance+=Integer.parseInt(strNum2);
			
		} else if(strNum.equals("2")) {
			System.out.println("출금액: ");
			tempBalance=balance;
			String strNum2 = scanner.nextLine();
			balance-=Integer.parseInt(strNum2);
			
			if(balance<0) {
				balance=tempBalance;
				System.out.println("잔고에 남아있는 금액보다 출금액이 커 인출할 수 없습니다.(현재 잔고: " + balance +"원)");
			}
			
		} else if(strNum.equals("3")) {
			
			System.out.println("잔고 = "+balance);
		}
		
		else if(strNum.equals("4")) { //while문은 반복문을 빠져나가는 조건이 블럭 내에 존재해야함.
			run =!run; //run = false; 와 같다.
		}
		
	}

	System.out.println("프로그램 종료");
	}
}
