package �ǽ�;

public class MemberVo {
	
	//Model : �����ϰ��� �ϴ� �����ͺ��̽� ���̺��� ��� �ڷ����� �����ϴ� ��
	
	//members ���̺� : id, pw, name, age
	
	//�ʵ�����
	private String id;
	private String pw;
	private String name;
	private int age;
	
	
	// ȸ�����Խ� ����ϱ� ���� ������ �޼ҵ�
	public MemberVo(String id, String pw, String name, int age) {
		// �ʵ��� ������ �Ű����� �����ϱ�
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		
	}

	// �� �ʵ忡 ���� get/set �޼ҵ� ����
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
