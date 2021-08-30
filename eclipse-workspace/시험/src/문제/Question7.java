package ¹®Á¦;

public class Question7 {

	public static void main(String[] args) {
		
		//(77*1) + (76*20 ---(1*77)
		int sum = 0;
		int cnt = 1;
		for(int i = 77; i >= 1; i--) {
			sum = sum + (i*cnt);
			cnt++;
		}
		System.out.println(sum);
		
	}

}
