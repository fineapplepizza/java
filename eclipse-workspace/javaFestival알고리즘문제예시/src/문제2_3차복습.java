
public class ����2_3������ {

	public static void main(String[] args) {
		//�л����� �������� ���ڿ� ����
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		//String [] split()�Լ��� ����ؼ� ���ڿ��� ������ �迭�� �����ϱ�
		String [] arr = score.split(",");
		//������ �л����� �Է¹޴� ���� �ʱ�ȭ�ϱ�
		int A=0,B=0,C=0,D=0,E=0,F=0;
		//for���� ����Ͽ� �л����� ���� ������ ��������
		for(int i=0;i<arr.length;i++) {
			//if���� ����Ͽ� �������� �л����� ����ϱ�
			if(arr[i].equals("A")) {//A�л���
				A++;
			}else if(arr[i].equals("B")) {//B�л���
				B++;
			}else if(arr[i].equals("C")) {//C�л���
				C++;
			}else if(arr[i].equals("D")) {//D�л���
				D++;
			}else if(arr[i].equals("F")) {//F�л���
				F++;
			}
		}
		//������ �л����� ����ϱ�
		System.out.println("A : "+A+"��\n"+
		"B : "+B+"��\n"+
				"C : "+C+"��\n"+
		"D : "+D+"��\n"+
				"F : "+F+"��");
		
		
		

	}

}
