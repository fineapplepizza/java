package 실습;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MemberGui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberGui window = new MemberGui();
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
	public MemberGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 419, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_insert = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_insert.setFont(new Font("굴림", Font.PLAIN, 25));
		btn_insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// 버튼이 눌리면 회원가입을 위한 frame으로 이동!
				// 1. 이동하고 싶은 클래스의 객체가 생성!
				InsertGUI insertgui = new InsertGUI();
				//2. 이동하고자 하는 클래스의 main()/생성자 메소드()
				insertgui.main(null);
				//3.(옵션) 기존의 창을 종료 할것인지 셋팅
				frame.dispose();
			}
		});
		btn_insert.setBounds(12, 23, 379, 64);
		frame.getContentPane().add(btn_insert);
		
		JButton btn_select = new JButton("\uD68C\uC6D0\uC870\uD68C");
		btn_select.setFont(new Font("굴림", Font.PLAIN, 25));
		btn_select.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SelectGUI selectgui = new SelectGUI();
				selectgui.main(null);
				
				frame.dispose();
			}
		});
		btn_select.setBounds(12, 147, 379, 64);
		frame.getContentPane().add(btn_select);
		
		JButton btn_update = new JButton("\uC815\uBCF4\uC218\uC815");
		btn_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//이동하고자 하는 클래스의 객체 생성
				UpdateGUI updategui = new UpdateGUI();
				//이동하고자 하는 클래스의 main/생성자메소드()
				updategui.main(null);
				//기존의 창을 종료할 것인지 셋팅
				frame.dispose();
			}
		});
		btn_update.setFont(new Font("굴림", Font.PLAIN, 25));
		btn_update.setBounds(12, 276, 379, 64);
		frame.getContentPane().add(btn_update);
	}
}
