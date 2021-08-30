package 최종문제;

public class 문제28 {

	public static void main(String[] args) {
		// 이차원 배열 생성
		int arr[][] = new int[5][5];
		// 이차원 배열 값 초기화
		int k = 1;
		// for문 이차원배열 값 저장
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= 0; j--) {
				arr[j][i] = k;
				k++;
			}
		}
		// for문 이차원배열 90도회전
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
