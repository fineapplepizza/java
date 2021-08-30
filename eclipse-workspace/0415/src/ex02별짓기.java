
public class ex02별짓기 {

	public static void main(String[] args) {
		
		// 바깥쪽 for문(줄수)
		for(int i = 0; i < 5 ; i++) {
			
			//안쪽 for문
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
		 System.out.println();
		}

	}

}
