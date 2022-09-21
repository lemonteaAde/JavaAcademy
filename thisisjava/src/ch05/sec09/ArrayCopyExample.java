package ch05.sec09;

public class ArrayCopyExample {
	public static void main(String[] args) {
		//얕은 복사(shallow)
		int[] arr1 = {1, 2, 3};
		int[] arr2 = arr1;
		arr2[1] = 9;
		for(int i=0; i<arr1.length;i++)
			System.out.print(arr1[i]+" ");
		System.out.println("\n-------------------");
		for(int i=0; i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
		System.out.println("\n-------------------");
		
		//깊은 복사 (deep)
		int[] arr3 = {1,2,3};
		int[] arr4 = new int[arr3.length];
		
		for(int i =0;i<arr3.length;i++) {
			arr4[i] =arr3[i];
		}
		
		arr4[1]=9;
		
		for(int i =0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
			System.out.println("\n-------------------");
		for(int i =0;i<arr4.length;i++) {
			System.out.print(arr4[i]+" ");
		
			System.out.println("\n-------------------");
		}
		
		
		//길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		//길이 5인 배열을 새로 생성
		String[] newStrArray = new String[5];
		//배열 항목 복사
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//배열 항목 출력
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}