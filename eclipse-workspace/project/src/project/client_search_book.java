package project;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ButtonGroup;

public class client_search_book {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTextField txt_name;
	static String borrow_book_name;
	String book_name = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					client_search_book window = new client_search_book();
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
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public client_search_book() {
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
		
		Image image1 = new ImageIcon("C:\\Users\\SM2130\\eclipse-workspace\\project\\src\\image\\new_search.png").getImage();
		
		txt_name = new JTextField();
		txt_name.setFont(new Font("메이플스토리", Font.BOLD, 18));
		txt_name.setBounds(370, 96, 339, 46);
		frame.getContentPane().add(txt_name);
		txt_name.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(53, 150, 828, 308);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		
		String[] col = { "책이름", "저자", "출판사","책내용","대출가능권수"};
		ArrayList<bookManagementVO> list = control.book_selectAll();
		Object[][] data = new Object[list.size()][5];
		
		
		// list의 내용을 JTable에 저장하기 -> 실제 data에 삽입
		
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (j == 0) {
					data[i][j] = list.get(i).getName(); // 아이디
				}
				if (j == 1) {
					data[i][j] = list.get(i).getAuthor();
				}
				if (j == 2) {
					data[i][j] = list.get(i).getPublisher();
				}	if (j == 3) {
					data[i][j] = list.get(i).getStory();
				}	if (j == 4) {
					data[i][j] = list.get(i).getBorrow_book();
				}
				
			}
		}
		
		
		table_1 = new JTable(data, col);
		table_1.setFont(new Font("메이플스토리", Font.BOLD, 15));
		scrollPane.setViewportView(table_1);
		
		JCheckBox chc_book_name = new JCheckBox("");
		buttonGroup.add(chc_book_name);
		chc_book_name.setBounds(174, 108, 16, 23);
		chc_book_name.setOpaque(false);
		chc_book_name.setBorder(null);
		frame.getContentPane().add(chc_book_name);
		
		JCheckBox chc_author = new JCheckBox("");
		buttonGroup.add(chc_author);
		chc_author.setBounds(231, 108, 16, 23);
		chc_author.setOpaque(false);
		chc_author.setBorder(null);
		frame.getContentPane().add(chc_author);
		
		JCheckBox chc_public2 = new JCheckBox("");
		buttonGroup.add(chc_public2);
		chc_public2.setOpaque(false);
		chc_public2.setBorder(null);
		
		chc_public2.setBounds(301, 108, 26, 23);
		frame.getContentPane().add(chc_public2);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(953, 590, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 936, 583);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		
		JButton btn_search = new JButton("");
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int a=0;
				String search_name = txt_name.getText();
				
				
				
				if(chc_book_name.isSelected() == true) {
					a=0;
				}else if (chc_author.isSelected() == true) {
					a=1;
				}else {
					a=2;
				}
					
					
					Controller controll = new Controller();
					String[] col = { "책이름", "저자", "출판사","책내용","대출가능권수"};
					ArrayList<bookManagementVO> list = control.book_search_check(a, search_name);
					Object[][] data = new Object[list.size()][5];
					
					
					// list의 내용을 JTable에 저장하기 -> 실제 data에 삽입
					
					for (int i = 0; i < data.length; i++) {
						for (int j = 0; j < data[i].length; j++) {
							if (j == 0) {
								data[i][j] = list.get(i).getName(); // 아이디
							}
							if (j == 1) {
								data[i][j] = list.get(i).getAuthor();
							}
							if (j == 2) {
								data[i][j] = list.get(i).getPublisher();
							}	if (j == 3) {
								data[i][j] = list.get(i).getStory();
							}	if (j == 4) {
								data[i][j] = list.get(i).getBorrow_book();
							}
							
						}
					}
					
					
					table = new JTable(data, col);
					scrollPane.setViewportView(table);
			}
		});
		btn_search.setOpaque(false);
		btn_search.setBorder(null);
		btn_search.setBounds(715, 96, 58, 46);
		frame.getContentPane().add(btn_search);
		
		JButton btn_borrow = new JButton("");
		btn_borrow.setOpaque(false);
		btn_borrow.setBorder(null);
		btn_borrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
				Object value1 = table.getValueAt(row, col);
				System.out.println(value1);
				
				borrow_book_name = (String) value1;
				bookManagementVO bmo = new bookManagementVO();
				bmo.setBook_borrow_name(borrow_book_name);
				
				frame.dispose();
				Client_borrow.main(null);
			}
		});
		btn_borrow.setBounds(53, 468, 137, 67);
		frame.getContentPane().add(btn_borrow);
		
		JButton btn_delivery = new JButton("");
		btn_delivery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
				Object value1 = table.getValueAt(row, col);
				System.out.println(value1);
				
				borrow_book_name = (String) value1;
				bookManagementVO bmo = new bookManagementVO();
				bmo.setBook_borrow_name(borrow_book_name);
				
				frame.dispose();
				Client_delivery.main(null);
			}
		});
		btn_delivery.setOpaque(false);
		btn_delivery.setBorder(null);
		btn_delivery.setBounds(202, 468, 137, 67);
		frame.getContentPane().add(btn_delivery);
		
		JButton btn_back = new JButton("");
		btn_back.setOpaque(false);
		btn_back.setBorder(null);
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
				Client_mainview.main(null);
				
				
			}
		});
		btn_back.setBounds(302, 10, 97, 63);
		frame.getContentPane().add(btn_back);
	}
}
