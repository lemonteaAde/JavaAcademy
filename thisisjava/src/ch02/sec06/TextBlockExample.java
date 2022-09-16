package ch02.sec06;

public class TextBlockExample {
	public static void main(String[] args) {
		String str1="" +
	"{\n" +
	"\t\"id\":\"winter\",\n" +
	"\t\"name\":\"눈송이\"\n" +
	"}";
		
		System.out.println(str1);
//""을 포함하고, 여러 줄의 여러 문자를 출력하려면 위와 같이 복잡했음. 그러나 
		
		//java13부터 도입된 기능 """
		String str2="""
{
	"id":"winter",
	"name":"눈송이"
}				
				""";
		System.out.println(str2);
//다음과 같이 간소해짐.

		//java14에서는 \ 역슬래시 하나만 사용하면 다음과 같이 줄이음 기능 추가됨.
		String str3 = """
				나는 자바를\
				학습합니다.
				나는 자바 고수가 될 겁니다.
				""";
		System.out.println(str3);

	}

}
