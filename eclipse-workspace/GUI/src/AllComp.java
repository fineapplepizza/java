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
		
		
		// 텝으로 사용하기 위하여 만들어진 Panel
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 204, 255));
		tabbedPane.addTab("화면1", null, panel, null);
		tabbedPane.setBackground(new Color(255, 204, 255));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC774\uB984");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 88, 30);
		panel.add(lblNewLabel);
		
		txt_name = new JTextField();
		txt_name.setBounds(112, 10, 270, 30);
		panel.add(txt_name);
		txt_name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC131\uBCC4");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
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
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 16));
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
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.PLAIN, 12));
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
				//버튼이 클릭되면 작성된 내용들을 읽어오기!
				
				//TextPane에 내용을 누적하기 위한 변수
				String message;
				
//				String name = txt_name.getText();
				message = txt_name.getText();
				
				// 라디오 버튼 선택값 가져오기 isSelected():boolean 형태
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
				
				// ComboBox 선택 내용 가져오기
				// getSelecteditem()
				message += "\n"+comboBox.getSelectedItem();
				
				// 문자열로 가져와야 할 경우
				// 1.형변환:(String)
				// 2.함수 사용: toString()-> JDBC사용시 많이 활용 
				
				
				// Textpane에 입력,선택 값 띄워주기
				textPane.setText(message);
			}
		});
		btn_insert.setBounds(112, 262, 231, 37);
		panel.add(btn_insert);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("화면2", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 396, 415);
		panel_1.add(scrollPane);
		
		// Table 데이터 만들기
		String[] col = {"이름","나이"};
		Object[][] data = {{"채수민",20},{"채수민",20},{"채수민",20},{"채수민",20}};
		// 데이터에 문자형을 포함한 정수형이 포함되면 모든 형태를 담아낼수 있는 Object로 만들어준다!
		
		// JTable(데이터, 컬럼이름);
		table = new JTable(data,col);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\uCC44\uC218\uBBFC", new Integer(20), "\uC5EC\uC790"},
				{"\uCC44\uC218\uBBFC", new Integer(20), "\uC5EC\uC790"},
				{"\uCC44\uC218\uBBFC", new Integer(20), "\uC5EC\uC790"},
				{"\uCC44\uC218\uBBFC", new Integer(20), "여자"},
			},
			new String[] {
				"\uC774\uB984", "\uB098\uC774", "\uC131\uBCC4"
			}
		));
		scrollPane.setViewportView(table);
		
		//table 관련 속성
		//1. 셀 이동 불가
		table.getTableHeader().setReorderingAllowed(false);
		//2. 셀 크기변경 막기
		table.getTableHeader().setResizingAllowed(false);
		//3. 셀 높이 변경하기
		table.setRowHeight(30);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("화면3", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("화면4", null, panel_3, null);
	}
}
