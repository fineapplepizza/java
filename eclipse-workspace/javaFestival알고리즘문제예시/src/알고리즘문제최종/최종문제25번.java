package 알고리즘문제최종;

public class 최종문제25번 {

	public static void main(String[] args) {
		//1차원 배열 생성
		int [] point = {92,32,52,9,81,2,68};
		//가장 작은 숫자를 저장하는 변수 초기화
		//Math.abs메소드로 거리를 구할 때 음수가 나오지 않게 한다.
		int min = Math.abs(point[0]-point[1]);
		// 결과를 저장하는 변수는 문자열타입으로 초기화한다.
		String result = null;
		int first =0;
		int second =0;
		//이중 for문을 사용해서 서로의 거리를 비교
		for(int i=0;i<point.length;i++) {
			for(int j=0; j<point.length;j++) {
				if(i != j) { // if문을 사용해서 두점이 같지않을때 거리 비교
					if(min>Math.abs(point[i]-point[j])) {
						min = Math.abs(point[i]-point[j]);
						//min보다 작으면 result에 두 점을 저장한다.
						result = "[" + point[i]+","+point[j]+"]";
						first =i;
						second =j;
					}
				}
			}
		}
		//결과 출력
		System.out.println("result = "+"["+first+","+second+"]");

	}

}
