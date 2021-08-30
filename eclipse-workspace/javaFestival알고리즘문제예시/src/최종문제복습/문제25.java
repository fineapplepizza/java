package 최종문제복습;

public class 문제25 {

	public static void main(String[] args) {
		// 1차원배열생성
		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		// 가장 작은 거리를 저장하는 변수 초기화
		int min = Math.abs(point[0] - point[1]);
        //인덱스 위치를 저장해줄 변수 초기화
		int first = 0;
		int second = 0;
		// for문
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point.length; j++) {
				if (i != j) {//i=j가 같으면 최소 거리를 구할 수 없음
					if (min > Math.abs(point[i] - point[j])) {// if문으로 가장작은 거리 비교
						min = Math.abs(point[i] - point[j]);
						first = i;
						second = j;
					}
				}
			}
		}
		// 출력
		System.out.println("result = [" + first + "," + second + "]");

	}

}
