package project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;


public class ClientBackground {
	
	 Socket socket;
	 DataInputStream in;
	 DataOutputStream out;
	 ClientGui gui;
	 String msg;
	private String nickName;
	public final void setGui(ClientGui gui) {
		this.gui = gui;
	}

	public void connet() {
		try {
			socket = new Socket("127.0.0.1",8888);
			System.out.println("서벼연결됨");
			
			
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
			
			out.writeUTF(nickName);// 접속하자마자 서버가 이걸 닉네임으로 인식을 하고서 맵에 집어넣겠지요?
			
			
			System.out.println("메세지 전송완료");
			
			
			
			while(in !=null) {
			msg = in.readUTF();
			gui.appendMsg(msg);
		}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

	public static void main(String[] args) {
		
		ClientBackground clientBackground = new ClientBackground();
		clientBackground.connet();
		
	}

	public void sendMessage(String msg2) {
		try {
			out.writeUTF( msg2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
		
	}
}
