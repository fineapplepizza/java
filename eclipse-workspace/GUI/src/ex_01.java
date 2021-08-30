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
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 22));
		lblNewLabel.setBounds(34, 49, 95, 36);
		frame.getContentPane().add(lblNewLabel);
		
		txt_id = new JTextField();
		txt_id.setColumns(10);
		txt_id.setBounds(66, 49, 366, 36);
		frame.getContentPane().add(txt_id);
		
		JLabel lblPw = new JLabel("PW:");
		lblPw.setFont(new Font("굴림", Font.PLAIN, 22));
		lblPw.setBounds(34, 135, 95, 36);
		frame.getContentPane().add(lblPw);
		
		txt_pw = new JPasswordField();
		txt_pw.setBounds(80, 132, 352, 39);
		frame.getContentPane().add(txt_pw);
		
		JButton btn_login = new JButton("\uB85C\uADF8\uC778");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 버튼이 눌리게 되면 입력된 값들을 가져오는 기능!
				// getText()
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				
				// 기존의 프레임에서 새로운 프레임으로 이동하기
				// 1.새롭게 띄워주고 싶은 클래스의 객체 생성하기
				
				// 새로운 화면에서 데이터를 포함할수 있도록 생성자 메소드 활용!
				ex_02 maingui = new ex_02(id);
//				maingui.main(null);
				
				//2.기존에 띄워져 있던 frame을 닫아주기!
				//dispose():frame을 닫아주는 함수
				frame.dispose();
				System.out.println("아이디 : "+id);
				System.out.println("비밀번호 : "+ pw);
				
			}
		});
		btn_login.setFont(new Font("굴림", Font.PLAIN, 19));
		btn_login.setBounds(160, 238, 213, 36);
		frame.getContentPane().add(btn_login);
		
		btn_cancel = new JButton("\uCDE8\uC18C");
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//버튼이 눌리면 작성된 값들 리셋하기!
				txt_id.setText(null);
				txt_pw.setText(null);
			}
		});
		btn_cancel.setFont(new Font("굴림", Font.PLAIN, 19));
		btn_cancel.setBounds(160, 305, 213, 36);
		frame.getContentPane().add(btn_cancel);
	}
}
