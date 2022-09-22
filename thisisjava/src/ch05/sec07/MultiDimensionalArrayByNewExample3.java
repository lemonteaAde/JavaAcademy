package ch05.sec07;

public class MultiDimensionalArrayByNewExample3 {

	public static void main(String[] args) {

		String[] names= {"홍길동", "일지매", "임꺽정", "김기남"};

		int[][] scores = {{80, 83, 85}, {86, 90, 92}, {88, 87, 95}, {80, 87, 90}};

		System.out.println("-----------------성적표-----------------");

		System.out.println("| 이름\t| 국어\t| 영어\t| 수학\t| 총점 |");

		System.out.println("---------------------------------------");
		
		int[] vsum = new int[3];
		int totalSum =0;

		for(int i =0; i<scores.length; i++) {
			
			int sum = 0;
			
			System.out.print("|"+names[i]+"\t|");
			
			for(int j = 0; j<scores[i].length;j++) {
				
				System.out.print(scores[i][j]+"\t|");
				
				sum +=scores[i][j];
				vsum[j] += scores[i][j];
				}
			
			System.out.println(sum);
			totalSum +=sum;
			}
		
		System.out.println("---------------------------------------");
		System.out.println("|총합\t|" +vsum[0]+"\t|"+vsum[1]+"\t|"+vsum[2]+"\t|"+totalSum);
		}
	}