import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ex_02 {
	// ex_01 ���� �α��� ��ư�� Ŭ���� ����Ǵ� â
    
	// Ŭ������ �ʵ�(�Ӽ�,������) �κ�
	private JFrame frame;
	String id;

	/**
	 * Launch the application.
	 */
	// ���α׷��� ���� �޼ҵ�κ��� ���� ȯ�濡�� �����͸�
	// �Ѱ��ֱ� ���Ͽ� �ٸ� main()�� ������� �۴´�!
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex_02 window = new ex_02();
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
	public ex_02() {
		initialize();
	}
	
	// ������ �޼ҵ� �����ε�(�ߺ�����)
	public ex_02(String id) {
		this.id = id;
		
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 153, 153));
		frame.setBounds(100, 100, 551, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(id+"\uD658\uC601\uD569\uB2C8\uB2E4");
		lblNewLabel.setBackground(new Color(204, 102, 204));
		lblNewLabel.setForeground(new Color(0, 153, 204));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 35));
		lblNewLabel.setBounds(12, 247, 520, 96);
		frame.getContentPane().add(lblNewLabel);
		
		
		//�̹����� �ҷ����� ���� �ۼ���
		// ImageIcon -> �̹����� �߰��ϱ� ���� Ŭ����
		ImageIcon img = new ImageIcon("image/unnamed.png");
		
		// ImageIcon���� ���� ���� �̹����� ������ �� �� �ֵ��� ó��!
		// getImage() : ImageŬ������ ���ؼ� ���� �̹����� ������ �� �� �ִ� ���
		Image pic = img.getImage();
		//�ʹ� �� ����� �༮���� ������ �����
		Image changepic = pic.getScaledInstance(532, 414, 0);
		
		//����� �̹����� ��� IMmageIcon ����
		ImageIcon changeImg = new ImageIcon(changepic);
		
		// �̹��� �׼��� ���� ���ο� �̹��� �߰��ϱ�!
		ImageIcon img2 = new ImageIcon("image/���ڵ�_����_�Ϸ���Ʈ.png");
		Image pic2 = img2.getImage();
		Image changePic2= pic2.getScaledInstance(532, 414, 0);
		ImageIcon changeImg2 = new ImageIcon(changePic2);
		// �̹����� �����ϱ� ���� ��
		JLabel lbl_img = new JLabel(changeImg);
		lbl_img.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// ���콺�� ���� ���� ������ ������ ��(��ü �̹���)\
				lbl_img.setIcon(changeImg2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// ���콺�� �� ������ ����� �� (���� �̹���)
				lbl_img.setIcon(changeImg);
			}
		});
//		lbl_img.setIcon(new ImageIcon("C:\\Users\\SM2127\\Desktop\\00535983901_20150718.jpg"));
		lbl_img.setBounds(0, 0, 532, 411);
		frame.getContentPane().add(lbl_img);
		
		
		
	}

}
