
public class PersonMain {

	public static void main(String[] args) {
		// 객체 생성의 특징
        // 1.객체 생성은 main()안에서만 활용이 가능하다!
		// 2.new 라는 키워드를 사용해야 한다
		//   new 라는 키워드와 동시에 default 생성자 메소드가 호출이 된다.
		//Person의 default생성자를 이용해 객체person1을 생성하세요.
		Person person1 = new Person();
		
		//person1객체에 자신의 이름과 나이로 name,age를 초기화 하세요.
		person1.setName("홍길동");
		person1.setAge(25);
		
		//2개의 매개변수를 넘겨받는 생성자를 이용해 짝꿍의 이름과 나이로 객체 person2를 생성하세요.
		Person person2 = new Person("김영희",27);
		
		//두 사람 객체의 이름과 나이를 아래와 같이 출력하세요.
		System.out.println("Person1의 이름 :"+ person1.getName()+","+"나이 :"+person1.getAge());
		System.out.println("Person2의 이름 :"+ person2.getName()+","+"나이 :"+person2.getAge());

	}

}
