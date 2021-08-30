package project;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Server_main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
	
			public void run() {
				try {
					Server_main window = new Server_main();
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
	public Server_main() {
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
		Image image1 = new ImageIcon("C:\\Users\\SM2130\\eclipse-workspace\\project\\src\\image\\server_main_view_new.png").getImage();
		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(953, 590, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 948, 593);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn_modify = new JButton("");
		btn_modify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				bookManagement.main(null);
				
			}
		});
		btn_modify.setOpaque(false);
		btn_modify.setBorder(null);
		btn_modify.setBounds(79, 207, 201, 55);
		frame.getContentPane().add(btn_modify);
		
		JButton btn_delivery = new JButton("");
		btn_delivery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Server_Book_delivery.main(null);
			}
		});
		btn_delivery.setOpaque(false);
		btn_delivery.setBorder(null);
		btn_delivery.setBounds(79, 322, 201, 55);
		frame.getContentPane().add(btn_delivery);
		
		JButton btn_add_delete = new JButton("");
		btn_add_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Server_member_modify.main(null);
			}
		});
		btn_add_delete.setOpaque(false);
		btn_add_delete.setBorder(null);
		btn_add_delete.setBounds(383, 207, 201, 55);
		frame.getContentPane().add(btn_add_delete);
		
		JButton btn_late = new JButton("");
		btn_late.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				latecomer.main(null);
				
			}
		});
		btn_late.setOpaque(false);
		btn_late.setBorder(null);
		btn_late.setBounds(383, 322, 201, 55);
		frame.getContentPane().add(btn_late);
		
		JButton btn_server_cs = new JButton("");
		btn_server_cs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				ServerGui.main(null);
			}
		});
		btn_server_cs.setOpaque(false);
		btn_server_cs.setBorder(null);
		btn_server_cs.setBounds(383, 426, 201, 55);
		frame.getContentPane().add(btn_server_cs);
		
		JButton btn_logout = new JButton("");
		btn_logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				login.main(null);
			}
		});
		btn_logout.setOpaque(false);
		btn_logout.setBorder(null);

		btn_logout.setBounds(813, 462, 97, 95);
		frame.getContentPane().add(btn_logout);
		
		JButton btn_week = new JButton("");
		btn_week.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				server_week.main(null);
			}
		});
		btn_week.setOpaque(false);
		btn_week.setBorder(null);
		
		btn_week.setBounds(694, 225, 181, 55);
		frame.getContentPane().add(btn_week);


	
		
	}
}
