package 실습;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateGUI {

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_pw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateGUI window = new UpdateGUI();
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
	public UpdateGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 366, 382);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 37, 95, 44);
		frame.getContentPane().add(lblNewLabel);
		
		txt_id = new JTextField();
		txt_id.setBounds(108, 36, 230, 45);
		frame.getContentPane().add(txt_id);
		txt_id.setColumns(10);
		
		JLabel lblPw = new JLabel("PW:");
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		lblPw.setBounds(12, 125, 95, 44);
		frame.getContentPane().add(lblPw);
		
		txt_pw = new JTextField();
		txt_pw.setColumns(10);
		txt_pw.setBounds(108, 124, 230, 45);
		frame.getContentPane().add(txt_pw);
		
		JButton btn_update = new JButton("\uC218\uC815\uC644\uB8CC");
		btn_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//수정할 id,pw 을 받아오기
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				
				Controller controll = new Controller();
				int cnt = controll.update(id, pw);
				if(cnt >0) {
					System.out.println("수정 성공");
				}else {
					System.out.println("수정 실패");
				}
			}
		});
		btn_update.setBounds(94, 246, 158, 44);
		frame.getContentPane().add(btn_update);
	}

}
