package �佺Ƽ��;

public class ��� {

	public static void main(String[] args) {
		int num1=0;
	    int num2=0;
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
				num1+=i;
			}else {
				System.out.print(-i+" ");
				num2+=-i;
			}
		}
		System.out.println();
		System.out.println("���: "+(num1+num2));

	}

}
