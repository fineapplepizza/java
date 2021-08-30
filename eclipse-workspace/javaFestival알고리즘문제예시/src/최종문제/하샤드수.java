package 최종문제;

public class 하샤드수 {

	public static void main(String[] args) {
		//ex 정수 18은 1+8=9이고
				//19은 9로 나누어덜어지므로 하샤드 수 이다.
		System.out.println(isHarshod(18));
	}
	//하샤드수인지 아닌지 판별해야하기 때문에 boolean타입으로 메소드를 만든다.ㅣ
	public static boolean isHarshod(int num) {
		//누적할수있는변수
		int sum = 0;
		//어떤 수가 들어올지 모르기 때문에
		//맨 처음들어온 num이라는 값을 기억하는 변수
		int b =num;
		//몇번째 반복할지 모르기 때문에 while문 
		while(num !=0 ) {//0이아닐때까지 반복하겠습니다.
			//1의 자리를 기억할 수 있는 변수
			int a = num % 10;
			//sum에다가 a값을 누적
			sum +=a;
			//10의 자리를 가지고 올수 있음
			num = num/10;
		}
		
		if(b%sum==0) {//나머지가 0일때  하샤드수가 된다.
			return true;
		}else {// 나머지가 0이 아닐때 
			return false;
		}
		
		
	}

}
