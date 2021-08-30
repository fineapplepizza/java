package day05;

public class ex06메소드 {

	public static void main(String[] args) {
		// 배열을 선언하는 방법
		// int arr[]; 가능 (정수형이랑 배열 포함해서 찾음)
		// int [] arr;(배열만 찾아냄)
		int[] array = {1,2,3,4,8,7,9,10};
		arrayToString(array);

	}
	public static void arrayToString(int [] arr) {
		 for(int i = 0; i < arr.length ; i++) {
			 System.out.print(arr[i] + " ");
		 }
	}

}
