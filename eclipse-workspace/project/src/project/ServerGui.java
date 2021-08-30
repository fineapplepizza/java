package project;



import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Cursor;

public class ServerGui extends JFrame implements ActionListener{

	 static Object frame;
	JTextArea jta = new JTextArea(40,25);
	 JTextField jtf = new JTextField(25);
	
	//연동
	 ServerBackground server = new ServerBackground();
	
	public ServerGui() {
		getContentPane().setLayout(null);
		
		Image image1 = new ImageIcon("C:/Users/SM2130/eclipse-workspace/project/src/image/chat1.png").getImage();
		jtf.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		jtf.setFont(new Font("메이플스토리", Font.BOLD, 19));
		jtf.setBounds(10, 487, 259, 74);
		jtf.setBorder(null);
		jtf.setOpaque(false);
		getContentPane().add(jtf);
		jtf.addActionListener(this);
		jta.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		jta.setFont(new Font("메이플스토리", Font.BOLD, 19));
		
		jta.setBounds(0, 62, 384, 429);
		getContentPane().add(jta);
		jta.setOpaque(false);
		jta.setBorder(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(384, 561, Image.SCALE_SMOOTH)));
		

		
		lblNewLabel.setBounds(0, 0, 384, 561);
		getContentPane().add(lblNewLabel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(1200,100,400,600);
		setTitle("서버부분");
		
		server.setGui(this);
		server.setting();
		
	}
	
	public static void main(String[] args) {
		
		new ServerGui();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = "관리자 : "+jtf.getText() + "\n";
		jta.append(msg);
		System.out.println(msg); 
		server.sendMessage(msg);
		jtf.setText("");
	}

	public void appendMsg(String msg) {
		jta.append(msg);
		System.out.println("날라온 메세지" + msg);
		
		
	}
}
