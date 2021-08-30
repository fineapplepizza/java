package project;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class Client_delivery {

	private JFrame frame;
	private JTextField txt_name;
	private JTextField txt_number;
	private JTextField txt_adress;
	private JTextField txt_remain;
	int remain ;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client_delivery window = new Client_delivery();
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
	private JButton btn_back;
	private JButton btn_delivery;
	private JTextArea textArea;
	public Client_delivery() {
		initialize();
		
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
		
		
		Image image1 = new ImageIcon("C:\\Users\\SM2130\\eclipse-workspace\\project\\src\\image\\new_deli_img.png").getImage();
		
		textArea = new JTextArea();
		textArea.setOpaque(false);
		textArea.setBorder(null);
		textArea.setBounds(540, 411, 307, 93);
		frame.getContentPane().add(textArea);
		
		txt_name = new JTextField();
        String book_name = bmo.book_borrow_name;
        txt_name.setText(book_name);
		txt_name.setFont(new Font("메이플스토리", Font.BOLD, 18));
		txt_name.setOpaque(false);
		txt_name.setOpaque(false);
		txt_name.setBorder(null);
		txt_name.setBounds(540, 182, 307, 31);
		
			frame.getContentPane().add(txt_name);
			txt_name.setColumns(10);
		
		txt_number = new JTextField();
		txt_number.setFont(new Font("메이플스토리", Font.BOLD, 18));
		txt_number.setBorder(null);
		txt_number.setOpaque(false);
		
		txt_number.setColumns(10);
		
		txt_number.setBounds(540, 251, 307, 31);
		frame.getContentPane().add(txt_number);
		
		txt_adress = new JTextField();
		txt_adress.setFont(new Font("메이플스토리", Font.BOLD, 18));
		txt_adress.setColumns(10);
		txt_adress.setOpaque(false);
		
		txt_adress.setBorder(null);
		txt_adress.setBounds(540, 321, 307, 31);
		frame.getContentPane().add(txt_adress);
		
	
		
		
		txt_remain = new JTextField();
		txt_remain.setHorizontalAlignment(SwingConstants.CENTER);
		txt_remain.setFont(new Font("메이플스토리", Font.BOLD, 23));
		txt_remain.setBorder(null);
		txt_remain.setOpaque(false);
		txt_remain.setText(""+list.get(0).getBorrow_book());
		txt_remain.setBounds(66, 117, 99, 44);
		frame.getContentPane().add(txt_remain);
		
		txt_remain.setColumns(10);
		JLabel lblNewLabel =  new JLabel(new ImageIcon(image1.getScaledInstance(953, 590, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 936, 583);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		JButton btn_ask = new JButton("");
		btn_ask.setOpaque(false);
		btn_ask.setBorder(null);
		btn_ask.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				String book_name = bmo.getBook_borrow_name();			

				
				Timestamp now = new Timestamp(System.currentTimeMillis());
				Timestamp return_date = new Timestamp(System.currentTimeMillis()+(120960*10000));
				
				String pattern = "yyyy-MM-dd";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
				
				String now_borrow = simpleDateFormat.format(now);
				String return_borrow = simpleDateFormat.format(return_date);
				
				login id = new login();
				int a = 1;
				control.book_borrow_insert(id.id, book_name, now_borrow, return_borrow, a);
				
				control.close();
				control.connect();
				
				
				
				bookManagementVO bmo = new bookManagementVO();
				String search = bmo.getBook_borrow_name();
				ArrayList<bookManagementVO> list = new ArrayList<>();
				list = control.book_search(search);
	
				
				control.book_borrow(book_name);

				JOptionPane.showMessageDialog(null, "배달신청 완료");				
				remain = list.get(0).getBorrow_book();
				txt_remain.setText(""+ list.get(0).getBorrow_book());	
				
				String name = txt_name.getText();
				String number = txt_name.getText();
				String address = textArea.getText();
				String delivery_date = simpleDateFormat.format(now);
				
				
				control.book_delivery_insert(id.id, book_name, number, address, delivery_date);
				
				frame.dispose();
				client_search_book.main(null);
			
	
			}
		});
		
		btn_ask.setBounds(55, 472, 124, 63);
		frame.getContentPane().add(btn_ask);
		
		btn_back = new JButton("");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				client_search_book.main(null);
			}
		});
		btn_back.setOpaque(false);
		btn_back.setBorder(null);
		btn_back.setBounds(300, 10, 97, 56);
		frame.getContentPane().add(btn_back);
		
		btn_delivery = new JButton("");
		btn_delivery.setOpaque(false);
		btn_delivery.setBorder(null);
		btn_delivery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrow_Book_info.main(null);
			}
		});
		btn_delivery.setBounds(66, 188, 267, 247);
		frame.getContentPane().add(btn_delivery);
	}

}
