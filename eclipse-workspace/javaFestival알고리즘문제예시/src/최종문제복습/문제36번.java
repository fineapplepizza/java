package ������������;

import java.util.Scanner;

public class ����36�� {

	public static void main(String[] args) {
		//���ĺ��� �����ϴ� �迭 ����
		int alpa[]=new int[26];
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		//���ĺ��󵵼����ϱ� ���
		System.out.println("==== ���ĺ� �󵵼� ���ϱ� ====");
		//�Է� ��¹� �Է¹ޱ�
		System.out.print("�Է�>>");
		String str = sc.next();
		
		//�빮�ڸ� �ҹ��ڷ� ��ȯ�ϴ� tolowercase()�Լ�
	     str = str.toLowerCase();
		//������ �����ټ��ִ� replace()�Լ�
	     str = str.replace(" ", "");
		//for
	    for(int i=0;i<str.length();i++) {
	    	//str�� char�� ��ȯ���ִ� charAt()�Լ�
	    	char ch = str.charAt(i);
			//���ĺ��� ���� ī��Ʈ
	    	alpa[ch-'a']++;
	    }
	  //��� (�ƽ�Ű�ڵ�) ���ĺ��迭
	    for(int i=0; i<26;i++) {
	    System.out.println((char)(97+i)+":"+alpa[i]);
	    }

	}

}
