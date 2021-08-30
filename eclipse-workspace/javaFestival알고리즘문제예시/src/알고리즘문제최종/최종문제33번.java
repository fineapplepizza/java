package 알고리즘문제최종;

public class 최종문제33번 {

	public static void main(String[] args) {
		int base = 2;
		int n = 3;
		int result = powerN(base,n);
		System.out.println("결과확인: "+result);

	}
	// 제곱만큼 값을 반환하는 powerN()메소드를 작성하세요
	public static int powerN(int base, int n) {
		//제곱을 구하는 함수 Math.pow()를 사용해서 n제곱만큼 반환하기
		//제곱을 구하는 함수 Math.pow(밑,지수)기본값이 double이기 때문에 int형으로 변환해야한다.
		int result = (int)Math.pow(base,n);
		return result;
	}

}
