package 최종문제복습;

public class 문제28번 {

	public static void main(String[] args) {
		//원본 출력
		System.out.println("원본");
		//이차원배열 생성
		int arr[][] = new int [5][5];
		int array[][] =new int[5][5];
		//이차원 배열 값 변수 초기화
		int k =1;
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=k ;
				k++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		//90도 회전
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				array[i][j] = arr[j][4-i];
			}
		}
		
		//90도 출력
		System.out.println("90도 회전");
	    for(int i=0;i<array.length;i++) {
	    	for(int j=0;j<array.length;j++) {
	    		System.out.print(array[i][j]+"\t");
	    	}
	    	System.out.println();
	    }

	}

}
