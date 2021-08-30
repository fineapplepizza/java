package java3차문제;

public class 문제2 {

	public static void main(String[] args) {
		  // 문자열 선언
	      String score = "A,A,B,C,D,A,C,D,D,D,F";
	      // String[]spilt()으로 score 문자열을 배열에 넣기
	      String[] str = score.split(",");
	      // 성적별 학생 수 변수 초기화 하기
	      int A = 0, B = 0, C = 0, D = 0, F = 0;
	      // for문을 이용하여 성적별로 학생 수를 구분하기
	      for (int i = 0; i < str.length; i++) {
	         if (str[i].equals("A")) {// if문 A학생 수
	            A++;
	         } else if (str[i].equals("B")) {// B학생수
	            B++;
	         } else if (str[i].equals("C")) {// C학생수
	            C++;
	         } else if (str[i].equals("D")) {// D학생수
	            D++;
	         } else if (str[i].equals("F")) {// F학생수

	         }
	      }
	      // 성적별 학생수 출력하기
	      System.out.println(
	            "A : " + A + "명\n" + 
	              "B : " + B + "명\n" + 
	            "C : " + C + "명\n" + 
	              "D : " + D + "명\n" + 
	             "F : " + F + "명\n");



	}

}
