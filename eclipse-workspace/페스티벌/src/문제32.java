package ��������;

import java.util.Scanner;

public class ����32 {//

	public static void main(String[] args) {
		//��ĳ��
		Scanner sc = new Scanner(System.in);
		//ä���ϱ�
		System.out.println("==== ä���ϱ� ====");
		String str = sc.next();
		//split
		String[]s= str.split("");
		//ī��Ʈ
		int cnt=0;
	
		//for
		for(int i=0; i<s.length;i++) {
			if(s[i].equals("o")) {
			   cnt++;
		}
		//if.e
		//���
		

	}
		System.out.println(cnt);

	}
}
