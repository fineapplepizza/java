import java.util.Scanner;

public class 문제3_3차복습 {

	public static void main(String[] args) {
		//스캐너 생성하기
		Scanner sc = new Scanner(System.in);
		//정수N을 입력받는 출력문을 저장하고 입력받기
		System.out.print("정수입력: ");
		int n = sc.nextInt();
		//이차원배열을 생성하기
		int arr[][] = new int[n][n];
		//이차원배열의 값을 초기화하기
		int k=1;
		//for문을 사용하여 이차원배열의 값을 지정하기
		for(int i=0 ; i<arr.length;i++) {
			//if문을 사용해서 짝수행 값을 지정하기
			if(i%2==0) {
				for(int j=0;j<arr.length;j++) {
					arr[i][j] = k;
					k++;
				}
			}
			//홀수행 값을 지정하기 
			if(i%2==1) {
				for(int j=arr.length-1;j>=0;j--) {
					arr[i][j] = k;
					k++;
				}
			}
		}
		//이차원배열을 출력하기
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
