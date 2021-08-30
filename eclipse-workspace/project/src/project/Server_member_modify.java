package project;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Server_member_modify {

	private JFrame frame;
	private JTextField txt_name;
	private JTextField txt_id;
	private JTextField txt_pw;
	private JTextField txt_adress;
	private JTextField txt_search;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server_member_modify window = new Server_member_modify();
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
	Controller control  = new Controller();
	private JTable table;
	private JButton btnNewButton;
	
	public Server_member_modify() {
		initialize();
		control.connect();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(965, 200, 952, 622);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(94, 350, 675, 191);
		frame.getContentPane().add(scrollPane);
		
		
		table = new JTable();
		String[] col = { "이름", "Id", "주소" };
		ArrayList<memberVO> list = control.member_search();
		Object[][] data = new Object[list.size()][3];

		// list의 내용을 JTable에 저장하기 -> 실제 data에 삽입
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				if (j == 0) {
					data[i][j] = list.get(i).getName(); // 아이디
				}
				if (j == 1) {
					data[i][j] = list.get(i).getId2();
				}
				if (j == 2) {
					data[i][j] = list.get(i).getAddress();
				
				
					
				}
				
			}
		}
		
	

		table = new JTable(data, col);
		
		
	
		
		scrollPane.setViewportView(table);
	
		
		txt_adress = new JTextField();
		txt_adress.setOpaque(false);
		txt_adress.setBorder(null);
		txt_adress.setColumns(10);
		txt_adress.setBounds(173, 186, 532, 35);
		frame.getContentPane().add(txt_adress);
		
		txt_name = new JTextField();
		txt_name.setOpaque(false);
		txt_name.setBorder(null);
		txt_name.setBounds(173, 134, 135, 35);
		frame.getContentPane().add(txt_name);
		txt_name.setColumns(10);
		
		txt_id = new JTextField();
		txt_id.setOpaque(false);
		txt_id.setBorder(null);
		txt_id.setColumns(10);
		txt_id.setBounds(389, 134, 180, 35);
		frame.getContentPane().add(txt_id);
		
		txt_search = new JTextField();
		txt_search.setOpaque(false);
		txt_search.setBorder(null);
		txt_search.setColumns(10);
		txt_search.setBounds(84, 290, 532, 35);
		frame.getContentPane().add(txt_search);
		
		txt_pw = new JTextField();
		txt_pw.setBorder(null);
		txt_pw.setOpaque(false);
		txt_pw.setColumns(10);
		txt_pw.setBounds(630, 134, 180, 35);
		frame.getContentPane().add(txt_pw);
		Image image1 = new ImageIcon("C:\\Users\\SM2130\\eclipse-workspace\\project\\src\\image\\manager_user.png").getImage();
		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(953, 590, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 936, 583);
		frame.getContentPane().add(lblNewLabel);
		
//	String [] col = {"이름","아이디","비밀번호","주소"};
//		
//		ArrayList<memberVO>list = control.member_selectAll();
//		Object[][] data = new Object[list.size()][4];
//		
//		// list의 내용을 JTable에 저장하기 -> 실제 data에 삽입
//		for(int i = 0; i<data.length; i++) {
//			for(int j = 0; j<data[i].length;j++) {
//				if(j == 0) {
//				data[i][j] = list.get(i).getName(); // 아이디
//				}if(j == 1) {
//				data[i][j] = list.get(i).getId();
//				}if(j ==2) {
//				data[i][j] = list.get(i).getPw();
//				}if(j == 3) {
//				data[i][j] = list.get(i).getAddress();
//				}
//			}
//		}
//		table = new JTable(data,col);
		JButton btn_add = new JButton("");
		
		btn_add.setOpaque(false);
		btn_add.setBorder(null);
		btn_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txt_name.getText();
				String id = txt_id.getText();
				String pw = txt_pw.getText();
				String add = txt_adress.getText();
				
				frame.dispose();
				Server_member_modify.main(null);
				
				
				control.member_insert(name, id, pw, add);
			
			}
			
		
	});
		
		
		btn_add.setBounds(748, 179, 57, 42);
		btn_add.setBorder(null);
		btn_add.setOpaque(false);
		frame.getContentPane().add(btn_add);
		
		
		JButton btn_search = new JButton("");
		btn_search.setOpaque(false);
		btn_search.setBorder(null);
		
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String search_name = txt_search.getText();
				

			control.member_search_name(search_name);

				String[] col = { "이름", "id", "주소" };
				Controller controll = new Controller();
				ArrayList<memberVO> list = control.memeber_search_like(search_name);
				Object[][] data = new Object[list.size()][3];

				// list의 내용을 JTable에 저장하기 -> 실제 data에 삽입
				for (int i = 0; i < data.length; i++) {
					for (int j = 0; j < data[i].length; j++) {
						if (j == 0) {
							data[i][j] = list.get(i).getName(); // 아이디
						}
						if (j == 1) {
							data[i][j] = list.get(i).getId();
						}
						if (j == 2) {
							data[i][j] = list.get(i).getAddress();
						}
						
					}
				}

				table = new JTable(data, col);
				scrollPane.setViewportView(table);

			}
		});
				
				
		btn_search.setBounds(630, 296, 57, 42);
		
		frame.getContentPane().add(btn_search);
		
		JButton btn_delete = new JButton("");
		btn_delete.setOpaque(false);
		btn_delete.setBorder(null);
		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
				Object value = table.getValueAt(row, col);
				
				control.delete_member(value);
				
				frame.dispose();
				Server_member_modify.main(null);
			}
		});
		btn_delete.setBounds(709, 290, 57, 42);
		frame.getContentPane().add(btn_delete);
		
		btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Server_main.main(null);
			}
		});
		btnNewButton.setBounds(353, 10, 97, 54);
		frame.getContentPane().add(btnNewButton);
		
	}
}
