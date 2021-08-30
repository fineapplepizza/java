package java3차문제;

public class 문제1 {

	public static void main(String[] args) {
		// getMiddle메소드로 가운데 글자 구하기
		System.out.println(getMiddle("test")); 

	}

	// 단어를 반환하는 getMiddle메소드 만들기
	public static String getMiddle(String str) {
		// String[] spilt()-입력받은 정규표현식 또는 특정문자를 기준으로 문자열을 나누어 배열(Array)에 저장하여 리턴합니다.
		String[] list = str.split("");
		// if문을 활용하여 단어의 길이가 짝수인지 홀수인지 판단
		if (list.length % 2 == 1) {// 단어의 길이가 홀수 일때
			int middle = list.length / 2; // 배열의 길이를 2로 나누면 배열의 인덱스 가운데 값을 구할 수 있다.
			return list[middle];
		}
		if (list.length % 2 == 0) {// 단어의 길이가 짝수 일때
			int first = list.length / 2 - 1;
			int second = list.length / 2;
			return list[first] + list[second];
		}
		return str;
		
	}

}
