package 주소록관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Address> ps = new ArrayList<Address>();
		
		while(true) {
		System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 : ");
		int menu = sc.nextInt();
		if(menu ==1) {
			System.out.print("이름: ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.print("나이 : ");
            sc.nextInt();
            int age =sc.nextInt();
            
            System.out.print("전화번호 : ");
            sc.nextInt();
            int phoneNumber = sc.nextInt();
            
           Address p = new Address(name, age, phoneNumber);
          
            ps.add(p);
           
           
		}else if(menu ==2) {
			for(int i = 0; i< ps.size(); i++) {
				System.out.print(ps.get(i).getName()+
						ps.get(i).getAge()+ps.get(i).getPhoneNumber());
			}
		}else if(menu ==3) {
			System.out.print("삭제할 번호 입력 : ");
			int d1 = sc.nextInt();
			ps.remove(d1);
			
			
		}else if(menu ==4) {
			
			
		}else if(menu ==5){
			System.out.print("프로그램 종료");
			break;
		}else {
			
		}
			
	}
	}

}
