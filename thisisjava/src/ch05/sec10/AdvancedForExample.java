package ch05.sec10;

public class AdvancedForExample {
	public static void main(String[] args) {
		//배열 변수 선언과 배열 생성
		int[] scores = { 95, 71, 84, 93, 87 };
		int sum = 0;
		for(int i =0; i<scores.length;i++) { //int i는 index
			System.out.println(scores[i]+" ");
		sum+=scores[i];
		}
		System.out.println("총합: "+sum+ ", 평균: "+((double)sum/scores.length));
		System.out.println("\n----------------------");
		sum = 0;
		//향상된 for문 
		for(int a:scores) { //선언된 변수 int a는 반복자(iterator). 
			System.out.print(a+" ");
			sum+=a;
		}
		System.out.println("총합: "+ sum+", 평균: "+((double)sum/scores.length));
		System.out.println("\n----------------------");
		
		//배열 항목 전체 합 구하기
		 sum = 0; 
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수 총합 = " + sum);
		//배열 항목 전체 평균 구하기
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = " + avg);
	} 
}