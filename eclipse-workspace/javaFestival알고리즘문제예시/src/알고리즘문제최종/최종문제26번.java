package 알고리즘문제최종;

public class 최종문제26번 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {//행을 출력하는 for문
			for(int j=4;j>=0;j--) {//열을 출력하는 for문
				if(i<j) {//i보다 j가클때 " " 
					System.out.print(" ");
				}else {//i보다 j가 크지 않을때 "*"
					System.out.print("*");
				}
			}
			//열을 출력하는for문이 한 번씩 끝나면 줄바꿈해주기
			System.out.println();
		}

	}

}
