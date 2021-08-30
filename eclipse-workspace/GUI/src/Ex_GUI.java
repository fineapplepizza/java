import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex_GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			// 실제 프레임(윈도우창)을 띄워주기 위한 메소드
			public void run() {
				// 자바의 오류 
				// 1.컴파일 오류 : 문법이 잘못되었을 때 
				// 2.런타임 오류 : 문법에는 잘못이 없지만 실행시 오류가 발생되는 것
				try {
					Ex_GUI window = new Ex_GUI();
					// 실제 화면에 프레임을 띄워주는 메소드 boolean 형태의 값만 들어갈수 있다.
					// true : 창이 보이게 / false : 창이 보이지 않게
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
	// 접근지정자,클래스의 이름과 동일 -> 생성자 메소드
	public Ex_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	//실제 디자인을 위한 기능들을 구현
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.RED);
		// setBounds() -> 프레임의 크기와 위치를 지정하는 메소드
		// (x축,y축,가로,세로)
		frame.setBounds(300, 150, 600, 400);
		// 프레임을 닫아주는 역할
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/////////////////////////////////////////////////////
		
		JLabel lblNewLabel = new JLabel("\uBC18\uAC11\uC2B5\uB2C8\uB2E4 \uC5EC\uB7EC\uBD84!");
		lblNewLabel.setBounds(0, 0, 584, 31);
		// 투명으로 기본값이 설정되어 있는 라벨의 옵셕을 풀어주는 기능!
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 26));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uD074\uB9AD");
		btnNewButton.setBounds(0, 338, 584, 23);
		btnNewButton.setBackground(new Color(204, 153, 255));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(-12, 41, 97, 60);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(231, 140, 238, 118);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(40, 162, 33, 118);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(277, 70, -106, 9);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(120, 70, 90, 53);
		frame.getContentPane().add(btnNewButton_5);
		// 생략시 : 프레임은 닫히지만 프로그램 자체는 돌아가는 중
		// 작성시 : 프레임과 동시에 프로그램이 닫히는 기능
	}
}
