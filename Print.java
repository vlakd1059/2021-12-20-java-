package 미니테스트;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Print {
	Scanner sc = new Scanner(System.in);

	Area ar = new Area();

	public void region_sel() {
		System.out.println("\t\t\t\t\t\t" + "==== 지역 선택 ==== ");
		System.out.println("\t\t\t\t\t" + "|| 1. 수도권 : 면역력 0추가 < Hard .. > ||");
		System.out.println("\t\t\t\t\t" + "|| 2. 지방권 : 면역력 15추가 < Normal.. > ||");
		System.out.println("\t\t\t\t\t" + "|| 3. 강원도 산골짜기 : 면역력 30추가 < Easy.. > ||");
		System.out.println();
		System.out.print("\t\t\t\t\t" + "|| 1. 수도권 2. 지방권 3. 강원도 산골짜기 ||");
	}

	public void region_sel2() { // 간호사

		int exit = 0;
		int choice2 = sc.nextInt(); // 지역선택 변수
		// 난이도별 지역 저항력(면역력) 추가
		if (choice2 == 1) {
			// 수도권 : 0 추가
			System.out.println("\t\t\t\t\t\t" + " 수도권 선택완료.. ");
			System.out.println();
			ar.A_state(100, 25);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;
		} else if (choice2 == 2) {
			// 지방권 : 15 추가
			System.out.println("\t\t\t\t\t\t" + " 지방권 선택완료.. ");
			System.out.println();
			ar.A_state(100, 40);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;
		} else if (choice2 == 3) {
			// 강원도 : 30 추가
			System.out.println("\t\t\t\t\t\t" + " 강원도 골짜기 선택완료.. ");
			System.out.println();
			ar.A_state(100, 55);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;

		}
	}

	public void region_sel3() { // 학생

		int exit = 0;
		int choice2 = sc.nextInt(); // 지역선택 변수
		// 난이도별 지역 저항력(면역력) 추가
		if (choice2 == 1) {
			// 수도권 : 0 추가
			System.out.println("\t\t\t\t\t\t" + " 수도권 선택완료.. ");
			System.out.println();
			ar.A_state(120, 10);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;
		} else if (choice2 == 2) {
			// 지방권 : 15 추가
			System.out.println("\t\t\t\t\t\t" + " 지방권 선택완료.. ");
			System.out.println();
			ar.A_state(120, 25);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;
		} else if (choice2 == 3) {
			// 강원도 : 30 추가
			System.out.println("\t\t\t\t\t\t" + " 강원도 골짜기 선택완료.. ");
			System.out.println();
			ar.A_state(120, 40);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;

		}
	}

	public void region_sel4() { // 운동인

		int exit = 0;
		int choice2 = sc.nextInt(); // 지역선택 변수
		// 난이도별 지역 저항력(면역력) 추가
		if (choice2 == 1) {
			// 수도권 : 0 추가
			System.out.println("\t\t\t\t\t\t" + " 수도권 선택완료.. ");
			System.out.println();
			ar.A_state(100, 10);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;
		} else if (choice2 == 2) {
			// 지방권 : 15 추가
			System.out.println("\t\t\t\t\t\t" + " 지방권 선택완료.. ");
			System.out.println();
			ar.A_state(100, 25);
			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			exit++;
		} else if (choice2 == 3) {
			// 강원도 : 30 추가
			System.out.println("\t\t\t\t\t\t" + " 강원도 골짜기 선택완료.. ");
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
			System.out.println("\t\t\t\t\t" + " 코로나 대유행으로 인해 대한민국은 심각한 침체기를 겪고 있다... ");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("\t\t\t\t" + " 2021년... 당신은 코로나를 걸리지 않고 대한민국에서 살아남을수 있을 것인가...  ");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("\t\t\t\t" + " 화려한 아침햇살이 나를 감싸는 방안... 눈을뜨며 하루의 일과를 시작하게 된다... ");
		} catch (Exception e) {
		}
	}

}
