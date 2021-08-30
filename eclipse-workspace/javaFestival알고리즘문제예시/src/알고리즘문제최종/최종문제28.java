package 알고리즘문제최종;

public class 최종문제28 {

	public static void main(String[] args) {
		// 이차원 배열 생성하기
		int arr[][] = new int[5][5];
		// 이차원배열 값을 저장하는 변수 초기화하기
		int k = 1;
		// for문을 사용하여 이차원배열 출력하기
		for (int i = 0; i < arr.length; i++) {// 열의 for문
			for (int j = arr.length-1; j >=0; j--) {// 행의 for문
				arr[j][i] = k;
				k++; // 증가연산자를 사용하여 값을 1씩 올리기
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
