

public class 문제25 {

	public static void main(String[] args) {
		//1차원 배열생성
		int [] point = {92,32,52,9,81,2,68};
		//절대값함수Math.abs()
		int min = (int)Math.abs(point[0]-point[1]);
		//결과를 저장하는 문자열 변수 초기화
		String result = null;
		//for문
		for(int i=0; i<point.length;i++) {
			for(int j=0; j<point.length;j++) {
				if(i != j) {
				if(min>(int)Math.abs(point[i]-point[j])) {
					min = (int)Math.abs(point[i]-point[j]);
					 result = "["+point[i]+","+point[j]+"]";
				}
				}
			}
		}
		System.out.println(result);
		

	}

}
