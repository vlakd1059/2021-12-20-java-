package �̴��׽�Ʈ;

public class Job {

	String name = "�⺻ĳ����";
	int choice; // ĳ���� ����
	int healthy = 100; // �⺻ü��
	int resistance = 10; // �⺻ �鿪��
	private int nurse = 25; // ��ȣ��
	private int student = 10; // �л�
	private int athlete = 10; // �����

	public void selectJob() {
		System.out.printf("\t\t\t\t\t\t" + "ü�� : %d\n", healthy);
		System.out.printf("\t\t\t\t\t\t" + "�ڷγ� ���� ���׷� (�鿪��) : %d\n", resistance);
	}

	public void J_state(int healthy, int resistance) {
		this.healthy += healthy;
		this.resistance += resistance;
		System.out.println("\t\t\t\t\t\t" + "====���� ���� ====");
		System.out.println("\t\t\t\t\t\t " + name);
		System.out.printf("\t\t\t\t\t\t" + "ü�� : %d\n", healthy);
		System.out.printf("\t\t\t\t\t\t" + "�ڷγ� ���� ���׷� (�鿪��) : %d\n", resistance);
		System.out.println("\t\t\t\t\t\t" + "==============");

	}

}
