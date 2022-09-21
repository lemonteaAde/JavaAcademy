package ch05.sec09;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		//배열 복사: 길이 3인 배열 
		int[] oldIntArray = { 1, 2, 3 };//[1][2][3]
		int[] oldIntArray2 = { 4, 5, 6 };//[4][5][6]
		//길이 5인 배열을 새로 생성
		int[] newIntArray = new int[oldIntArray.length+oldIntArray2.length]; //[0][0][0][0][0]
		
		//배열 항목 복사(복사되는 배열의 특정 index부터 시작 가능)
		
		//첫 번째 배열 복사
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		//두 번째 배열 복사
		for(int i=0; i<oldIntArray2.length; i++) {
			newIntArray[oldIntArray.length+1] = oldIntArray2[i];
		}
		
		//배열 항목 출력
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}
}