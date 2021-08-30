package project;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Client_week {

	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client_week window = new Client_week();
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
	public Client_week() {
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
		
		Image image1 = new ImageIcon("C:\\Users\\SM2130\\eclipse-workspace\\project\\src\\image\\program_main.png").getImage();
		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(952, 590, Image.SCALE_SMOOTH)));
		lblNewLabel.setBounds(0, 0, 936, 583);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn_week_1 = new JButton("");
		btn_week_1.setOpaque(false);
		btn_week_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				Client_week1.main(null);

		
				
			}
		});
		btn_week_1.setBounds(34, 87, 282, 468);
		btn_week_1.setBorder(null);
		frame.getContentPane().add(btn_week_1);
		
		JButton btn_week_2 = new JButton("");
		btn_week_2.setOpaque(false);
		btn_week_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				Client_week2.main(null);

			}
		});
		btn_week_2.setBorder(null);
		btn_week_2.setBounds(328, 87, 282, 468);
		frame.getContentPane().add(btn_week_2);
		
		JButton btn_week_3 = new JButton("");
		btn_week_3.setOpaque(false);
		btn_week_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Client_week3.main(null);

			}
		});
		btn_week_3.setBorder(null);
		btn_week_3.setBounds(621, 87, 282, 468);
		frame.getContentPane().add(btn_week_3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setOpaque(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				frame.dispose();
				Client_mainview.main(null);
				
			}
		});
		btnNewButton.setBounds(316, 22, 59, 44);
		frame.getContentPane().add(btnNewButton);
	}
}
