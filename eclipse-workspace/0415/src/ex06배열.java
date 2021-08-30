
public class ex06배열 {

	public static void main(String[] args) {

		//배열 생성
		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int cnt = 0;
		//홀수 값을 출력하는 프로그램 작성
		System.out.print("array에 들어있는 홀수는");
		for(int i = 0 ; i < arr.length ; i++) {
			
			
			if(arr[i]%2 == 1) {
				
				System.out.print(arr[i] + " ");
				cnt++;
			}
		
		}
		System.out.println("이며,");
		System.out.println( "총"+ cnt +"개 입니다.");
	}

}
