package project;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Server_Book_delivery {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server_Book_delivery window = new Server_Book_delivery();
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
	public Server_Book_delivery() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(965, 200, 952, 622);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Image image1 = new ImageIcon("C:\\Users\\SM2130\\eclipse-workspace\\project\\src\\image\\manager_bookdelivery.png").getImage();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(76, 187, 793, 345);
		frame.getContentPane().add(scrollPane);
		
		Controller control = new Controller();
		table = new JTable();
		
		String[] col = { "아이디", "책이름", "전화번호", "주소","배송신청일" };
		ArrayList<bookManagementVO> list = control.book_delivery_view();
		Object[][] data = new Object[list.size()][5];

		// list의 내용을 JTable에 저장하기 -> 실제 data에 삽입
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (j == 0) {
					data[i][j] = list.get(i).getId(); // 아이디
				}
				if (j == 1) {
					data[i][j] = list.get(i).getBook_name();
				}
				if (j == 2) {
					data[i][j] = list.get(i).getNumber();
				}if (j == 3) {
					data[i][j] = list.get(i).getAddress();
				}if (j == 4) {
					data[i][j] = list.get(i).getDelivery_date();
				}
				
			}
		}

		table = new JTable(data, col);
		scrollPane.setViewportView(table);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(953, 590, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0,0,940, 590);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBorder(null);
		btnNewButton.setOpaque(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Server_main.main(null);
			}
		});
		btnNewButton.setBounds(371, 20, 97, 49);
		frame.getContentPane().add(btnNewButton);
	}
}
