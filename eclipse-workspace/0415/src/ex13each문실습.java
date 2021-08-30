
public class ex13each문실습 {

	public static void main(String[] args) {
		
		int [] arr = {3,4,9,21,71,100};
		
		// for-each 홀수 출력하기!
		for(int i : arr) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
		}

	}

}
