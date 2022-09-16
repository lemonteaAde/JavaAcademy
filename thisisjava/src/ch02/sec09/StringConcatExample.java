package ch02.sec09;

public class StringConcatExample {

	public static void main(String[] args) {
		//숫자연산
		int result1 = 10 + 2 + 8; // 10+2+8=20
		System.out.println(result1);
		
		//결합연산Concatenation
		//String, 문자열의 우선순위가 기본타입 누구보다 우선순위가 높아서 문자열이 연산되는 차례면 기본형+문자열 => 문자열+문자열로 변환됨.
		String result2 = 10 + 2 + "8"; // 10+2+"8" => 12 + "8" => "12" + "8" => "128"
		String result3 = 10 + "2" + 8; // 10+"2"+8 ="10" + "2" + 8 =>"102" + 8 =>"102"+"8" => "1028"
		String result4 = "10" + 2 + 8; // "10"+2+8 =>"10" + "2" + "8"=>"102" + 8 =>"102"+"8"=> "1028"
		String result5 = "10" + (2 + 8); //"10"+(2+8) => "10" + 10 => "10" + "10"=>"1010" 
		
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);

	}

}
