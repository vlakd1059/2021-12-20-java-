package �̴��׽�Ʈ;

import java.nio.channels.SelectableChannel;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1.ȸ������ 2. �α���
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
				System.out.print("\t\t\t\t\t" + "===== 1.ȸ������ 2.�α��� 3.���� =====");
				int menu = sc.nextInt();
				if (menu == 1) {
					// ȸ������
					System.out.println("\t\t\t\t\t" + " ==== ȸ������ ==== ");
					System.out.print("\t\t\t\t\t\t" + "���̵� �Է� : ");
					String id = sc.next();
					System.out.print("\t\t\t\t\t\t" + "��й�ȣ �Է� : ");
					String pw = sc.next();
					System.out.print("\t\t\t\t\t\t" + " �г��� �Է� : ");
					String nick = sc.next();

					int cnt = dao.join(id, pw, nick);
					if (cnt > 0) {
						System.out.println("\t\t\t\t\t" + "ȸ������ ����...");
					} else {
						System.out.println("\t\t\t\t\t" + "ȸ������ ����...");
					}

				} else if (menu == 2) {
					// �α���â
					System.out.println("\t\t\t\t\t\t" + " ==== �α��� ==== ");
					System.out.print("\t\t\t\t\t\t" + "���̵� �Է� : ");
					String id = sc.next();
					System.out.print("\t\t\t\t\t\t" + "��й�ȣ �Է� : ");
					String pw = sc.next();

					String nick = dao.login(id, pw);
					if (nick != null) {
						System.out.println();
						System.out.println("\t\t\t\t\t\t" + nick + "�� ȯ���մϴ�...");
						System.out.println();
						System.out.println();
						System.out.println("\t\t\t\t\t\t" + "====���� ����==== ");
						System.out.println("\t\t\t\t" + "|| 1. ��ȣ�� : ������ -> �鿪�� 15 ���� ���·� ����.. ||");
						System.out.println("\t\t\t\t" + "|| 2. ����� : ����ü�� -> ü�� 20 ���� ���·� ����.. ||");
						System.out.println("\t\t\t\t" + "|| 3. ���л� : ���� ���� -> �ڷγ� ������� 1ȸ�� ��ŵ ����.. ||");
						System.out.println();

						System.out.print("\t\t\t\t\t" + "|| 1. ��ȣ�� 2. ����� 3. ���л� ||");
						int choice = sc.nextInt();
						if (choice == 1) {
							// ��ȣ��
							System.out.println("\t\t\t\t\t\t" + "��ȣ�� ���� �Ϸ�..");
							// ������� ���� �����ֱ�
							jb.J_state(100, 25);

							System.out.println();
							pr.region_sel(); // ���� ��¹� �޼ҵ�

							pr.region_sel2();
							exit++;
							pr.timelate(1); // ������ ���丮

							if (exit != 0) {
								break;
							}

						} else if (choice == 2) {
							// �����
							System.out.println("\t\t\t\t\t\t" + "����� ���� �Ϸ�..");
							// ������� ���� �����ֱ�
							jb.J_state(120, 10);

							System.out.println();
							pr.region_sel(); // ���� ��¹� �޼ҵ�
							pr.region_sel3();
							exit++;
							pr.timelate(1); // ������ ���丮

							if (exit != 0) {
								break;

							}

						} else if (choice == 3) {
							// �л�
							System.out.println("\t\t\t\t\t\t" + "���л� ���� �Ϸ�..");
							// ������� ���� �����ֱ�
							jb.J_state(100, 10);

							System.out.println();
							pr.region_sel(); // ���� ��¹� �޼ҵ�
							pr.region_sel4();
							exit++;
							pr.timelate(1); // ������ ���丮

							if (exit != 0) {
								break;
							}

						}
					} else {
						System.out.println("\t\t\t\t\t\t" + "�α��� ����...");

					}

				} else if (menu == 3) {
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t" + " ���� ����...");
					break;
				}
			}
		} else {
			System.out.println("\t\t\t\t\t\t" + "EXIT...");

		}
	}
}
