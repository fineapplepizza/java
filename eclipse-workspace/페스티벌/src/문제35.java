package ��������;

import java.util.Random;
import java.util.Scanner;

public class ����35 {

	public static void main(String[] args) {
		// ��ĳ�ʻ���
		Scanner sc = new Scanner(System.in);
		// ��������
		Random rd = new Random();
		int cnt = 0;
		while (cnt < 5) {
			int num1 = rd.nextInt(10) + 1;
			int num2 = rd.nextInt(10) + 1;

			System.out.println(num1 + "+" + num2 + "=");
			int result = sc.nextInt();
			if (result == num1 + num2) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
				cnt++;
			}
		}
		System.out.println("GAME OVER!");
	}

}
