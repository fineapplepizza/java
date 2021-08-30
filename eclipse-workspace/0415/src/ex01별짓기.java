
public class ex01별짓기 {

	public static void main(String[] args) {
		// 바깥쪽 for문은 몇번 실행 시킬지
		//안족 for문은 몇번 반복 할지
		//보통반복문은 0부터 시작
		for(int i=0; i<5;i++) {
			
			for(int j = 0; j<=i ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
