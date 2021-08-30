package project;

public class memberVO {
	
	private String name;
	static String id;
	private String id2;
	private String pw;
	private String address;
	
	public memberVO(String id) {
		this.id = id;
	}
	
	public memberVO(String name, String id, String pw, String address) {
		
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.address = address;
		
	}
	
	
	public memberVO(String name, String id, String address) {
		this.name = name;
		this.id2 = id;
		this.address = address;
	}

	

	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getId() {
		return id;
	}
	public final void setId(String id) {
		this.id = id;
	}
	public final String getPw() {
		return pw;
	}
	public final void setPw(String pw) {
		this.pw = pw;
	}
	public final String getAddress() {
		return address;
	}
	public final void setAddress(String address) {
		this.address = address;
	}
	public final String getId2() {
		return id2;
	}

	public final void setId2(String id2) {
		this.id2 = id2;
	}
	
}
