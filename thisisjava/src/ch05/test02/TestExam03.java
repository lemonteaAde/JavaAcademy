package ch05.test02;

import java.util.Scanner;

public class TestExam03 {

	public static void main(String[] args) {
		
		//5_07. 주어진 배열 항목에서 최대값을 구하는 출력 코드를 작성해보세요(for문 이용).
		//int[] array = { 1, 5, 3, 8, 2};
		
		int[] array = {1, 5, 3, 8, 2 };
		int tempMax = 0;
		int max = 0;
		for(int i = 0; i<array.length;i++) {
			
			for(int j =0; j<array.length;j++) {
			
				if(array[i]>array[j]) {
					tempMax = array[i];
					if(tempMax>max) {
						max = tempMax;
					}
				}
				
			}
		}
		System.out.println("최대값은: "+max+"입니다.");
		
		//5_08. 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해보세요(중첩 for문 이용).
		int sum = 0;
		double avg =0.0;
		int count = 0;
		int[][] array1 = { {95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};
		
		for(int i =0; i<array1.length; i++) {
			
			
			for(int j = 0; j<array1[i].length;j++) {
				count+=1;
				sum +=array1[i][j];
				avg =((double)sum/count);
				}
			}
		count = 0;
		System.out.println(sum);
		System.out.println(avg);
		
		//5_09. 학생들의 점수를 분석하는 프로그램을 만들려고 합니다. 키보드로부터 학생 수와 각 학생들의 점수를 입력받고 
		//      while 문과 Scanner의 nextLine() 메소드를 이용해서 최고 점수 및 평균 점수를 출력하는 코드를 작성해보세요.
		
		Scanner scanner = new Scanner(System.in);
		String Num;
		boolean run = true;
		int[] scores =null;
		max = 0;
		avg = 0;
		sum = 0;
		
		while(run) {
		System.out.println("-------------------------------------------------------");

		System.out.println("| 1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 |");

		System.out.println("-------------------------------------------------------");
		
		System.out.print("선택> ");
		String strNum1 = scanner.nextLine();
		
		switch(Integer.parseInt(strNum1)) {
		
			case 1: 
					System.out.print("학생수> ");
					Num = scanner.nextLine();
					scores=new int[Integer.parseInt(Num)];
					break;
			
			case 2: 
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]> ");
					Num = scanner.nextLine();
					if((0<=Integer.parseInt(Num))&&(Integer.parseInt(Num)<=100)) {
					scores[i]=Integer.parseInt(Num);
					} 
					else {
						System.out.println("입력가능한 점수는 0~100 사이입니다. 다시 점수입력을 선택하여 입력해 주세요.");
						break;
					}
				}
					break;
			
			case 3: 
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]: "+scores[i]);
					}
					break;
			
			case 4:
					for(int i =0; i<scores.length; i++) {
						
						for(int j =0; j<scores.length;j++) {
							
							if(scores[i]>scores[j]) {
								tempMax = scores[i];
								if(tempMax>max) {
									max = tempMax;
								}
								}
							}
						sum += scores[i];
						count+=1;
						avg = (double)sum/count;
					}
					count = 0;
					System.out.println("최고 점수: " + max);
					System.out.println("평균 첨수: " + avg);
					break;
			
			case 5: System.out.println("프로그램 종료");
					run =! run;
					break;
					
			default: System.out.println("선택 범위 이외의 값을 입력하셨습니다. 다시 입력하세요");
					break;
					}
		}
		}
	
	/*public static void stuNum( String i ) {
		int[] scores=new int[Integer.parseInt(i)];
		
		}*/
}