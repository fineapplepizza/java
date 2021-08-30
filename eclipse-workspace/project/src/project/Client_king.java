package project;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Client_king {

	private JFrame frame;
	private JTextField txt_king_name;
	private JTextField txt_king_num;
	private JTextField txt_my_book;
	private JTextField txt_my_num;
	login lg = new login();
	String s = lg.id;
	String my_num = "0";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client_king window = new Client_king();
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
	public Client_king() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 200, 952, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Image image1 = new ImageIcon("C:\\Users\\SM2130\\eclipse-workspace\\project\\src\\image\\read_king.png").getImage();
		
		txt_king_name = new JTextField();
		txt_king_name.setHorizontalAlignment(SwingConstants.CENTER);
		txt_king_name.setFont(new Font("메이플스토리", Font.BOLD, 18));
		txt_king_name.setOpaque(false);
		txt_king_name.setBorder(null);
		txt_king_name.setBounds(312, 165, 60, 33);
		frame.getContentPane().add(txt_king_name);
		txt_king_name.setColumns(10);
		
		txt_king_num = new JTextField();
		txt_king_num.setHorizontalAlignment(SwingConstants.CENTER);
		txt_king_num.setFont(new Font("메이플스토리", Font.BOLD, 18));
		txt_king_num.setOpaque(false);
		txt_king_num.setBorder(null);
		txt_king_num.setColumns(10);
		txt_king_num.setBounds(433, 232, 60, 33);
		frame.getContentPane().add(txt_king_num);
		
		txt_my_book = new JTextField();
		txt_my_book.setHorizontalAlignment(SwingConstants.CENTER);
		txt_my_book.setFont(new Font("메이플스토리", Font.BOLD, 18));
		txt_my_book.setOpaque(false);
		txt_my_book.setBorder(null);
		txt_my_book.setColumns(10);
		txt_my_book.setBounds(456, 375, 60, 33);
		frame.getContentPane().add(txt_my_book);
		
		txt_my_num = new JTextField();
		txt_my_num.setHorizontalAlignment(SwingConstants.CENTER);
		txt_my_num.setFont(new Font("메이플스토리", Font.BOLD, 18));
		txt_my_num.setBorder(null);
		txt_my_num.setOpaque(false);
		txt_my_num.setColumns(10);
		txt_my_num.setBounds(456, 432, 60, 33);
		frame.getContentPane().add(txt_my_num);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(950, 580, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 939, 580);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 frame.dispose();
				 Client_mainview.main(null);
				
			}
		});
		btnNewButton.setBounds(308, 23, 97, 46);
		frame.getContentPane().add(btnNewButton);
		
		JButton btn_read_king = new JButton("");
		
		btn_read_king.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				Controller controll = new Controller();
			
				ArrayList<bookManagementVO> list = controll.read_book_king();
				Object[][] data = new Object[list.size()][2];
				int k=0;
				// list의 내용을 JTable에 저장하기 -> 실제 data에 삽입
				for (int i = 0; i < data.length; i++) {
					for (int j = 0; j < data[i].length; j++) {
						if (j == 0) {
							data[i][j] = list.get(i).getId(); // 아이디
						}
						if (j == 1) {
							data[i][j] = list.get(i).getCount();
							
							if(data[i][0] ==  s) {
								
								my_num = (String)list.get(i).getCount();
							}
							
					}
						
						
						
						
				}
				
				
			}
			
				String king_id = (String)list.get(0).getId();
				String King_num = (String)list.get(0).getCount();
				
				
				
				
			System.out.println(king_id + " "+ King_num);
				txt_king_name.setText(king_id);
				txt_king_num.setText(King_num);

			}
			
			
			
		});
		btn_read_king.setOpaque(false);
		btn_read_king.setBorder(null);
		btn_read_king.setBounds(98, 160, 129, 106);
		frame.getContentPane().add(btn_read_king);
		
		JButton my_read_search = new JButton("");
		my_read_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_my_book.setText(s);
				txt_my_num.setText(my_num);
			}
		});
		my_read_search.setOpaque(false);
		my_read_search.setBorder(null);
		my_read_search.setBounds(98, 364, 129, 58);
		frame.getContentPane().add(my_read_search);
		
		
	}
}
