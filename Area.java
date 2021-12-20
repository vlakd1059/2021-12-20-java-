package 미니테스트;

import java.util.Scanner;

public class Area {
	String name = "기본캐릭터";
	int choice; // 캐릭터 선택
	int healthy = 100; // 기본체력
	int resistance = 10; // 기본 면역력
	private int nurse = 25; // 간호사
	private int student = 10; // 학생
	private int athlete = 10; // 운동선수
	private int sudo = 0;
	private int jibang = 15;
	private int gangwon = 30;

	public void selectArea() {
		System.out.printf("\t\t\t\t\t\t" + "체력 : %d\n", healthy);
		System.out.printf("\t\t\t\t\t\t" + "코로나 감염 저항력 (면역력) : %d\n", resistance);
	}

	public void A_state(int healthy, int resistance) {
		this.healthy += healthy;
		this.resistance += resistance;
		System.out.println("\t\t\t\t\t\t" + "====현재 상태 ====");
		System.out.println("\t\t\t\t\t\t " + name);
		System.out.printf("\t\t\t\t\t\t" + "체력 : %d\n", healthy);
		System.out.printf("\t\t\t\t\t\t" + "코로나 감염 저항력 (면역력) : %d\n", resistance);
		System.out.println("\t\t\t\t\t\t" + "==============");

	}

}
