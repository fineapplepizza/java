package 페스티벌;

public class 불리언 {

	public static void main(String[] args) {
       int num1 = 10;
       int num2 =2;
       boolean result = isDivide(num1,num2);
       System.out.println("결과확인: "+result);
	}
	public static boolean isDivide(int num1, int num2) {
		boolean result ;
		if(num1%num2==0) {
			return result =true;
		}else {
			return result = false;
		}
	}

}
