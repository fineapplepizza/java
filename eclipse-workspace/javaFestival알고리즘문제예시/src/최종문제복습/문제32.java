package ������������;

import java.util.Scanner;

public class ����32 {

	public static void main(String[] args) {
		//��ĳ��
		Scanner sc = new Scanner(System.in);
		//ä���ϱ� ��¹� �ۼ� �� �Է�
		System.out.println("====ä���ϱ�====");
		String str = sc.next();
		//String [] split()�Լ�
		String s[] = str.split("");
		//ī��Ʈ�� ����
		int cnt =1;
		//������ ������ ����
		int result =0;
		//for��
		for(int i=0; i<s.length;i++) {
			//if������ ox�Ǵ�
			if(s[i].equals("o")) {
				result +=cnt;
				cnt++;
			}else {
				cnt=1;//o���ƴϸ� ī��Ʈ �ʱ�ȭ
			}
		}
		//���
		System.out.println(result);

	}

}
