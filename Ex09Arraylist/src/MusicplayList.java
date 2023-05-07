import java.util.ArrayList;
import java.util.Scanner;

public class MusicplayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	      ArrayList<String> al = new ArrayList<String>();

	      int choice; // 사용자가 맨 처음 선택 : 1, 2, 3
	      int i;       // al번호
	      int add;    // 노래 추가 선택 : 1, 2
	      int delete; // 노래 삭제 선택 : 1, 2
	      String song;    // 추가할 노래 제목

	      do {
	         System.out.print("[1]노래 추가  [2]노래 삭제  [3]종료 >> ");
	         choice = sc.nextInt();
	         
	         switch (choice) {
	         
	         case 1: // 노래 추가
	            
	            printList(al);
	            
	            System.out.print("[1] 마지막 위치에 추가  [2]원하는 위치에 추가 >> ");
	            add = sc.nextInt();   // 1~2
	            
	            if (add == 1) {    // 1) 마지막 위치에 추가
	               System.out.print("추가 할 노래 입력 : ");
	               sc.nextLine(); // 엔터키 처리하기 == 버퍼 비워주기
	               
	               // next() 써버리면, 노래 제목에 띄어쓰기 있으면 어쩌려구~~~
	               // 위에 add에 숫자 치고 엔터키 쳐버려서 1까지는 nextInt에서 처리하고, 그 밑 nextLine에서 위에서 입력한 엔터키를 처리해버림. 그래서끝나버림
	               song = sc.nextLine();
	               al.add(song);   
	               System.out.println("추가가 완료되었습니다.");
	            } 
	            else if (add == 2) { // 2) 중간에 추가
	               System.out.print("추가 할 노래 입력 : ");
	               sc.nextLine();
	               song = sc.nextLine();
	               System.out.print("추가할 위치 입력 >> ");
	               i = sc.nextInt();
	                  if (i > al.size()) {
	                     al.add(song);
	                  } else {
	                     al.add(i - 1, song); // 선택한 곳에 노래 추가
	               }
	            } else {
	               System.out.println("1과 2중에 선택해주세요!");
	            }
	            
	            break;

	         case 2: // 노래 삭제

	               printList(al);
	            
	               if (al.size() == 0) {
	                  System.out.println("삭제할 노래가 없습니다.");
	               }

	            System.out.print("[1]선택삭제  [2]전체삭제 >> ");
	            delete = sc.nextInt();
	            
	            if (delete == 1) {

	               System.out.print("삭제할 노래 선택 >>");
	               al.remove(sc.nextInt() - 1);
	               System.out.println("노래가 삭제되었습니다.");

	            } else if (delete == 2) {
	               al.clear();
	               System.out.println("노래가 삭제되었습니다.");
	            } else {
	               System.out.println("1과 2중에 선택해주세요!");
	            }

	            break;
	         }

	         
	      } while (choice != 3);
	      System.out.println("프로그램이 종료되었습니다.");
	      
	      
	   } public static void printList(ArrayList<String> al) {
	   // 재생목록 "출력" 메서드 만들기
	   
	      // 오류 난다고 뮤직리스트 여기서 새로 리스트 생성하는 거 아니다!!!!!
	      // -> 여기서 쓰는 리스트랑 위에서 쓰는 리스트랑 아예 다른 것이니까~!
	      // 위에서 쓰던 리스트 그대로 넘겨주기 => 매개변수로
	      
	      System.out.println("==현재 재생 목록==");
	      
	      if (al.size() == 0) {
	         System.out.println("재생 목록이 없습니다.");
	      } 
	         for (int j = 0; j < al.size(); j++) {
	            System.out.println((j + 1) + ". " + al.get(j));
	         }
	      
	      System.out.println("============");
	   }
}

	   