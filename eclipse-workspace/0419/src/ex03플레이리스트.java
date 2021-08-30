import java.util.ArrayList;
import java.util.Scanner;

public class ex03플레이리스트 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>(); //노래를 담아줄 리스트(저장할공간)
		
		while(true) {
			System.out.print("[1]노래추가 [2]노래삭제 [3]노래조회 [4]종료>> ");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.println("========현재 재생 목록========");
				 if(arr.size() == 0) {
					 //노래가 없을때
					 System.out.println("재생 목록이 없습니다!");
				 }else{
					 //노래가 추가됐을때
					 for(int i = 0; i<arr.size(); i++) {
						 System.out.println((i+1) + "." + arr.get(i));
					 }
				 }	
				System.out.println("===========================");
				System.out.println();
				System.out.print("[1]마지막 위치에 추가 [2]원하는 위치에 추가>>");
				int num2 = sc.nextInt();
				if(num2 == 1) {
					//마지막에 위치를 추가
					System.out.print("추가 할 노래 입력>> ");
					String song = sc.next();
					arr.add(song);
					System.out.println("추가가 완료되었습니다.");
					
				}else if(num2 == 2) {
					//원하는 위치를 추가
					System.out.print("추가 할 노래 입력>> ");
					String song2 = sc.next();
					System.out.print("추가 할 위치 입력>> ");
					int num3 = sc.nextInt();
					System.out.println("추가가 완료되었습니다.");
					//원하는 위치에 데이터 넣기
					// 사용자한테 편의성을 주기 위해서 인덱스 -1
					arr.add(num3-1,song2);
				}
				
				
			}else if(num == 2) {
				System.out.println("========현재 재생 목록========");

				//삭제 할 노래가 없을때
				if(arr.size() == 0) {
					//데이터가 없다.

					System.out.println("재생 목록이 없습니다.");
				
			}else  {
				//데이터가 존재한다.
				//삭제 할 노래가 있을 때
				for(int i = 0; i<arr.size(); i++) {
					System.out.println((i+1) + "." +arr.get(i));
				}
				System.out.println("===========================");
				System.out.print("[1]선택삭제 [2]전체삭제>> ");
				int num4 = sc.nextInt();
				if(num4 == 1) {
					//선택 삭제 선택하기
					System.out.print("삭제할 노래 선택>>");
					int num5 = sc.nextInt();
					arr.remove(num5-1);
				}else if(num4 == 2) {
					//전체 삭제 하기
					arr.removeAll(arr);

					System.out.println("전체 리스트가 삭제 되었습니다.");
					
				}
				
				
			}
				
				
				
			}else if(num == 3) {
				System.out.println("========현재 재생 목록========");
				 if(arr.size() == 0) {
					 //노래가 없을때
					 System.out.println("재생 목록이 없습니다!");
				 }else{
					 //노래가 추가됐을때
					 for(int i = 0; i<arr.size(); i++) {
						 System.out.println((i+1) + "." + arr.get(i));
					 }
				 }	
				System.out.println("===========================");
				
			}else if(num == 4) {
				System.out.println("종료됐습니다.");
				break;
			}
		}
		

	}

}
