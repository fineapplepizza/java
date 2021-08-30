package project;



import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.mysql.cj.xdevapi.Client;


import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Cursor;

public class ClientGui extends JFrame implements ActionListener{
	
	 static Object frame;
	JTextArea jta = new JTextArea(40,25);
	 JTextField jtf = new JTextField(25);
	 ClientBackground client = new ClientBackground();
	static String nickName;
	 
	public ClientGui() {
		getContentPane().setLayout(null);
		
		
		
		Image image1 = new ImageIcon("C:/Users/SM2130/eclipse-workspace/project/src/image/chat2.png").getImage();
		JLabel lblNewLabel = new JLabel(new ImageIcon(image1.getScaledInstance(384, 561, Image.SCALE_SMOOTH)));
	    jta.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    jta.setFont(new Font("메이플스토리", Font.BOLD, 19));
	    jta.setBounds(0, 59, 384, 429);
	    jta.setOpaque(false);
	    jta.setBorder(null);
	    getContentPane().add(jta);
	    jtf.setFont(new Font("메이플스토리", Font.BOLD, 19));
	    jtf.setBounds(10, 488, 271, 73);
	    jtf.setOpaque(false);
	    jtf.setBorder(null);
	    getContentPane().add(jtf);
	    jtf.addActionListener(this);
	    
	
		
		lblNewLabel.setBounds(0, 0, 384, 561);
		getContentPane().add(lblNewLabel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		//위치 
		setBounds(100,100,400,600);
		setTitle("어린이");
		
		client.setGui(this);
		client.setNickName(nickName);
		client.connet(); 
		
	}
	
	public static void main(String[] args) {
		
		
		nickName = "";
	
			new ClientGui();
	}

	@Override
	//말치면 보내는 부분
	public void actionPerformed(ActionEvent e) {
		String msg =  "임명진어린이" +":"+ jtf.getText() + "\n";
		client.sendMessage(msg);
		jtf.setText("");
		
		
	}

	public void appendMsg(String msg) {
		jta.append(msg);

	}

}
