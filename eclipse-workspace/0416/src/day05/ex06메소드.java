package day05;

public class ex06�޼ҵ� {

	public static void main(String[] args) {
		// �迭�� �����ϴ� ���
		// int arr[]; ���� (�������̶� �迭 �����ؼ� ã��)
		// int [] arr;(�迭�� ã�Ƴ�)
		int[] array = {1,2,3,4,8,7,9,10};
		arrayToString(array);

	}
	public static void arrayToString(int [] arr) {
		 for(int i = 0; i < arr.length ; i++) {
			 System.out.print(arr[i] + " ");
		 }
	}

}
