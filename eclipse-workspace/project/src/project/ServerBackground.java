package project;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;



public class ServerBackground {
	
	 ServerSocket severSocket;
	 Socket socket;
	 String nick;
	 ServerGui gui;
	 String msg;
	 //사용자들의정보를 저장하는 맵임 이게 
	 private Map<String, DataOutputStream > clientsMap = new HashMap<String, DataOutputStream>();
	 
	//1. 메세지 주고받기
	//2. 하기전에 GUI를 만들도록하자 
	//3. 연동
	public final void setGui(ServerGui gui) {
		this.gui = gui;
	}

	
	public void setting() {
		try {
			
			Collections.synchronizedMap(clientsMap);//교통정리해줌
			//서버열림
			severSocket = new ServerSocket(8888);
			//서버가 할일은 계속 방문자받아서 리시버 생성하기
			while(true) {
				System.out.println("대기중");
				socket = severSocket.accept();
				System.out.println(socket.getInetAddress()+ "에서 접속했습니다.");
				
				//새로운 사용자 쓰레드 클래스 생성 소켓정보 넣어줘
				
				Receiver receiver = new Receiver(socket);
				receiver.start();
				
			}
			
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
	}



	public static void main(String[] args) {
		ServerBackground serverBackground = new ServerBackground();
		serverBackground.setting();
		
	}



	
	public void addClient(String nick, DataOutputStream out) {
		// TODO Auto-generated method stub
		clientsMap.put(nick,out);
		
	}
	public void removeClient(String nick) {
		clientsMap.remove(nick);
	}
	
	
	public void sendMessage(String msg) {
	
			 Iterator<String> it = clientsMap.keySet().iterator();
			 
			 String key;
			 while(it.hasNext()) {
				 try {
					key=it.next();
					 					 clientsMap.get(key).writeUTF(key + " " + msg);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		 	 
		 }

	
	class Receiver extends Thread{
		//네트워크 소켓받음
		 DataInputStream in;
		 DataOutputStream out;
		
		
		
		public Receiver(Socket socket) {
			try {
				out = new DataOutputStream(socket.getOutputStream());
				in = new DataInputStream(socket.getInputStream());
				 nick = in.readUTF();
				
				addClient(nick, out);
			}
			
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}	
		

		public void run() {
			 try {
				 //계속 듣기만함!
				while(in !=null) {
				msg = in.readUTF();
				// gui.appendMsg(msg);
				sendMessage(msg);
				gui.appendMsg(msg);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//사용접속 종료시 여기서 에러말생 여기서 나감 
				removeClient(nick);
			}
		
			
		}
	}



}

