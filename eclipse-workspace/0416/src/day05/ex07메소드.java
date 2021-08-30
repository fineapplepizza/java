package day05;

public class ex07메소드 {
// 자동 전체 정렬 -> ctrl + shift + f
	public static void main(String[] args) {
		 
		// 함수에 입력되는 값의 약수를 구해주는 메소드
		// getDivisor(10)
		// 10의 약수 : 1 2 5 10
		getDivisor(10);

	}
	// 약수는 0으로 시작하면 안됨 연산이 안됨
	public static void getDivisor(int num) {
		System.out.print(num + "의 약수 : ");
		for(int i = 1; i <= num ; i++) {
			if(num%i==0) {
				System.out.print(i + " ");
			}
		}
		
		
	}

}
