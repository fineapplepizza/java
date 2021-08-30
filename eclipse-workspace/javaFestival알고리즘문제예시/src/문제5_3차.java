import java.util.Random;

public class 문제5_3차 {

	public static void main(String[] args) {
		//랜덤수 생성하기
		Random rd = new Random();
		//배열 생성하기
		int arr[] = new int[6];
		//for문을 사용해서 행운의숫자 출력하기
		for(int i=0; i<arr.length;i++) {
			arr[i]=rd.nextInt(45)+1;
			//중복값 제거하기
			for(int j=0;j<i;j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		//로또프로그램 출력하기
		for(int i=0; i<arr.length;i++) {
				System.out.println("행운의숫자"+arr[i]);
			
		}
		
		

	}

}
