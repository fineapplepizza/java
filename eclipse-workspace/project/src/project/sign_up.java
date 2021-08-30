package project;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;

public class sign_up {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sign_up window = new sign_up();
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
	public sign_up() {
		initialize();
		Connect();
	}

	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	private JTextField txtname;
	private JTextField txtid;
	private JTextField txtadd;
	private JPasswordField txtpw;
	
	public void Connect()
	{	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/library", "root", "");
			
		} catch (ClassNotFoundException e) {
			System.out.println("연결실패");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 200, 952, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		
		txtname = new JTextField();
		txtname.setFont(new Font("메이플스토리", Font.BOLD, 18));
		txtname.setBorder(null);
		txtname.setOpaque(false);
		txtname.setBounds(304, 125, 252, 39);
		frame.getContentPane().add(txtname);
		txtname.setColumns(10);
		
		txtid = new JTextField();
		txtid.setFont(new Font("메이플스토리", Font.BOLD, 18));
		txtid.setColumns(10);
		txtid.setBorder(null);
		txtid.setOpaque(false);
		txtid.setBounds(336, 209, 252, 39);
		frame.getContentPane().add(txtid);
		
		
		txtpw = new JPasswordField();
		txtpw.setBounds(357, 303, 231, 39);
		txtpw.setOpaque(false);
		txtpw.setBorder(null);
		frame.getContentPane().add(txtpw);
		
		txtadd = new JTextField();
		txtadd.setFont(new Font("메이플스토리", Font.BOLD, 18));
		txtadd.setOpaque(false);
		txtadd.setBorder(null);
		txtadd.setColumns(10);
		txtadd.setBounds(317, 394, 381, 39);
		frame.getContentPane().add(txtadd);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(sign_up.class.getResource("/image/sign.jpg")));
		lblNewLabel.setBounds(0, 0, 934, 583);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn_sign = new JButton("");
		btn_sign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtname.getText();
				String id = txtid.getText();
				String pw = txtpw.getText();
				String add = txtadd.getText();
				
				try {
					pst = con.prepareStatement("insert into member (name, id, pw, address) values (?,?,?,?)");
					
					pst.setString(1, name);
					pst.setString(2, id);
					pst.setString(3, pw);
					pst.setString(4, add);
					
					int check = pst.executeUpdate();
					
					if(check == 1) {
						JOptionPane.showMessageDialog(null, "회원가입완료");
						frame.setVisible(false);
						login.main(null);
						
						
					}else {
						
						JOptionPane.showMessageDialog(null, "회원가입실패");
						
					}
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn_sign.setOpaque(false);
		btn_sign.setBorder(null);
		btn_sign.setBounds(383, 491, 168, 66);
		frame.getContentPane().add(btn_sign);
		
		
	}
}
