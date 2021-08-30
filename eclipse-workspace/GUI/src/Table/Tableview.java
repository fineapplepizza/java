package Table;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tableview {

	private JFrame frame;
	private JTable table;
	
	//Tableview에서 사용될 ArrayList 생성
	ArrayList<MemberVO>list = new ArrayList<>();
	private JTextField txt_search;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Tableview window = new Tableview();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Tableview(ArrayList members) {
		this.list = members;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 452, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 88, 412, 304);
		frame.getContentPane().add(scrollPane);
		
		//원본이 되는 테이블 데이터
		//컬럼의 내용을 넣기 위해서
		String[]col = {"이름","나이","성별"};
		//데이터들을 넣기 위해서 생성
		Object[][] data = new Object[list.size()][col.length];
		
		for(int i=0; i<list.size();i++) {
			data[i][0] = list.get(i).name;
			data[i][1] = list.get(i).age;
			data[i][2] = list.get(i).gender;
		}
		
		table = new JTable(data,col);
		scrollPane.setViewportView(table);
		
		JButton btn_search = new JButton("New button");
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//텍스트 필드에 입력된 내용을 가지고 오기
				//검색의 기준은 이름!
				String search = txt_search.getText();
				
				Object[][] data = new Object[1][3];
				
				for(int i=0; i<list.size();i++){
					// 검색한 이름과 동일한 이름을 가지고 있는 ArrayList의 내용을 
					// 새로운 data배열에 담는다!
					if(search.equals(list.get(i).name)) {//내가 입력한 녀석이 list안에 이름과 같은지 판단
						data[0][0] = list.get(i).name;
						data[0][1] = list.get(i).age;
						data[0][2] = list.get(i).gender;
						
					}
			
		}
				
				// 기존에 있는 테이블의 내용을 삭제하기
				table.removeAll();
				table = new JTable(data,col);
				scrollPane.setViewportView(table);
				
			}
		});
		btn_search.setBounds(327, 10, 97, 54);
		frame.getContentPane().add(btn_search);
		
		txt_search = new JTextField();
		txt_search.setBounds(12, 10, 317, 54);
		frame.getContentPane().add(txt_search);
		txt_search.setColumns(10);
	}
}
