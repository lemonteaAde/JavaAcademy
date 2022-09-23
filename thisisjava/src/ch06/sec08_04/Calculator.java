package ch06.sec08_04;

public class Calculator {
	//정사각형 넓이
	double areaRectangle(double width) {//signature (double)
		return width*width;
	}
	//직사각형 넓이
	double areaRectangle(double width, double height) {//signature (double, double)
		return width*height;
	}
	
	
	public static void main(String[] args) {
		Calculator calc =new Calculator();
		System.out.println(calc.areaRectangle(100));
		System.out.println(calc.areaRectangle(100, 200));
	}

}
