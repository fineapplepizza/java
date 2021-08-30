
import java.util.Random;

public class 문제11 {

	public static void main(String[] args) {
		// 8칸 크기의 배열 선언
		int arr[] = new int[8];
		// 랜덤 생성
		Random rd = new Random();
		// for문
		System.out.print("배열에 있는 모든 값: ");
		for (int i = 0; i < arr.length; i++) {
			// 배열을 랜덤수로 초기화
			arr[i] = rd.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// 가장 큰 수
		int max = arr[0];
		// for문
		for (int i = 0; i < arr.length; i++) {
			if (max > i) {
				max = arr[i];
			}
		}
		System.out.println("가장 큰 값: " + max);
		// 가장 작은 수
		int min = arr[0];
		// for문
		for (int i = 0; i < arr.length; i++) {
			if (max < i) {
				min = arr[i];
			}
		}
		System.out.println("가장 작은 값: " + min);
	}

}
