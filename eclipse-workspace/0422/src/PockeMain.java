import java.util.ArrayList;
import java.util.Scanner;

public class PockeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ���� ����Ʈ�� Ȱ���Ͽ� ����ڰ� ���ϴ� Ÿ������ �����ϱ�!
		// 1.import �۾� ������ �ֱ�!
		// 2.� Ÿ������ ���� ����Ʈ�� �����Ұ��� Ÿ�� ����!
		ArrayList<Pockemon> pocke_list = new ArrayList<Pockemon>();

		// �ݺ������� ���ϸ��� �����ϱ� ���� �ݺ��� �ۼ�
		while (true) {

			System.out.print("���ϸ��� �̸�: ");
			String name = sc.next();
			System.out.print("���ϸ��� Ÿ��:");
			String type = sc.next();
			System.out.print("���� : ");
			int shield = sc.nextInt();
			System.out.print("���ݷ� : ");
			int attack = sc.nextInt();
			System.out.print("ü�� : ");
			int hp = sc.nextInt();

			// 1. Pockemon Ŭ������ ���Ͽ� mon ��ü ����!
			Pockemon mon = new Pockemon(name, type, shield, attack, hp);

			// ArrayList �߰� �Լ� -> .add()
			pocke_list.add(mon);

			// ��� �����ؾ����� �𸣰� �߰������� ������ �� �ִ� ����� ArrayList
			// ArrayList�� ��� ���� Ȯ���ϱ� -> .get()
			// ArrayList�� ũ�⸦ Ȯ���ϴ� �Լ� -> .size()

			System.out.println();
			System.out.println("=====���ϸ� ����Ʈ=====");
			for (int i = 0; i < pocke_list.size(); i++) {
				System.out.println(pocke_list.get(i).getName() + ", " + pocke_list.get(i).getType() + ", "
						+ pocke_list.get(i).getshield() + ", " + pocke_list.get(i).getattack() + ","
						+ pocke_list.get(i).gethp());
			}
			System.out.println();
			
			
			
		} // while���� ������ ����
	}// main()������ ����

}// class ������ ����
