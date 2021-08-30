package project;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Font;



public class login {

	private JFrame frame;
	private JTextField txtid;
	private JPasswordField txtpw;
	static String id = "";


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
		Connect();
	
		
	}

	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
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
		
		txtid = new JTextField();
		txtid.setFont(new Font("메이플스토리", Font.BOLD, 19));
		txtid.setOpaque(false);
		txtid.setBorder(null);
		txtid.setBounds(423, 262, 181, 37);
		frame.getContentPane().add(txtid);
		txtid.setColumns(10);
		
		txtpw = new JPasswordField();
		txtpw.setFont(new Font("돋움", Font.BOLD, 18));
		txtpw.setOpaque(false);
		txtpw.setBorder(null);
		txtpw.setBounds(423, 323, 181, 37);
		frame.getContentPane().add(txtpw);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("메이플스토리", Font.BOLD, 12));
		lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/image/login.png")));
		lblNewLabel.setBounds(0, 0, 934, 583);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		JButton btnsign = new JButton("New button");
		btnsign.setFont(new Font("메이플스토리", Font.BOLD, 15));
		btnsign.setOpaque(false);
		btnsign.setBorder(null);
		btnsign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				sign_up.main(null);
				frame.setVisible(false);
				
				
			}
		});
		btnsign.setBounds(277, 375, 97, 23);
		frame.getContentPane().add(btnsign);
		
		JButton btnlogin = new JButton("New button");
		btnlogin.setOpaque(false);
		btnlogin.setBorder(null);
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 id  = txtid.getText();
				String pw = txtid.getText();
				
				try {
					pst = con.prepareStatement("select * from member where id =?  and pw =?");
					
					pst.setString(1, id);
					pst.setString(2, pw);
					
					rs = pst.executeQuery();
					
					if(rs.next()) {
						JOptionPane.showMessageDialog(null,  "로그인 성공");
						if(id.equals("admin") && pw.equals("admin")) {
							frame.dispose();
							Server_main.main(null);
						}else {
							
						
							frame.dispose();
							Client_mainview.main(null);

						}
						
					}else {
						JOptionPane.showMessageDialog(null,  "로그인 실패");
					}
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				memberVO mv = new memberVO(id);
				
			}
		});
		btnlogin.setBounds(389, 405, 104, 45);
		frame.getContentPane().add(btnlogin);

	}




}
