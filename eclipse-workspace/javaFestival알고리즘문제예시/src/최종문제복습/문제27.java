package 최종문제복습;

import java.util.Scanner;

public class 문제27 {

	public static void main(String[] args) {
		//스캐너
		Scanner sc = new Scanner(System.in);
		//카운트변수
		int cnt =1;
	    //배열 생성
		int arr[]=new int[5];
		//for문으로 정수를 배열에 저장
		for(int i=0;i<arr.length;i++) {
			System.out.print(cnt+"번째 수 입력: ");
			arr[i]=sc.nextInt();
		}
		int temp =0;
	    int indexnum =0;
		//정렬후
		//오름차순정렬(치환)
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
		//출력
	    System.out.println("정렬 후");
	    for(int i=0; i<arr.length;i++) {
	    	System.out.print(arr[i]+" ");
	    }

	}

}
