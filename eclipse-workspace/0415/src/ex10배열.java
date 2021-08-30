import java.util.Iterator;
import java.util.Scanner;



public class ex10배열 {

	public static void main(String[] args) {
		
		//배열 생성
		int [] score = new int[5];
		
		//숫자를 입력하고 저장하기
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<score.length ; i++) {
			
			System.out.print((i+1) + "번째 입력: ");
			score[i] = sc.nextInt();
		}
		
		// 입력된 점수 출력하기
		System.out.print("입력된 점수: ");
		for(int i = 0 ;  i < score.length ; i++) {
			System.out.print(score[i] + " ");
		}
		
		//최고 점수 출력 하기
		int max = score[0];
		for(int i = 0 ; i < score.length ; i++) {
			 if(max < score[i]) {
				 
				 max = score[i];
				
			 } 
			 }
		System.out.println();
		 System.out.println("최고 점수: " + max);
	    //최소 점수 출력하기
			 int min = score[0];
		  for(int j = 0 ; j< score.length ; j++) {
			  if(min > score[j]) {
				  
				  min = score[j];
				  
			  }
		  }
		  System.out.println("최소 점수: " + min);
		

	}

}
