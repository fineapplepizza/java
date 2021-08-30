import java.util.ArrayList;
import java.util.Scanner;

public class PockeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 가변 리스트를 활용하여 사용자가 원하는 타입으로 생성하기!
		// 1.import 작업 실행해 주기!
		// 2.어떤 타입으로 가변 리스트를 생성할건지 타입 지정!
		ArrayList<Pockemon> pocke_list = new ArrayList<Pockemon>();

		// 반복적으로 포켓몬을 생성하기 위한 반복문 작성
		while (true) {

			System.out.print("포켓몬의 이름: ");
			String name = sc.next();
			System.out.print("포켓몬의 타입:");
			String type = sc.next();
			System.out.print("방어력 : ");
			int shield = sc.nextInt();
			System.out.print("공격력 : ");
			int attack = sc.nextInt();
			System.out.print("체력 : ");
			int hp = sc.nextInt();

			// 1. Pockemon 클래스를 통하여 mon 객체 생성!
			Pockemon mon = new Pockemon(name, type, shield, attack, hp);

			// ArrayList 추가 함수 -> .add()
			pocke_list.add(mon);

			// 몇개를 관리해야할지 모르고 추가적으로 설정할 수 있는 기능은 ArrayList
			// ArrayList에 담긴 내용 확인하기 -> .get()
			// ArrayList의 크기를 확인하는 함수 -> .size()

			System.out.println();
			System.out.println("=====포켓몬 리스트=====");
			for (int i = 0; i < pocke_list.size(); i++) {
				System.out.println(pocke_list.get(i).getName() + ", " + pocke_list.get(i).getType() + ", "
						+ pocke_list.get(i).getshield() + ", " + pocke_list.get(i).getattack() + ","
						+ pocke_list.get(i).gethp());
			}
			System.out.println();
			
			
			
		} // while문이 끝나는 지점
	}// main()끝나는 지점

}// class 끝나는 지점
