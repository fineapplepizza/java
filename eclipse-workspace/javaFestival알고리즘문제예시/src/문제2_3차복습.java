
public class 문제2_3차복습 {

	public static void main(String[] args) {
		//학생들의 성적정보 문자열 선언
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		//String [] split()함수를 사용해서 문자열을 나누어 배열에 저장하기
		String [] arr = score.split(",");
		//성적별 학생수를 입력받는 변수 초기화하기
		int A=0,B=0,C=0,D=0,E=0,F=0;
		//for문을 사용하여 학생들의 성적 정보를 가져오기
		for(int i=0;i<arr.length;i++) {
			//if문을 사용하여 성적별로 학생수를 계산하기
			if(arr[i].equals("A")) {//A학생수
				A++;
			}else if(arr[i].equals("B")) {//B학생수
				B++;
			}else if(arr[i].equals("C")) {//C학생수
				C++;
			}else if(arr[i].equals("D")) {//D학생수
				D++;
			}else if(arr[i].equals("F")) {//F학생수
				F++;
			}
		}
		//성적별 학생수를 출력하기
		System.out.println("A : "+A+"명\n"+
		"B : "+B+"명\n"+
				"C : "+C+"명\n"+
		"D : "+D+"명\n"+
				"F : "+F+"명");
		
		
		

	}

}
