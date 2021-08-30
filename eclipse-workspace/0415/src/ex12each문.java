
public class ex12each문 {

	public static void main(String[] args) {
		
		// for each문 사용하기
		// for문과는 다르게 배열을 함께 활용하여 사용할 수 있는 반복문
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		//int i 에다가 arr의 값을 하나씩 가져오겠습니다.
		for(int i : arr) {
			System.out.print(i + " ");
		}

	}

}
