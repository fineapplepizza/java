
public class 문제6_2차 {

	public static void main(String[] args) {
		int num1 =10;
		int num2 =3;
		boolean result = isDivide(num1,num2);
		System.out.println("결과확인: "+result);

	}
	//앞의 정수가 뒤의 정수로 나누어지는지를 판별하는 메소드isDivide()를 작성
	public static boolean isDivide(int num1,int num2) {
		//참/거짓을 판별하는 변수
		boolean result;
		if(num1%num2==0) {//나누어질때
			result = true;
		}else {//나누어지지 않을때
			result = false;
			
		}
		return result;
	}

}
