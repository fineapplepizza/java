package Table;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tableview {

	private JFrame frame;
	private JTable table;
	
	//Tableview���� ���� ArrayList ����
	ArrayList<MemberVO>list = new ArrayList<>();
	private JTextField txt_search;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Tableview window = new Tableview();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Tableview(ArrayList members) {
		this.list = members;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 452, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 88, 412, 304);
		frame.getContentPane().add(scrollPane);
		
		//������ �Ǵ� ���̺� ������
		//�÷��� ������ �ֱ� ���ؼ�
		String[]col = {"�̸�","����","����"};
		//�����͵��� �ֱ� ���ؼ� ����
		Object[][] data = new Object[list.size()][col.length];
		
		for(int i=0; i<list.size();i++) {
			data[i][0] = list.get(i).name;
			data[i][1] = list.get(i).age;
			data[i][2] = list.get(i).gender;
		}
		
		table = new JTable(data,col);
		scrollPane.setViewportView(table);
		
		JButton btn_search = new JButton("New button");
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//�ؽ�Ʈ �ʵ忡 �Էµ� ������ ������ ����
				//�˻��� ������ �̸�!
				String search = txt_search.getText();
				
				Object[][] data = new Object[1][3];
				
				for(int i=0; i<list.size();i++){
					// �˻��� �̸��� ������ �̸��� ������ �ִ� ArrayList�� ������ 
					// ���ο� data�迭�� ��´�!
					if(search.equals(list.get(i).name)) {//���� �Է��� �༮�� list�ȿ� �̸��� ������ �Ǵ�
						data[0][0] = list.get(i).name;
						data[0][1] = list.get(i).age;
						data[0][2] = list.get(i).gender;
						
					}
			
		}
				
				// ������ �ִ� ���̺��� ������ �����ϱ�
				table.removeAll();
				table = new JTable(data,col);
				scrollPane.setViewportView(table);
				
			}
		});
		btn_search.setBounds(327, 10, 97, 54);
		frame.getContentPane().add(btn_search);
		
		txt_search = new JTextField();
		txt_search.setBounds(12, 10, 317, 54);
		frame.getContentPane().add(txt_search);
		txt_search.setColumns(10);
	}
}
