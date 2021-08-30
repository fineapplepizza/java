package 페스티벌;

public class 배열 {

	public static void main(String[] args) {
		System.out.println("원본");
		int arr[][]=new int [5][5];
		int array[][]=new int[5][5];
		int k=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=k;
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
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				array[i][j]=arr[j][4-i];
			}
		}
		for(int i=0; i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
