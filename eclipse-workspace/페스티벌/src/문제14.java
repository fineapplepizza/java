
public class 문제14 {

	public static void main(String[] args) {
		System.out.println(getMiddle("power"));

	}

	// getMiddle메소드 만들기
	public static String getMiddle(String str) {
		// String[]split()
		String[] s = str.split("");
		// if문
		if (s.length % 2 == 0) {// 짝수문자열
			int first = s.length / 2 - 1;
			int second = s.length / 2;
			return s[first] + s[second];
		} else {// 홀수문자열
			int middle = s.length / 2;
			return s[middle];
		}

	}

}
