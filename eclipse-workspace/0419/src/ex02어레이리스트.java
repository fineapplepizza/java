import java.util.ArrayList;

public class ex02어레이리스트 {

	public static void main(String[] args) {
		// ArrayList >> 자바 배열의 한계를 극복하는 방법
		// 자바배열은 사이즈가 고정되어있다. 3칸짜리에는 데이터 3개만 넣을 수 있는 한계
		// arrayList > 데이터를 넣을때마다 공간을 자동으로 할당 >> python List 개념 유사
		
		// 1.생성하기
		String[] arr = new String[3];
		ArrayList<String> arr2 = new ArrayList<String>(); 
		// <>은 타입을 넣어줌
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		
		//1. 어레이리스트 맨뒤에 데이터 넣기.
		arr2.add("임명진");
		arr2.add("정형");
		arr2.add("채수민");
		//2. 어레이리스트속 데이터를 가지고 올때는 .get(index)기능 활용
//		System.out.println(arr2.get(0));
//		System.out.println(arr2.get(1));
//		System.out.println(arr2.get(2));
		
		//3.전체 데이터 출력
		//4.배열의 길이를 구해올때는 lenth가 아니고 .size();
		for(int i = 0 ; i< arr2.size(); i++) {
			System.out.println(arr2.get(i)+" ");
		}
		System.out.println("=========================");
		//5. 원하는 위치에 데이터 넣기
		arr2.add(0,"차준섭");
		for(int i = 0 ; i< arr2.size(); i++) {
			System.out.println(arr2.get(i)+" ");
		}
		System.out.println("=========================");

		
		//6.원하는 위치 데이터 삭제(인덱스번호만 지우면됨)
		arr2.remove(0);
		for(int i = 0 ; i< arr2.size(); i++) {
			System.out.println(arr2.get(i)+" ");
		}
		System.out.println("=========================");


		//7. 전체 데이터 지우기	
       arr2.removeAll(arr2);
       for(int i = 0 ; i< arr2.size(); i++) {
			System.out.println(arr2.get(i)+" ");
       }

		
	}

}
	
