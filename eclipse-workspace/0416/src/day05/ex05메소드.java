package day05;

public class ex05메소드 {

	public static void main(String[] args) {

		int num1 = 2;
		int num2 = 9;

		int result = close10(num1, num2);
		System.out.println("10에 가까운 수: " + result);

	}

	public static int close10(int num1 , int num2 ) {
		
		// 삼항연산자를 통한 차이 확인
//		 int  n1 = num1 > 10 ? num1-10 : 10 - num1;
//		 int  n2 = num2 > 10 ? num2-10 : 10 - num2;
		
		// 절대값을 구하는 함수를 사용하는 방법! -> Math 클래스(자바내에 자체적으로 존재)
		int n1 = Math.abs(10-num1);
		int n2 = Math.abs(10-num2);
		    
		   int result = 0;
		   
		   if(n1 > n2) {
			    result = num2;
		   }else if(n1 < n2){
			   result = num1;
		   }else {
			   // 두 수의 차가 같을 경우
			   result = 0;
		   }
		
		   
			  return result;
		  
	}
	
}
