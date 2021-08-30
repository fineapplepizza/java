package project;

import java.awt.EventQueue;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Client_retrurn_book {

	private JFrame frame;
	private JTable table;
	private Object value;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client_retrurn_book window = new Client_retrurn_book();
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
	public Client_retrurn_book() {
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
		
		Image image1 = new ImageIcon("C:\\Users\\SM2130\\eclipse-workspace\\project\\src\\image\\return_bool.png").getImage();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(67, 143, 797, 320);
		frame.getContentPane().add(scrollPane);
		

		Controller control = new Controller();
		login lg = new login();
		
		String[] col = { "이름", "빌린 날", "반날 일" };
		ArrayList<bookManagementVO> list = control.borrow_book_see(lg.id);
		Object[][] data = new Object[list.size()][3];

		// list의 내용을 JTable에 저장하기 -> 실제 data에 삽입
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (j == 0) {
					data[i][j] = list.get(i).getBook_name(); // 아이디
				}
				if (j == 1) {
					data[i][j] = list.get(i).getBook_date();
				}
				if (j == 2) {
					data[i][j] = list.get(i).getBook_return_date();
				}
			}
		}

	
		
		table = new JTable(data,col);
		
		scrollPane.setViewportView(table);
		
		
		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(950, 590, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 936, 583);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn_return = new JButton("New button");
		btn_return.setOpaque(false);
		btn_return.setBorder(null);
		btn_return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
				value = table.getValueAt(row, col);
				System.out.println("밸류값 >>" + value);
				
				control.book_borrow_return(value);
				
				control.close();
				control.connect();
				
				control.book_return_update(value);
				
				frame.dispose();
				Client_retrurn_book.main(null);
				
			}
		});
		btn_return.setBounds(67, 473, 114, 62);
		frame.getContentPane().add(btn_return);
		
		JButton btn_back = new JButton("New button");
		btn_back.setBorder(null);
		btn_back.setOpaque(false);
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Client_mainview.main(null);
			}
		});
		btn_back.setBounds(316, 24, 56, 46);
		frame.getContentPane().add(btn_back);
	}
}
