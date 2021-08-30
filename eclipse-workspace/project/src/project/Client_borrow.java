package project;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Panel;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.imageio.ImageIO;
import javax.swing.DropMode;

public class Client_borrow extends login {

	private JFrame frame;
	private JTextField txt_name;
	private JTextField txt_writer;
	private JTextField txt_public;
	private JTextField txt_reamain;
	private JButton btn_borrow;
	int remain =0;
	private BufferedImage pic;
	String book_name = "";

	 String id_log = "";
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	static String book_info = "";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
	
			public void run() {
				try {
					Client_borrow window = new Client_borrow();
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
	
	Controller control = new Controller();
	private JLabel lblNewLabel_1;
	private JButton btn_info;
	public Client_borrow() {
		initialize();
		control.connect();
		
	
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		bookManagementVO bmo = new bookManagementVO();
		String search = bmo.getBook_borrow_name();
		ArrayList<bookManagementVO> list = new ArrayList<>();
		list = control.book_search(search);
		

		
		frame = new JFrame();
		frame.setBounds(0, 200, 952, 622);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().setLayout(null);

		System.out.println(list.get(0).getImage());
		
		
		Controller control = new Controller();
		

		JTextArea textArea = new JTextArea();
		textArea.setBorder(null);
		textArea.setOpaque(false);
		textArea.setFont(new Font("메이플스토리", Font.PLAIN, 13));
		textArea.setLineWrap(true);
		textArea.setBounds(543, 407, 295, 93);
		textArea.setText(list.get(0).getStory());
		frame.getContentPane().add(textArea);
		
		

		
		txt_name = new JTextField();
		txt_name.setFont(new Font("메이플스토리", Font.BOLD, 19));
		txt_name.setOpaque(false);
		txt_name.setBounds(541, 181, 297, 34);
		txt_name.setBorder(null);
		txt_name.setText(list.get(0).getName());
		frame.getContentPane().add(txt_name);
		txt_name.setColumns(10);
		
		txt_writer = new JTextField();
		txt_writer.setFont(new Font("메이플스토리", Font.BOLD, 19));
		txt_writer.setOpaque(false);
		txt_writer.setBorder(null);
		txt_writer.setColumns(10);
		txt_writer.setBounds(541, 256, 297, 34);
		txt_writer.setText(list.get(0).getAuthor());
		frame.getContentPane().add(txt_writer);
		
		txt_public = new JTextField();
		txt_public.setFont(new Font("메이플스토리", Font.BOLD, 19));
		txt_public.setOpaque(false);
		txt_public.setBorder(null);
		txt_public.setColumns(10);
		txt_public.setBounds(541, 323, 297, 34);
		txt_public.setText(list.get(0).getPublisher());
		frame.getContentPane().add(txt_public);
		
		txt_reamain = new JTextField();
		txt_reamain.setHorizontalAlignment(SwingConstants.CENTER);
		txt_reamain.setFont(new Font("메이플스토리", Font.BOLD, 23));
		txt_reamain.setOpaque(false);
		txt_reamain.setBorder(null);
		txt_reamain.setBounds(65, 118, 110, 46);
		txt_reamain.setText(""+list.get(0).getBorrow_book());
		frame.getContentPane().add(txt_reamain);
		txt_reamain.setColumns(10);
		Image image1 = new ImageIcon("C:\\Users\\SM2130\\eclipse-workspace\\project\\src\\image\\new_borrow_image.png").getImage();
		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(952, 583, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 936, 583);
		frame.getContentPane().add(lblNewLabel);
		
		
		btn_borrow = new JButton("");
		btn_borrow.setBorder(null);
		btn_borrow.setOpaque(false);
		btn_borrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String book_name = bmo.getBook_borrow_name();			

			
				Timestamp now = new Timestamp(System.currentTimeMillis());
				Timestamp return_date = new Timestamp(System.currentTimeMillis()+(120960*10000));
				
				String pattern = "yyyy-MM-dd";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				
				String now_borrow = simpleDateFormat.format(now);
				String return_borrow = simpleDateFormat.format(return_date);
				
		
				int a = 0;
				control.book_borrow_insert(id, book_name, now_borrow, return_borrow, a);
				control.close();
				control.connect();
				
				remain = bmo.getBorrow_book();
				control.book_borrow(book_name);

				
				bookManagementVO bmo = new bookManagementVO();
				String search = bmo.getBook_borrow_name();
				ArrayList<bookManagementVO> list = new ArrayList<>();
				list = control.book_search(search);
				
				txt_name.setText(list.get(0).getName());
				txt_writer.setText(list.get(0).getAuthor());
				txt_public.setText(list.get(0).getPublisher());
				textArea.setText(list.get(0).getStory());
				remain = list.get(0).getBorrow_book();
				txt_reamain.setText(""+list.get(0).getBorrow_book());			
				
				

				
				
		
				
			}
		});
		btn_borrow.setBounds(65, 477, 110, 52);
		frame.getContentPane().add(btn_borrow);
		
		
		
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				client_search_book.main(null);
			}
		});
		btnNewButton.setBounds(321, 24, 52, 46);
		frame.getContentPane().add(btnNewButton);
		
		btn_info = new JButton("");
		btn_info.setOpaque(false);
		btn_info.setBorder(null);
		btn_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				borrow_Book_info.main(null);
				
			}
		});
	
		btn_info.setBounds(65, 189, 266, 247);
		frame.getContentPane().add(btn_info);
		
	}
}
