package javaf;

public class r_q23 {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];

		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        arr[i][j] = 5 * (5 - j) -i;
		    }
		}

		for (int i = 0; i < arr.length; i++) {
		    for (int j = 0; j < arr[i].length; j++) {
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}

	}
}

