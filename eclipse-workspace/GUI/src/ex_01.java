import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ex_01 {

	private JFrame frame;
	private JTextField txt_id;
	private JPasswordField txt_pw;
	private JButton btn_cancel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex_01 window = new ex_01();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ex_01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 518, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 22));
		lblNewLabel.setBounds(34, 49, 95, 36);
		frame.getContentPane().add(lblNewLabel);
		
		txt_id = new JTextField();
		txt_id.setColumns(10);
		txt_id.setBounds(66, 49, 366, 36);
		frame.getContentPane().add(txt_id);
		
		JLabel lblPw = new JLabel("PW:");
		lblPw.setFont(new Font("����", Font.PLAIN, 22));
		lblPw.setBounds(34, 135, 95, 36);
		frame.getContentPane().add(lblPw);
		
		txt_pw = new JPasswordField();
		txt_pw.setBounds(80, 132, 352, 39);
		frame.getContentPane().add(txt_pw);
		
		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// ��ư�� ������ �Ǹ� �Էµ� ������ �������� ���!
				// getText()
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				
				// ������ �����ӿ��� ���ο� ���������� �̵��ϱ�
				// 1.���Ӱ� ����ְ� ���� Ŭ������ ��ü �����ϱ�
				
				// ���ο� ȭ�鿡�� �����͸� �����Ҽ� �ֵ��� ������ �޼ҵ� Ȱ��!
				ex_02 maingui = new ex_02(id);
//				maingui.main(null);
				
				//2.������ ����� �ִ� frame�� �ݾ��ֱ�!
				//dispose():frame�� �ݾ��ִ� �Լ�
				frame.dispose();
				System.out.println("���̵� : "+id);
				System.out.println("��й�ȣ : "+ pw);
				
			}
		});
		btn_login.setFont(new Font("����", Font.PLAIN, 19));
		btn_login.setBounds(160, 238, 213, 36);
		frame.getContentPane().add(btn_login);
		
		btn_cancel = new JButton("\uCDE8\uC18C");
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//��ư�� ������ �ۼ��� ���� �����ϱ�!
				txt_id.setText(null);
				txt_pw.setText(null);
			}
		});
		btn_cancel.setFont(new Font("����", Font.PLAIN, 19));
		btn_cancel.setBounds(160, 305, 213, 36);
		frame.getContentPane().add(btn_cancel);
	}
}
