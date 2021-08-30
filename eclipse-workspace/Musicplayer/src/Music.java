
public class Music {
	
	// ���ǿ� ���� ������ ������ �� �ִ� Model -> Value Object(VO Class)
	
	// �뷡����,�����̸�,�÷��� Ÿ��,�뷡���
	private String title;
	private String singer;
	private int playTime;
	private String musicPatch;
	
	
	// �������� �߰��� �� �� �ִ� ������ �޼ҵ� 
	public Music(String title, String singer, int playTime, String musicPatch) {
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
		this.musicPatch = musicPatch;
		// ������ �ѹ��� �����ϱ� : alt + shift +r
	}
	
	
	// ������ ������ �� �� �ִ� getter() ����
	public String getTitle() {
		return title;
	}
	
	public String getSinger() {
		return singer;
	}
	
	public int getPlayTime() {
		return playTime;
	}
	
	public String getMusicPatch() {
		return musicPatch;
	}

}
