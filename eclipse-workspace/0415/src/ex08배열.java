import java.util.Scanner;

public class ex08배열 {

	public static void main(String[] args) {
		
	
		//크기가 5인 정수형 배열 생성
		int [] studentGrade = new int[5];
		//점수를 입력하여 배열에 저장
		//스캐너 기능 불러오기
		Scanner sc = new Scanner(System.in);
		
		//점수를 연속적으로 입력 할 수 있는 for문 작성
		for(int i = 0 ;  i < studentGrade.length ; i++) {
			
			System.out.print((i+1) + "번째 입력 >>");
			// 입력값 배열에 넣어주기
			  studentGrade[i] = sc.nextInt();
			  
			  
		}
		System.out.print("입력된 점수 : ");
		//3. 입력된 모든 점수를 출력! -> 반복적으로 출력 for문
		for(int i = 0; i < studentGrade.length; i++) {
			System.out.print(studentGrade[i] + " ");
		}

	}

}
