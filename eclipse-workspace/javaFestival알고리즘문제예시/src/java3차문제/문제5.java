package java3������;

import java.util.Random;
import java.util.Scanner;

public class ����5 {

	public static void main(String[] args) {
		// ��ĳ�� �����ϱ�
		Scanner sc = new Scanner(System.in);
		// �����Լ� �����ϱ�
		Random rd = new Random();
		// �迭�� �����ϱ�
		int lottoNumber[] = new int[6];

		// for�� ������ 1~45���� �������ڸ� ����
		for (int i = 0; i < lottoNumber.length; i++) {
			// nextInt(45)�̸� �ش� ������ 0~44�̹Ƿ� 1�� �����ش�.
			lottoNumber[i] = rd.nextInt(45) + 1;
			

			// ���� ���ڿ� ���� ���ڰ� ������ �ߺ��� ���ڸ� �˷��ְ� �ٽ� �ѹ�����.
			for (int j = 0; j < i; j++) {
				if (lottoNumber[i] == lottoNumber[j]) {// �ߺ��� ���ڰ� ��������
					// �ߺ��Ǽ��� ó���ϱ����� �ݺ���i��°�� �ٽ� ������.
					i--;
				}
			}
			System.out.println("����� ���� : " + lottoNumber[i]);

		}

	}

}
