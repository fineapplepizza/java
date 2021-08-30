
public interface Skill {
	// interface 는 클래스가 아니다!
	// -> new 라는 키워드를 사용해서 객체를 생성할 수 없다!(일종의 약속을 만드는것)
	
	// 상수 선언시 파란색으로 표시
	// 인터페이스 내의 변수들은 모두 상수로 지정된다.
	// final키워드를 생략할 수 있다.
	public final String server = "스카니아";
	
	public abstract void attack();
	// abstract 키워드가 생략되어도 자동적으로 추상 메소드로 인지한다!
	
	public abstract void run();
	
	
	

}
