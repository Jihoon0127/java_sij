package 물품관리프로그램;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 설계도를 사용하려면 main()안에서 작성해야된다.
		// product : 사용자 정의 자료형
		// product는 String, int, int가 저장되는 하나의 자료형
		// 내가 만든 자료형(객체 자료형)
		Scanner sc = new Scanner(System.in);
		// product 자료형을 관리하는 ArrayList 만들기
		ArrayList<product> ps = new ArrayList<product>();
		ArrayList<product> al2 = new ArrayList<product>();
		ArrayList<product> al3 = new ArrayList<product>();
		
		String name ;
		int price;
		int amount;
		
		while(true) {
		System.out.print("[1]물건 추가 [2]예상 판매량 조회 [3]종료 >> ");
		int select = sc.nextInt();
		
		if(select == 1) {
				// 물건 추가
			System.out.print("물건 이름 : ");
            sc.nextLine();
            name = sc.nextLine();
            
            System.out.print("단가 : ");
            price =sc.nextInt();
            
            System.out.print("수량 : ");
            amount = sc.nextInt();
            //product (설계도, 자료형)
            // 1. 사용자한테 입력받은 name, price,amonut를 product자료형으로 묶어주자
            product p = new product(name, price, amount);
            // 2. ps.add()
            ps.add(p);
           
		}else if(select ==2) {
			// 에상 판매량 조회
			//ps안에 있는 데이터들을다 확인(출력)
			System.out.println("제품명      단가     수량");
		for(int i = 0 ; i<ps.size(); i++) {
			System.out.println(ps.get(i).getName() + " " +
		ps.get(i).getUnitPrice()+ "  " +ps.get(i).getamount());
		}
			//판매 시 전체 매출
			// p 가격* p 수량 + p 가격 * p수량
		int sum = 0;
		for(int i = 0; i< ps.size(); i++) {
			sum += (ps.get(i).getUnitPrice()*ps.get(i).getamount());
		}
		System.out.println("판매시 매출 : "+sum);
			
			//판매 시 전체 매출
		}else if(select ==3) {
			// 프로그램 종료
			System.out.println("프로그램 종료");
			break;
		}else {
			System.out.println("숫자를 다시 입력하세요");
		}
		
		
	
	}

}
}
