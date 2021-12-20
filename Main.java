package 미니테스트;

import java.nio.channels.SelectableChannel;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1.회원가입 2. 로그인
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		Job jb = new Job();
		Area ar = new Area();
		Print pr = new Print();

		System.out.print(
				"\t\t\t" + " || " + "\t" + "  1. GAME START " + "\t" + " || " + "\t" + "  2. EXIT " + "\t" + " || ");
		int sel = sc.nextInt();

		if (sel == 1) {
			System.out.println(

					" () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () ()");
			System.out.println("                                             \r\n"
					+ "        ___         ___         ___                \r\n"
					+ "      //   ) )    //   ) )    //   ) )    /_  /    \r\n"
					+ "       ___/ /    //   / /      ___/ /      / /     \r\n"
					+ "     / ____/    //   / /     / ____/      / /      \r\n"
					+ "    / /____    ((___/ /     / /____      / /       ");

			System.out.println("\t                                                     \r\n"
					+ "                                                      \r\n"
					+ "                           / ___      ___        __        ___        ___    \r\n"
					+ "                         //\\ \\     //   ) )   //  ) )   //___) )   //   ) ) \r\n"
					+ "                        //  \\ \\   //   / /   //        //         //   / /  \r\n"
					+ "                       //    \\ \\ ((___/ /   //        ((____     ((___( (   \t ");

			// System.out.println();
			System.out.println("                                                                          \r\n"
					+ "                                                                          \r\n"
					+ "                                                                          \r\n"
					+ "                                            ___                   __               ( )              ___       //  \r\n"
					+ "                                          ((   ) )   //   / /   //  ) ) ||  / /   / /   ||  / /   //   ) )   //   \r\n"
					+ "                                           \\ \\      //   / /   //       || / /   / /    || / /   //   / /   //    \r\n"
					+ "                                        //___) )   ((___( (   //        ||/ /   / /     ||/ /   ((___( (   //     ");

			System.out.println();
			System.out.println();
			System.out.println(

					" () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () ()");
			int exit = 0;
			while (true) {
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("\t\t\t\t\t" + "===== 1.회원가입 2.로그인 3.종료 =====");
				int menu = sc.nextInt();
				if (menu == 1) {
					// 회원가입
					System.out.println("\t\t\t\t\t" + " ==== 회원가입 ==== ");
					System.out.print("\t\t\t\t\t\t" + "아이디 입력 : ");
					String id = sc.next();
					System.out.print("\t\t\t\t\t\t" + "비밀번호 입력 : ");
					String pw = sc.next();
					System.out.print("\t\t\t\t\t\t" + " 닉네임 입력 : ");
					String nick = sc.next();

					int cnt = dao.join(id, pw, nick);
					if (cnt > 0) {
						System.out.println("\t\t\t\t\t" + "회원가입 성공...");
					} else {
						System.out.println("\t\t\t\t\t" + "회원가입 실패...");
					}

				} else if (menu == 2) {
					// 로그인창
					System.out.println("\t\t\t\t\t\t" + " ==== 로그인 ==== ");
					System.out.print("\t\t\t\t\t\t" + "아이디 입력 : ");
					String id = sc.next();
					System.out.print("\t\t\t\t\t\t" + "비밀번호 입력 : ");
					String pw = sc.next();

					String nick = dao.login(id, pw);
					if (nick != null) {
						System.out.println();
						System.out.println("\t\t\t\t\t\t" + nick + "님 환영합니다...");
						System.out.println();
						System.out.println();
						System.out.println("\t\t\t\t\t\t" + "====직업 선택==== ");
						System.out.println("\t\t\t\t" + "|| 1. 간호사 : 조기백신 -> 면역력 15 증가 상태로 시작.. ||");
						System.out.println("\t\t\t\t" + "|| 2. 운동선수 : 만렙체력 -> 체력 20 증가 상태로 시작.. ||");
						System.out.println("\t\t\t\t" + "|| 3. 대학생 : 한턴 무적 -> 코로나 대유행시 1회차 스킵 가능.. ||");
						System.out.println();

						System.out.print("\t\t\t\t\t" + "|| 1. 간호사 2. 운동선수 3. 대학생 ||");
						int choice = sc.nextInt();
						if (choice == 1) {
							// 간호사
							System.out.println("\t\t\t\t\t\t" + "간호사 선택 완료..");
							// 현재상태 먼저 보여주기
							jb.J_state(100, 25);

							System.out.println();
							pr.region_sel(); // 지역 출력문 메소드

							pr.region_sel2();
							exit++;
							pr.timelate(1); // 오프닝 스토리

							if (exit != 0) {
								break;
							}

						} else if (choice == 2) {
							// 운동선수
							System.out.println("\t\t\t\t\t\t" + "운동선수 선택 완료..");
							// 현재상태 먼저 보여주기
							jb.J_state(120, 10);

							System.out.println();
							pr.region_sel(); // 지역 출력문 메소드
							pr.region_sel3();
							exit++;
							pr.timelate(1); // 오프닝 스토리

							if (exit != 0) {
								break;

							}

						} else if (choice == 3) {
							// 학생
							System.out.println("\t\t\t\t\t\t" + "대학생 선택 완료..");
							// 현재상태 먼저 보여주기
							jb.J_state(100, 10);

							System.out.println();
							pr.region_sel(); // 지역 출력문 메소드
							pr.region_sel4();
							exit++;
							pr.timelate(1); // 오프닝 스토리

							if (exit != 0) {
								break;
							}

						}
					} else {
						System.out.println("\t\t\t\t\t\t" + "로그인 실패...");

					}

				} else if (menu == 3) {
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t" + " 게임 종료...");
					break;
				}
			}
		} else {
			System.out.println("\t\t\t\t\t\t" + "EXIT...");

		}
	}
}
