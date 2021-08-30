import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {
   // ������ ����� �����ϴ� Ŭ���� -> Controller
   
   // �뷡�� ������ �ֵ��� ������!
   
   // �������� ������ ������ �ִ� ��������Ʈ(ArrayList) ���� -> ������ ��ü�� ���� ��
   ArrayList<Music> list = new ArrayList<>();
   
   //MP3PlayerŬ������ ����ϱ� ���� ��ü ����
   MP3Player mp3 = new MP3Player();
   Music song ;
   
   // �÷��� �ǰ� �ִ� ���� �ε��� ��ȣ�� ����ϱ� ���� ���� ����!
   int num = 0;
   
   // �������� ������ list�� �߰����� ������ �޼ҵ�
   public MusicPlayer() {
      
   //   �ܺ� ��� -> "C://music/lilac.mp3"
      list.add(new Music("���϶�", "������", 40, "music/lilac.mp3"));
      list.add(new Music("On the ground", "����", 90, "music/On the ground.mp3"));
      list.add(new Music("parachute", "John K", 100, "music/parachute.mp3"));
      list.add(new Music("peaches", "Justin Bieber", 10, "music/peaches.mp3"));
      list.add(new Music("Rollin", "�극�̺� �ɽ�", 117, "music/rollin.mp3"));
   
   }
   
   
   // �뷡�� ����ϱ� ���� �޼ҵ� ����
   public Music play() {
      song = list.get(num);
      
      // ����� ���� �߰��ϱ� -> ���� ����ǰ� �ִ� �뷡�� ���������� �뷡�� ���!
      // boolean Ÿ���� isPlaying() : ����Ǵ� ������ �ִ� (true) / false
      if(!mp3.isPlaying()) {
         // MP3Player�� play()
         mp3.play(song.getMusicPatch());
      }
      return song;
   }
   
   // ���� ����� ������ �����ִ� �޼ҵ� ����
   public String musicInfo(Music song) {
      return song.getTitle() + ", " + song.getSinger() + ", " + changeTime(song);
   }
   
   
   // ����ð��� ��/�ʷ� �����ִ� �޼ҵ�
   public String changeTime(Music song) {
      return (song.getPlayTime() / 60) + "��" + (song.getPlayTime() % 60) +"��";
   }
   
   // ���� ����� �����ټ� �ִ� �޼ҵ�
   public void stop() {
      if(mp3.isPlaying()) {
         mp3.stop();
      }
   }
   
   // �������� ����ϱ� ���� �޼ҵ�
   public Music nextPlay() {
      // 0 -> 1 -> 2 -> 3 -> 4 -> 0
      if(num < list.size()-1) {
         num++;
      }else {
         num = 0;
      }
      
      // ���� ����ǰ� �ִ� �뷡�� �ִٸ� ���� ������ ����
      if(mp3.isPlaying()) {
         mp3.stop();
      }
      
      song = list.get(num);
      mp3.play(song.getMusicPatch());
      return song;
      
   }
   // �������� ����ϱ� ���� �޼ҵ� ����
   public Music prePlay() {
   
   // ���� ����ϰ� �ִ� num���� �������� ���ư��� ���� ó��
   // 4 -> 3 -> 2 -> 1-> 0 -> 4  
   if(num > 0) {
	   --num;
   }else {
	   num = list.size()-1;
   }
// ���� ����ǰ� �ִ� �뷡�� �ִٸ� ���� ������ ����
   if(mp3.isPlaying()) {
      mp3.stop();
   }
   
   song = list.get(num);
   mp3.play(song.getMusicPatch());
   return song;
   
}
}
   
