
public class Main {

	public static void main(String[] args) {
		//객체(object)를 생성하는 공간
		// 설계도(class)기반으로 객체를 메모리에 할당하는 공간 >> 클래스의 인스턴스화
		//hyung이라는 이름을 가진 Peole설계도를 가지고 객체를 만들꺼야
        People hyung = new People();   		
        // new >> 레퍼런스변수(참조형변수)를 생성할때 쓰는 키워드
        // 참조형- 그 데이터의 주소값(인덱스번호)을 쓰는 것
        System.out.println(hyung);
        //레퍼런스변수는 주소값을 가지고 있다.
        //접근하는 방법은 .을 통해 접근한다.
        System.out.println(hyung.age);
        System.out.println(hyung.name);
        // 필드가 채워지지 않은경우
        // 기본형 데이터타입의 기본값 = 0;
        // 참조형 데이터타입의 기본값 = null;
        // 이름 >> 정형
        hyung.name = "정형";
        // 나이 >> 20
        hyung.age = 20;
        // 키 >> 185.9
        hyung.height = 185.9;
        //장기>> 심장,간,폐
        hyung.organs = new String[3];
        hyung.organs[0] = "심장";
        hyung.organs[1] = "간";
        hyung.organs[2] = "폐";
        System.out.println(hyung.name);
        System.out.println(hyung.age);
        System.out.println(hyung.height);
        System.out.println(hyung.organs[1]);
        
        hyung.eat();
        hyung.sleep();
	}

}
