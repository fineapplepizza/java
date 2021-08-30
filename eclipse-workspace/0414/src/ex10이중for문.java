
public class ex10이중for문 {

	public static void main(String[] args) {
		
		// 곱의 수를 증가 시킬 수 있는 for문 작성
		for(int j=1 ; j <= 9; j++) {
			
			// 단을 한줄에서 하나씩 증가시키기 위한 for문 작성
			for(int i = 1; i<=9;i++) {
				System.out.print(i + "*" + j + "=" + (i*j)+"\t");
			}
			System.out.println();
		}

	}

}
