
public class Person {
	
	// 사람의 이름과 나이, 행동들을 정리할 수 있는 클래스 생성
	// 클래스의 구조 -> 필드(속성,데이터),메소드(행동,로직)
	
	// 1.필드 정의
	private String name ;
	private int age;
	
	// 2.메소드 정의
	// 생성자 메소드 특징
	// 1.리턴의 타입이 존재하지 않는다(void X)
	// 2.생성자 메소드의 이름 클래스의 이름과 동일하다.
	// 3.생성자 메소드의 오버로딩(중복정의)이 가능하다.
	
	// default 생성자 메소드
	public Person() {
//		// 아무런 기능도 하지 않고 수행하지 않는 기본적인 생성자
	}
	
	// Person 생성자 메소드 오버로딩(중복정의)-똑같은 이름으로 중복되게 정의하겠다는 말
	// 2개의 매개변수를 초기화 할 수 있는 기능 정의
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		// 설계도에 저장되어 있는 name 리턴하는 기능
		return name;
	}

	public void setName(String name) {
		// 메소드 호출시 작성되는 매개변수 데이터를 설계도에 저장하는 기능
		this.name = name;
	}

	public int getAge() {
		// age 리턴을 해주는 기능
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//get/set() 단축키 -> alt + shift +s
	//개발할때는 단축키 많이 쓰는거 추천
	//생성자: 어떤 값으로 똑같은 물체를 만들어 낼것인지 옵션 값을 지정하는 것

}
