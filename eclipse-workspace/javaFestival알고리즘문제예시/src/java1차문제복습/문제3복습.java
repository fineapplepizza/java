package java1차문제복습;

public class 문제3복습 {

	public static void main(String[] args) {
		//양수 합계 변수와 음수 함계 변수 초기화
		int a = 0, b =0;
		//for문을 사용하여 양수를 출력
		for(int i = 1; i<=100;i++) {
			if(i%2==1) { //i가 양수 일때
				System.out.print(i+" ");
				a += i;//양수 합계
			}else if(i%2==0) { //i가 음수 일때
				System.out.print(-i+" ");
				b+=-i;//음수 합계
			}
			
		}
		System.out.println();
        // 결과 출력문 작성
		System.out.println("결과 : "+(a+b));
		

	}

}
