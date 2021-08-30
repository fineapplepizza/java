package 최종문제복습;

public class 문제26 {

	public static void main(String[] args) {
		for(int i=0 ;i<5;i++) {
			for(int j=4;j>=0;j--) {
				if(i<j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}

	}

}
