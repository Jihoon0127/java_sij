package javaf;

public class b4 {

	public static void main(String[] args) {
		System.out.println(getMiddle("power"));
		
		
		public static String getMiddle(String a) {
		  
			int middle = a.length() / 2;
		    if (a.length() % 2 == 0) {
		        return a.substring(middle - 1, middle + 1);
		    } else {
		        return a.substring(middle, middle + 1);
		    }
		}
	}
}


	


