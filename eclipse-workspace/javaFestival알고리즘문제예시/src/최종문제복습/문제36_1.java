package ������������;

import java.util.Scanner;

public class ����36_1 {

	public static void main(String[] args) {
	 //��ĳ�ʻ���
	 Scanner sc = new Scanner(System.in);
     //���ĺ� ������ ������ �迭 ����
	 int alpa[]=new int[26];
	 //���ĺ� �󵵼� ���ϱ�
	 System.out.println("==== ���ĺ� �󵵼� ���ϱ�");
	 //�Է�
	 System.out.println("�Է�>>");
	 String str = sc.next();
	 //tolowercase
	 str = str.toLowerCase();
	 //replace
	 str = str.replace(" ","");
	 //for��
	 for(int i=0;i<str.length();i++) {
		//charat�� str�� char�� ��ȯ
		 int ch = str.charAt(i);
		 //���ĺ� ���� ī��Ʈ
		 alpa[ch-'a']++;
	 }
	 //���
	 for(int i=0;i<26;i++) {
	 System.out.println((char)(97+i)+":"+alpa[i]);
	 }
	}

}
