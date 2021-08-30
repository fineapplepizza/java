package 알고리즘문제예시2차;

import java.util.Random;

public class 문제5 {

	public static void main(String[] args) {
		// 8칸 크기의 배열의 선언
		int [] array = new int[8];
		// 랜덤수를 불러오는 기능
		Random rd = new Random();
		
		// for문을 이용하여 배열을 랜덤수로 초기화
		for(int i =0;i<array.length;i++) {
			 array[i] = rd.nextInt(100)+1;
			 //랜덤수로 초기화된 array배열 출력문 작성
			 System.out.print(array[i]+" ");
		}
		System.out.println();
		
        //가장 큰 값 max변수를 array[0]으로 초기화
		int max = array[0];
		// for문을 이용하여 array배열에 있는 숫자를 max와 비교
		for(int i = 0; i<array.length;i++) {
			if(max < array[i]) { //if문을 활용하여 array[i]가 max보다 큰지 판단
				max = array[i]; // array[i]가 max보다 크면 max에 대입
			}
			
		}
	    // 가장 큰 값을 출력문 작성
		System.out.println(max);
		
		// 가장 작은 값 min변수를 array[0]으로 초기화
		int min = array[0];
		for(int i=0;i<array.length;i++) { //array배열에 있는 숫자를 min과 비교하기 위해 for문 사용
			if(min>=array[i]) {//if문을 활용하여 array[i]가 min보다 작거나 같은지 판단
				min = array[i];//array[i]가 min보다 작거나 같으면 변수 min에 대입
			}
		}
		// 가장 작은 값 출력문 작성
		System.out.println(min);

	}

}
