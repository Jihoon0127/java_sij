package 중간시험;

public class Ex07 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j = 5-i; j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
