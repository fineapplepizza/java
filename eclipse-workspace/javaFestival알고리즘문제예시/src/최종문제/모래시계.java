package 최종문제;

public class 모래시계 {

	public static void main(String[] args) {
		//알고리즘 문제를 풀때 어떠한 모양으로 출력하시오는 배열로 푸는게 가장좋음
		
		// 배열 생성
		int array[][]=new int[5][5];
		char ch ='A';
		
		//5행5열 배열 만들기
		//i->행,j->열
		for(int i=0;i<=4;i++) {
			//[0,*],[1,*]일때
			if(i < 2) {
				//0->4-0=4,4-1=3,4-2=2,4-3=1,4-4=0
				//1->4-1=3,4-2=2,4-3=1
				for(int j = i; j<=4-i;j++) {
					array[i][j]=ch++;
				}
			}else if(i == 2) {
				array[2][2]=ch++;
			}
			// [3,*],[4,*]일때
			else {
				for(int j= 4-i;j<=i;j++) {
					array[i][j] = ch++;
				}
			}
		}
		//모래시계 출력
		for(int i=0; 1<=4;i++) {
			for(int j=0;j<=4;j++) {
				System.out.print((char)array[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
