package ch03.test01;

public class TestExam01 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
		
		int score =85;
		String result =(!(score>90))? "가":"나";
		System.out.println(result);

		int pencils = 534;
		int students = 30;
		
		//학생 한 명이 가지는 연필 수
		int pencilsPerStudent = (pencils/students);
		System.out.println(pencilsPerStudent);
		
		//남은 연필 수
		int pencilsLeft = (pencils%students);
		System.out.println(pencilsLeft);
		
		int value =356;
		System.out.println((value -(value%100)));
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		
		double area = ((lengthTop+lengthBottom)*height/2.0);
		System.out.println(area);
		area = ((lengthTop+lengthBottom)*height*1.0/2);
		System.out.println(area);
		area = ((double)(lengthTop+lengthBottom)*height/2);
		System.out.println(area);
		area = ((double)((lengthTop+lengthBottom)*height/2));
		System.out.println(area);
		
		 x = 10;
		 y = 5;
		 System.out.println((x>7) && (y<=5));
		 System.out.println( (x%3 == 2) || (y%2 != 1));
	
		 double X = 5.0;
		 double Y = 0.0;
		 double Z = 5 % Y;
		 if(Double.isNaN(Z)) {
			 System.out.println("0.0으로 나눌 수 없습니다.");
		 }else {
			 double result1 = Z + 10;
			 System.out.println("결과: " + result1);
		 }
		 
	}

}
