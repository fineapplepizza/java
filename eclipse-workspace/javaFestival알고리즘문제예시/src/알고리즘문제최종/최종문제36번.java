package �˰���������;

import java.util.Scanner;

public class ��������36�� {

	public static void main(String[] args) {
		//��ĳ�� �����ϱ�
		Scanner sc = new Scanner(System.in);
		//���ĺ��� �����ϴ� �迭����
		int alpa[]=new int[26];
		//���ĺ� �󵵼� ���ϴ� ��¹��ۼ�
		System.out.println("=== ���ĺ� �󵵼� ���ϱ� ===");
		//�Է� ��¹� �ۼ� �� �Է� �ޱ�
		System.out.println("�Է�>>");
		String str = sc.next();
		//�빮�ڸ� �ҹ��ڷ� �����ϱ�
		str = str.toLowerCase();
		//������ ���ֱ�
		str = str.replace(" ", "");
		for(int i=0; i<str.length();i++) {
			//charAt-str��charŸ������ ��ȯ
			char ch = str.charAt(i);
			alpa[ch-'a']++;
		}
		for(int i=0;i<26;i++) {
			//(97+i)�ƽ�Ű�ڵ带 char�� ��ȯ���ֱ�
			System.out.println((char)(97+i)+":"+alpa[i]);
		}
				
		
		

	}

}
