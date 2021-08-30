
public class 문제15 {

	public static void main(String[] args) {
		// 문자열 선언
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		// String[]split()
		String str[] = score.split(",");
		// 성적 별 학생 수 변수 초기화
		int A = 0, B = 0, C = 0, D = 0, F = 0;
		// for문
		for (int i = 0; i < str.length; i++) {
			// if문
			if (str[i].equals("A")) {// A
				A += 1;
			} else if (str[i].equals("B")) {// B
				B += 1;
			} else if (str[i].equals("C")) {// C
				C += 1;
			} else if (str[i].equals("D")) {// D
				D += 1;
			} else if (str[i].equals("F")) {// F
				F += 1;
			}
		}
		// 결과출력
		System.out.println(
				"A : " + A + "명\n" + "B : " + B + "명\n" + "C : " + C + "명\n" + "D : " + D + "명\n" + "F : " + F + "명\n");

	}

}
