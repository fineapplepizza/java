import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AllComp {

	private JFrame frame;
	private JTextField txt_name;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AllComp window = new AllComp();
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
	public AllComp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 441, 568);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 153, 153));
		frame.getContentPane().add(tabbedPane, "name_11987242341200");
		
		
		// ������ ����ϱ� ���Ͽ� ������� Panel
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 255));
		tabbedPane.addTab("ȭ��1", null, panel, null);
		tabbedPane.setBackground(new Color(255, 204, 255));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 88, 30);
		panel.add(lblNewLabel);
		
		txt_name = new JTextField();
		txt_name.setBounds(112, 10, 270, 30);
		panel.add(txt_name);
		txt_name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC131\uBCC4");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(12, 63, 88, 30);
		panel.add(lblNewLabel_1);
		
		JRadioButton rd_male = new JRadioButton("\uB0A8\uC790");
		buttonGroup.add(rd_male);
		rd_male.setBounds(112, 68, 121, 23);
		panel.add(rd_male);
		
		JRadioButton rd_female = new JRadioButton("\uC5EC\uC790");
		buttonGroup.add(rd_female);
		rd_female.setBounds(237, 68, 121, 23);
		panel.add(rd_female);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uCDE8\uBBF8");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(12, 113, 88, 30);
		panel.add(lblNewLabel_1_1);
		
		JCheckBox ch_1 = new JCheckBox("\uC720\uD29C\uBE0C\uC2DC\uCCAD");
		ch_1.setBounds(112, 118, 115, 23);
		panel.add(ch_1);
		
		JCheckBox ch_2 = new JCheckBox("\uB18D\uAD6C\uC2DC\uCCAD");
		ch_2.setBounds(237, 118, 115, 23);
		panel.add(ch_2);
		
		JCheckBox ch_3 = new JCheckBox("\uAC77\uAE30");
		ch_3.setBounds(112, 158, 115, 23);
		panel.add(ch_3);
		
		JCheckBox ch_4 = new JCheckBox("\uC228\uC26C\uAE30");
		ch_4.setBounds(237, 158, 115, 23);
		panel.add(ch_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\uC88B\uC544\uD558\uB294 \uC74C\uC2DD");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("����", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(12, 207, 88, 30);
		panel.add(lblNewLabel_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uC0BC\uACB9\uC0B4", "\uD53C\uC790", "\uBD88\uACE0\uAE30", "\uD55C\uC6B0", "\uAE40\uBC25"}));
		comboBox.setBounds(112, 212, 241, 23);
		panel.add(comboBox);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 322, 396, 168);
		panel.add(textPane);
		
		JButton btn_insert = new JButton("\uC791\uC131\uC644\uB8CC");
		btn_insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//��ư�� Ŭ���Ǹ� �ۼ��� ������� �о����!
				
				//TextPane�� ������ �����ϱ� ���� ����
				String message;
				
//				String name = txt_name.getText();
				message = txt_name.getText();
				
				// ���� ��ư ���ð� �������� isSelected():boolean ����
				if(rd_male.isSelected()) {
					String gender = rd_male.getText();
					message += "\n"+gender;
				}else {
					String gender = rd_female.getText();
					message += "\n"+gender;
				}
				
				if(ch_1.isSelected()) {
					message+="\n"+ch_1.getText();
				}if(ch_2.isSelected()) {
					message+="\n"+ch_2.getText();
				}if(ch_3.isSelected()) {
					message+="\n"+ch_3.getText();
				}if(ch_4.isSelected()) {
					message+="\n"+ch_4.getText();
				}
				
				// ComboBox ���� ���� ��������
				// getSelecteditem()
				message += "\n"+comboBox.getSelectedItem();
				
				// ���ڿ��� �����;� �� ���
				// 1.����ȯ:(String)
				// 2.�Լ� ���: toString()-> JDBC���� ���� Ȱ�� 
				
				
				// Textpane�� �Է�,���� �� ����ֱ�
				textPane.setText(message);
			}
		});
		btn_insert.setBounds(112, 262, 231, 37);
		panel.add(btn_insert);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("ȭ��2", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 396, 415);
		panel_1.add(scrollPane);
		
		// Table ������ �����
		String[] col = {"�̸�","����"};
		Object[][] data = {{"ä����",20},{"ä����",20},{"ä����",20},{"ä����",20}};
		// �����Ϳ� �������� ������ �������� ���ԵǸ� ��� ���¸� ��Ƴ��� �ִ� Object�� ������ش�!
		
		// JTable(������, �÷��̸�);
		table = new JTable(data,col);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\uCC44\uC218\uBBFC", new Integer(20), "\uC5EC\uC790"},
				{"\uCC44\uC218\uBBFC", new Integer(20), "\uC5EC\uC790"},
				{"\uCC44\uC218\uBBFC", new Integer(20), "\uC5EC\uC790"},
				{"\uCC44\uC218\uBBFC", new Integer(20), "����"},
			},
			new String[] {
				"\uC774\uB984", "\uB098\uC774", "\uC131\uBCC4"
			}
		));
		scrollPane.setViewportView(table);
		
		//table ���� �Ӽ�
		//1. �� �̵� �Ұ�
		table.getTableHeader().setReorderingAllowed(false);
		//2. �� ũ�⺯�� ����
		table.getTableHeader().setResizingAllowed(false);
		//3. �� ���� �����ϱ�
		table.setRowHeight(30);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("ȭ��3", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("ȭ��4", null, panel_3, null);
	}
}
