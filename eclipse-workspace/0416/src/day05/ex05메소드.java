package day05;

public class ex05�޼ҵ� {

	public static void main(String[] args) {

		int num1 = 2;
		int num2 = 9;

		int result = close10(num1, num2);
		System.out.println("10�� ����� ��: " + result);

	}

	public static int close10(int num1 , int num2 ) {
		
		// ���׿����ڸ� ���� ���� Ȯ��
//		 int  n1 = num1 > 10 ? num1-10 : 10 - num1;
//		 int  n2 = num2 > 10 ? num2-10 : 10 - num2;
		
		// ���밪�� ���ϴ� �Լ��� ����ϴ� ���! -> Math Ŭ����(�ڹٳ��� ��ü������ ����)
		int n1 = Math.abs(10-num1);
		int n2 = Math.abs(10-num2);
		    
		   int result = 0;
		   
		   if(n1 > n2) {
			    result = num2;
		   }else if(n1 < n2){
			   result = num1;
		   }else {
			   // �� ���� ���� ���� ���
			   result = 0;
		   }
		
		   
			  return result;
		  
	}
	
}
