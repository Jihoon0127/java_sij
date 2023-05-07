package pratice;

public class q6 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 77, j = 1; i >= 1; i--,j++) {
			System.out.print("{" + i+"*"+j +"}" +" + " );
			
			sum = sum + i*j;
			
		}
		
		System.out.printf("\n",sum);
	}

}
