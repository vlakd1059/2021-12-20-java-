package �̴��׽�Ʈ;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Print {
	Scanner sc = new Scanner(System.in);

	Area ar = new Area();

	public void region_sel() {
		System.out.println("\t\t\t\t\t\t" + "==== ���� ���� ==== ");
		System.out.println("\t\t\t\t\t" + "|| 1. ������ : �鿪�� 0�߰� < Hard .. > ||");
		System.out.println("\t\t\t\t\t" + "|| 2. ����� : �鿪�� 15�߰� < Normal.. > ||");
		System.out.println("\t\t\t\t\t" + "|| 3. ������ ���¥�� : �鿪�� 30�߰� < Easy.. > ||");
		System.out.println();
		System.out.print("\t\t\t\t\t" + "|| 1. ������ 2. ����� 3. ������ ���¥�� ||");
	}

	public void region_sel2() { // ��ȣ��

		int exit = 0;
		int choice2 = sc.nextInt(); // �������� ����
		// ���̵��� ���� ���׷�(�鿪��) �߰�
		if (choice2 == 1) {
			// ������ : 0 �߰�
			System.out.println("\t\t\t\t\t\t" + " ������ ���ÿϷ�.. ");
			System.out.println();
			ar.A_state(100, 25);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;
		} else if (choice2 == 2) {
			// ����� : 15 �߰�
			System.out.println("\t\t\t\t\t\t" + " ����� ���ÿϷ�.. ");
			System.out.println();
			ar.A_state(100, 40);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;
		} else if (choice2 == 3) {
			// ������ : 30 �߰�
			System.out.println("\t\t\t\t\t\t" + " ������ ��¥�� ���ÿϷ�.. ");
			System.out.println();
			ar.A_state(100, 55);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;

		}
	}

	public void region_sel3() { // �л�

		int exit = 0;
		int choice2 = sc.nextInt(); // �������� ����
		// ���̵��� ���� ���׷�(�鿪��) �߰�
		if (choice2 == 1) {
			// ������ : 0 �߰�
			System.out.println("\t\t\t\t\t\t" + " ������ ���ÿϷ�.. ");
			System.out.println();
			ar.A_state(120, 10);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;
		} else if (choice2 == 2) {
			// ����� : 15 �߰�
			System.out.println("\t\t\t\t\t\t" + " ����� ���ÿϷ�.. ");
			System.out.println();
			ar.A_state(120, 25);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;
		} else if (choice2 == 3) {
			// ������ : 30 �߰�
			System.out.println("\t\t\t\t\t\t" + " ������ ��¥�� ���ÿϷ�.. ");
			System.out.println();
			ar.A_state(120, 40);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;

		}
	}

	public void region_sel4() { // ���

		int exit = 0;
		int choice2 = sc.nextInt(); // �������� ����
		// ���̵��� ���� ���׷�(�鿪��) �߰�
		if (choice2 == 1) {
			// ������ : 0 �߰�
			System.out.println("\t\t\t\t\t\t" + " ������ ���ÿϷ�.. ");
			System.out.println();
			ar.A_state(100, 10);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;
		} else if (choice2 == 2) {
			// ����� : 15 �߰�
			System.out.println("\t\t\t\t\t\t" + " ����� ���ÿϷ�.. ");
			System.out.println();
			ar.A_state(100, 25);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;
		} else if (choice2 == 3) {
			// ������ : 30 �߰�
			System.out.println("\t\t\t\t\t\t" + " ������ ��¥�� ���ÿϷ�.. ");
			System.out.println();
			ar.A_state(100, 40);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;

		}
	}

	public void timelate(int a) {
		try {
			TimeUnit.SECONDS.sleep(1);
			System.out.println("\t\t\t\t\t" + " �ڷγ� ���������� ���� ���ѹα��� �ɰ��� ħü�⸦ �ް� �ִ�... ");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("\t\t\t\t" + " 2021��... ����� �ڷγ��� �ɸ��� �ʰ� ���ѹα����� ��Ƴ����� ���� ���ΰ�...  ");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("\t\t\t\t" + " ȭ���� ��ħ�޻��� ���� ���δ� ���... �����߸� �Ϸ��� �ϰ��� �����ϰ� �ȴ�... ");
		} catch (Exception e) {
		}
	}

}
