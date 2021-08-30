package ½Ç½À;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class InsertGUI {

	private JFrame frame;
	private JTextField txt_id;
	private JTextField txt_pw;
	private JTextField txt_name;
	private JTextField txt_age;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertGUI window = new InsertGUI();
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
	public InsertGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 421, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txt_id = new JTextField();
		txt_id.setBounds(116, 92, 277, 45);
		frame.getContentPane().add(txt_id);
		txt_id.setColumns(10);
		
		txt_pw = new JTextField();
		txt_pw.setColumns(10);
		txt_pw.setBounds(116, 160, 277, 45);
		frame.getContentPane().add(txt_pw);
		
		txt_name = new JTextField();
		txt_name.setColumns(10);
		txt_name.setBounds(116, 229, 277, 45);
		frame.getContentPane().add(txt_name);
		
		txt_age = new JTextField();
		txt_age.setColumns(10);
		txt_age.setBounds(116, 300, 277, 45);
		frame.getContentPane().add(txt_age);
		
		JButton btn_insert = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btn_insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				String name = txt_name.getText();
				int age = Integer.parseInt(txt_age.getText());
				
				Controller controll = new Controller();
				int cnt = controll.insert(id, pw, name, age);
				if(cnt >0) {
					System.out.println("°¡ÀÔ ¼º°ø");
				}else {
					System.out.println("°¡ÀÔ ½ÇÆÐ");
				}
			}
		});
		btn_insert.setBounds(142, 370, 132, 48);
		frame.getContentPane().add(btn_insert);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		lblNewLabel.setBounds(50, 10, 297, 54);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 92, 105, 45);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PW");
		lblNewLabel_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(12, 160, 105, 45);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("NAME");
		lblNewLabel_1_2.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(12, 229, 105, 45);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("AGE");
		lblNewLabel_1_3.setFont(new Font("±¼¸²", Font.PLAIN, 25));
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setBounds(12, 300, 105, 45);
		frame.getContentPane().add(lblNewLabel_1_3);
	}
}
