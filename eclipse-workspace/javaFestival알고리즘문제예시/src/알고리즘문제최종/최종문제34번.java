package 알고리즘문제최종;

public class 최종문제34번 {

	public static void main(String[] args) {
		String str = "01001101";
		// 10진수로 변환
		// 10진수로 변환하게 위해서 Integer.parseInt(변수명,진수)함수를 사용해야한다.
		int num = Integer.parseInt(str, 2);
		// 출력문작성
		System.out.println(str + "(2)" + "=" + num + "(10)");
	}

}
