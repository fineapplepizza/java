import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex_01 {

	public static void main(String[] args) {
		
		// JDBC �������(4�ܰ�)
		// �����۾� : ojdbc.jar ������Ʈ�� �߰��ϱ�!
		// 1. JDBC �����ε� - ����̹� ��ġ!
		// 2. �����ͺ��̽� ���� - Connection��ü ���
		// 3. SQL�� ���� - PreParedStatment, ResultSet ��ü
		// 4. ���� ��ü�� ���Ͽ� ������ �ݾ��ִ� �ܰ�
		
		
		// 1. JDBC ���� �ε�! -> Class.forName()
		// �ڹ��� ����
		// - ������ ���� : �������� ����
		// - ��Ÿ�� ���� : ���������δ� ������ ������ ���� ���۽� ������ �����ϴ� ��
		
		try { // ������ �ѹ��� ������ ��Ű�� ����
			//OracleDriverŬ������ �����ϰڽ��ϴ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. �����ͺ��̽� �����ϱ� -> Connection ��ü�� ���Ͽ� ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
		    String user_id ="hr";
		    String user_pw ="hr";
		    
		    // Connection import �۾� -> java.sql
            Connection conn = DriverManager.getConnection(url,user_id,user_pw);
			
            // getConnection()�� ���Ͽ� ��ȯ�� ������ ���Ῡ�� Ȯ���ϱ�
            if(conn != null) {
            	System.out.println("���� ����!");
            }else {
            	System.out.println("���� ����...");
            }
            //(�����ͺ��̽� ���� url, ���� user_id,���� �н�����)
			
        	// 3. sql �ۼ� -> PreparedStatement()
    		String sql = "select * from employees where last_name = 'King'";
    		//����
    	    PreparedStatement psmt = conn.prepareStatement(sql);            
            //���� sql���� �����Ҽ� �ִ� ��� ����!
    	    //executeQuery(): ���� ���̺� ������ ���� ��� -> select
    	    //executeUpdate() : ���� ���̺� ������ �Ͼ�� ��� -> insert, delete
    	    //Resultset�̶�� Ÿ������ rs��� �̸��� �ٿ��� ������� ���� executeQuery���๮��
    	    //rs���� �츮�� ��ȯ�ϰ��� �ϴ� �Ϻ��� ������ ����
    	    ResultSet rs = psmt.executeQuery();
    	    //rs�κ��� ������ �ִٸ� ����ؼ� �ݺ��۾��� �ϰڽ��ϴ�.
    	    //����� ���� ������ ������ �����ϱ� ���� �۾�-���� �ֿܼ� ���� ���� �۾�
    	    while(rs.next()) {
    	        String id = rs.getString(1);
    	        String first_name = rs.getString(2);
    	        String last_name = rs.getString(3);
    	        
    	        System.out.println("employee_id :"+id);
    	        System.out.println("first_name :"+first_name);
    	        System.out.println("last_name :"+last_name);
    	        System.out.println();

    	    }
    	    
    	    // 4. ��������
    	    //���������� ������ ���� �������� ���� ��ü���� �������� �ݾ��ش�!
    	    // rs-psmt-conn
    	    if(rs != null) {
    	    	//rs�� null���� �ƴ϶�� rs���ݾ��ּ���
    	    	rs.close();
    	    }if(psmt != null) {
    	    	psmt.close();
    	    }if(conn != null) {
    	    	conn.close();
    	    }
		} catch (ClassNotFoundException e) {// try���� �������� �κе��� ����ó�� �ϴ� ����
			// jdbc �����ε��� ���� ��ΰ� ���� ���� ��� �߻��ϴ� ����
			System.out.println("�����ε� ����!");
			e.printStackTrace();//� �������� ������ ���¸� ����ϰڽ��ϴ�.
		} catch (SQLException e) {
			//sql�� �ش��ϴ� ������ ���� ����
		 System.out.println("�����ͺ��̽� ����!");
			e.printStackTrace();
		}
		
	
		
		
		
		

	}

}
