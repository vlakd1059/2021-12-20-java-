package �̴��׽�Ʈ;

import java.util.Scanner;

public class Area {
	String name = "�⺻ĳ����";
	int choice; // ĳ���� ����
	int healthy = 100; // �⺻ü��
	int resistance = 10; // �⺻ �鿪��
	private int nurse = 25; // ��ȣ��
	private int student = 10; // �л�
	private int athlete = 10; // �����
	private int sudo = 0;
	private int jibang = 15;
	private int gangwon = 30;

	public void selectArea() {
		System.out.printf("\t\t\t\t\t\t" + "ü�� : %d\n", healthy);
		System.out.printf("\t\t\t\t\t\t" + "�ڷγ� ���� ���׷� (�鿪��) : %d\n", resistance);
	}

	public void A_state(int healthy, int resistance) {
		this.healthy += healthy;
		this.resistance += resistance;
		System.out.println("\t\t\t\t\t\t" + "====���� ���� ====");
		System.out.println("\t\t\t\t\t\t " + name);
		System.out.printf("\t\t\t\t\t\t" + "ü�� : %d\n", healthy);
		System.out.printf("\t\t\t\t\t\t" + "�ڷγ� ���� ���׷� (�鿪��) : %d\n", resistance);
		System.out.println("\t\t\t\t\t\t" + "==============");

	}

}
