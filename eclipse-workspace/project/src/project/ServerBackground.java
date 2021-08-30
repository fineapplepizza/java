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
	 //����ڵ��������� �����ϴ� ���� �̰� 
	 private Map<String, DataOutputStream > clientsMap = new HashMap<String, DataOutputStream>();
	 
	//1. �޼��� �ְ�ޱ�
	//2. �ϱ����� GUI�� ���鵵������ 
	//3. ����
	public final void setGui(ServerGui gui) {
		this.gui = gui;
	}

	
	public void setting() {
		try {
			
			Collections.synchronizedMap(clientsMap);//������������
			//��������
			severSocket = new ServerSocket(8888);
			//������ ������ ��� �湮�ڹ޾Ƽ� ���ù� �����ϱ�
			while(true) {
				System.out.println("�����");
				socket = severSocket.accept();
				System.out.println(socket.getInetAddress()+ "���� �����߽��ϴ�.");
				
				//���ο� ����� ������ Ŭ���� ���� �������� �־���
				
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
		//��Ʈ��ũ ���Ϲ���
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
				 //��� ��⸸��!
				while(in !=null) {
				msg = in.readUTF();
				// gui.appendMsg(msg);
				sendMessage(msg);
				gui.appendMsg(msg);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//������� ����� ���⼭ �������� ���⼭ ���� 
				removeClient(nick);
			}
		
			
		}
	}



}

