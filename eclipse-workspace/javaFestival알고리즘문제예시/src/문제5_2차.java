import java.util.Random;

public class 문제5_2차 {

	public static void main(String[] args) {
		//8칸 크기의 배열을 선언
		int arr[]= new int[8];
		//랜덤수 생성
		Random rd = new Random();
		//for문을 이용하여 배열에 있는 값을 출력
		System.out.print("배열에 있는 모든 값: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=rd.nextInt(99)+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//가장 큰 값을 출력
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("가장 큰 값 :"+max);
		//가장 작은 값을 출력
		int min = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("가장 작은 값: "+min);

	}

}
