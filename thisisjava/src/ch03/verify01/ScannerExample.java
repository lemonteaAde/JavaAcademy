package ch03.verify01;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		//초를 입력받고 입력받은 초를 시 분 초로 나눠서 출력하는 p/g
		//예) 5000초 =1시간 23분
		//반복문으로 계속 할지 여부 확인 후 "q"를 입력받으면 종료하도록 작성
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("초를 입력하세요:");
		String strX =scanner.nextLine();
		int inputTime =Integer.parseInt(strX);
		
		int sec = inputTime%60;
		int minute = (inputTime%3600)/60;
		int hour = inputTime/3600;
		
		System.out.println(hour +"시간"+minute+"분"+sec+"초");
		
		System.out.println("중단하고 싶으면:q를 입력하세요:");
		String quitdata = scanner.nextLine();
		if(quitdata.equals("q")) {
			break;
			
		}
		
		}
		System.out.println("종료");
	}

}
