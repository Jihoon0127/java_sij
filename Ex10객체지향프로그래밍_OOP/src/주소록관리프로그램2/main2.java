package 주소록관리프로그램2;

import java.util.ArrayList;
import java.util.Scanner;

public class main2 {

	public static void main(String[] args) {

		// 설계도를 설계하는 공간
		Scanner sc = new Scanner(System.in);
		// Address자료형(클래스)를 관리하는 ArrayList를 생성
		ArrayList<Address2> addr = new ArrayList<Address2>();
		while (true) {
			System.out.print("[1]추가 [2]전체조회 [3]삭제 [4]검색 [5]종료 >> ");
			int select = sc.nextInt();

			if (select == 1) {
				// 추가
				// 이름, 나이, 전화번호 -- > Address2() --->addr
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("전화번호 : ");
				String phoneNumber = sc.next();
				Address2 a = new Address2(name, age, phoneNumber);
				addr.add(a);
			} else if (select == 2) {
				// 전체조회

				if (addr.size() == 0) {
					System.out.print("등록되 연락처가 없습니다.");
				}

				for (int i = 0; i < addr.size(); i++) {
					System.out.print(i + 1 + "."); // 1.
					// addr ----> i ----> getName()
					System.out.print(addr.get(i).getName() + "(" + addr.get(i).getAge() + "세)");
					System.out.print(addr.get(i).getPhoneNumber());
					System.out.println();
				}

			} else if (select == 3) {
				// 삭제
				if (addr.size() == 0) {
					System.out.print("등록된 연락처가 없습니다.");
				} else {
					System.out.print("삭제할 번호 입력 : ");
					int num = sc.nextInt();
					// 실제 삭제할 데이터의 위치(인덱스값) == 사용자 입력값-1
					addr.remove(num - 1);
				}

			} else if (select == 4) {
				// 검색
				System.out.print("검색할 이름 입력 : ");
				String name = sc.next();
				
				// 검색하고자 하는 데이터의 위치를 저장하는 변수
				int index = -1;
				
				
				//addr에 사용자가 입력한 name이 있는지 없는지 판단
				for(int i = 0; i<addr.size(); i++) {
					if(name.equals(addr.get(i).getName())) {
						System.out.println();
							index = i;
						
						System.out.print(addr.get(i).getName() + "(" + addr.get(i).getAge() + "세)");
						System.out.print(addr.get(i).getPhoneNumber());
						System.out.println();
						
						// index라는 변수에 어떤값이 들어있는지 판단
						if(index==-1) {
							System.out.println("검색한 이름의 정보가 없습니다.");
						}else {
							
							System.out.print(index+1+". ");
							System.out.print(addr.get(i).getName() + "(" + addr.get(i).getAge() + "세)");
							System.out.print(addr.get(i).getPhoneNumber());
							System.out.println();
						}
					}else {
						System.out.print("검색한 이름의 정보가 없습니다.");
					}
				}
				
			} else {
				System.out.print("프로그램 종료");
				break;
			}
		}

	}

}
