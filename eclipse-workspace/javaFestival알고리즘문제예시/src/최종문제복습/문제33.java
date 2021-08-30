package 최종문제복습;

public class 문제33 {

	public static void main(String[] args) {
		int base =2;
		int n =3;
		int result =powerN(base,n);
		System.out.println("결과확인: "+result);

	}
	//powerN()메소드
	public static int powerN(int base,int n) {
		// 제곱한 값을 저장할 변수
		int result = (int)Math.pow(base, n);
		return result;
	}

}
