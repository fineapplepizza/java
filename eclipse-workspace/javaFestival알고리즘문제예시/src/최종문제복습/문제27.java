package ������������;

import java.util.Scanner;

public class ����27 {

	public static void main(String[] args) {
		//��ĳ��
		Scanner sc = new Scanner(System.in);
		//ī��Ʈ����
		int cnt =1;
	    //�迭 ����
		int arr[]=new int[5];
		//for������ ������ �迭�� ����
		for(int i=0;i<arr.length;i++) {
			System.out.print(cnt+"��° �� �Է�: ");
			arr[i]=sc.nextInt();
		}
		int temp =0;
	    int indexnum =0;
		//������
		//������������(ġȯ)
	    for(int i=0; i<arr.length;i++) {
	    	indexnum =i;
	    	for(int j=i+1;j<arr.length;j++) {
	    		if(arr[indexnum]>arr[j]) {
	    			indexnum = j;
	    		}
	    	}
	    	temp = arr[indexnum];
    		arr[indexnum] = arr[i];
    		arr[i] = temp;
	    }
		//���
	    System.out.println("���� ��");
	    for(int i=0; i<arr.length;i++) {
	    	System.out.print(arr[i]+" ");
	    }

	}

}
