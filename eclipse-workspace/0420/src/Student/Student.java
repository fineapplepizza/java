package Student;

public class Student {
	//.이름,학번,나이를 새성하는 순간에 데이터를 채워주는 생성자를 만들기.
	// 생성자(constructor)
	//코드낭비를 줄이기 위해서
	//1.메소드
	//2.클래스와 생성자(메소드)의 이름이 동일해야한다.
	//3.리턴타입을 지정하지 않는다. void조차 작성하지 않는다.
	//4.메소드 중복정의(오버로딩)가능한다.
	public Student(String name, int age, String number) {
		//필드에 작성된 값을 활용하기 위해서 저장함
		this.name = name;
		this.age = age;
		this.number = number;
	}
	public Student(String name, String number) {
		this.name = name;
		this.number = number;
		
	}
	//설계도를 작성하는 공간
	//1.필드
	//이름
	private String name;
	//학번
	private String number;
	//나이
	private int age;
	//자바점수
	private int scoreJava;
	//웹점수
	private int scoreWeb;
	//안드점수
	private int scoreAndroid;
	//----------------------------------------------------//
	public int getScoreJava() {
		return scoreJava;
	}
	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}
	public int getScoreWeb() {
		return scoreWeb;
	}
	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}
	public int getScoreAndroid() {
		return scoreAndroid;
	}
	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}
	public String getName() {
		return name;
	}
	public String getNumber() {
		return number;
	}
	public int getAge() {
		return age;
	}
    
	
}
