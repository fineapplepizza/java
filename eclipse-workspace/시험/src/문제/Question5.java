package 문제;

public class Question5 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		for(int i = 0; i<= 100; i++) {
			if(i%2==0) {
				System.out.print(-i + " ");
				num1 -= -i;
			}else {
				System.out.print(i + " ");
				num2 += i;
			}
		}
		System.out.println();
		System.out.println("결과 : " + num2+num1);
		
		
		
         
		}

	}


