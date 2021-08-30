package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Client_mainview  {

	 JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Client_mainview window = new Client_mainview();
		window.frame.setVisible(true);
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Client_mainview() {
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Client_mainview.class.getResource("/image/new_main.png")));
		lblNewLabel.setBounds(0, 0, 934, 583);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn_borrow = new JButton("");
		btn_borrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				client_search_book.main(null);
			}
		});
		btn_borrow.setOpaque(false);
		btn_borrow.setBorder(null);
		btn_borrow.setBounds(76, 88, 185, 63);
		frame.getContentPane().add(btn_borrow);
		
		JButton btn_return_book = new JButton("");
		btn_return_book.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Client_retrurn_book.main(null);
				
				
			}
		});
		btn_return_book.setOpaque(false);
		btn_return_book.setBorder(null);
		btn_return_book.setBounds(76, 263, 185, 63);
		frame.getContentPane().add(btn_return_book);
		
		JButton btn_serch_lib = new JButton("");
		btn_serch_lib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				Main.main(null);
		
			}
		});
		btn_serch_lib.setOpaque(false);
		btn_serch_lib.setBorder(null);
		btn_serch_lib.setBounds(65, 440, 185, 63);
		frame.getContentPane().add(btn_serch_lib);
		
		JButton btn_program = new JButton("");
		btn_program.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Client_week.main(null);
			}
		});
		btn_program.setOpaque(false);
		btn_program.setBorder(null);
		btn_program.setBounds(688, 100, 185, 63);
		frame.getContentPane().add(btn_program);
		
		JButton btn_read_king = new JButton("");
		btn_read_king.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Client_king.main(null);
				
			}
		});
		btn_read_king.setOpaque(false);
		btn_read_king.setBorder(null);
		btn_read_king.setBounds(688, 263, 185, 63);
		frame.getContentPane().add(btn_read_king);
		
		JButton btn_cs1 = new JButton("");
		btn_cs1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
					frame.dispose();
					try {
						ClientGui.main(null);
					} catch (Exception e2) {
						
					
						
					}
			
		
			}
		});
		btn_cs1.setOpaque(false);
		btn_cs1.setBorder(null);
		btn_cs1.setBounds(661, 434, 212, 69);
		frame.getContentPane().add(btn_cs1);
		
		JButton btn_logout = new JButton("");
		btn_logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				login.main(null);
				
			}
		});
		btn_logout.setBounds(787, 10, 137, 42);
		btn_logout.setOpaque(false);
		btn_logout.setBorder(null);
		frame.getContentPane().add(btn_logout);
		
	}
}
