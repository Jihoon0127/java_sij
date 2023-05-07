package javaf;

public class q23 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		
		int num = 1;
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr.length; j++) {
			arr[i][j] = num++;
		}
	}
		for (int i = 0; i<arr.length; i++) {		// 반복
			for (int j=0; j<arr[i].length; j++) {	// 각각의 1차원배열 하나 초기화
			System.out.print(arr[j][i]+"\t");
			}
			System.out.println();
		}
	}
}

