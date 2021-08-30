
public class ex07for문 {

	public static void main(String[] args) {
		
		// 21~57까지 출력

		for(int i = 21; i <= 57; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 96~53까지 출력

		for(int i = 96; i >= 53; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		// 21~57까지 출력
		
//		for(int i = 21; i <= 57; i++) {
//			//홀수 판단
//			if(i%2==1) {
//				System.out.print(i + " ");
//			}
			
		for(int i =21; i <= 57 ; i+=2) {
			System.out.print(i + " ");
			
		}

		System.out.println();

		int hap = 0;
		// 1~100 3의 배수에 대한 누적합을 출력하기!
		for(int i = 1 ; i<= 100 ; i++ ) {
			if(i%3==0) {
				// 해당하는 i값을 누적하기
			hap+=i ;
			}
		}
		System.out.print("3의 배수의 누적 합: " + hap);
		

	}

}
