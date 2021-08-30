
public class 문제1_3차복습 {

	public static void main(String[] args) {
		//getMiddle메소드를 사용해서 가운데 글자 출력문 작성
		System.out.println(getMiddle("test"));

	}
	//getMiddle메소드 생성하기
	public static String getMiddle(String str) {
		//split()함수를 사용해서 글자하나하나  배열에 넣기
		String arr[]= str.split("");
		//if문을 사용해서 단어의 길이가 홀수인지 짝수인지 판단하기
		if(arr.length%2==1) {//홀수일때
			int middle = arr.length/2;
			return arr[middle];
		}else {//짝수일때
			int first = arr.length/2-1;
			int second = arr.length/2;
			
			return arr[first]+arr[second];
			
		}
		
//		return null;
	}
	

}
