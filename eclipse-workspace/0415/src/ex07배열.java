
public class ex07배열 {

	public static void main(String[] args) {
		//최대값 구하기!
		
		//배열 생성
		int [] arr = {1,2,5,3,4};
		
		//배열을 구할때 비교를 위해서 기준이되는 값을 정하는데 보통 [0]값으로 정함
		//배열안에 있는 값과 비교하는 대상 만들기(하나의 값을 다 꺼내서 비교해야되니까 arr[0])
		int maxNum = arr[0];
		//배열의 큰 값을 찾아 출력하는 프로그램을 작성하세요
		for(int i = 0 ; i<arr.length; i++) {
			if(maxNum < arr[i]) {
				//비교했을 때 큰 값을 구했으면 그 값을 넣어주기 위해서
				maxNum = arr[i];
			}
			
		}
		System.out.println("최대 값은 " + maxNum + "입니다.");

	}

}
