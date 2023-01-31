package ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileIOApp {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int kor1 = 0, kor2 = 0, kor3 = 0;
		int total;
		int answer = 1;
		double avg;
		int menu;

		while (answer != 0) { // answer에 기본 값이 들어가 있지 않고 0이 아니면 모든 값을 사용할 수 있는 방법
			// while (answer == 1) { //오로지 1만 사용할 수 있는 방식*
			{
				do {

					System.out.printf("┌───────────────┐\n");
					System.out.printf("│ 국 어 성 적 메 뉴                        │\n");
					System.out.printf("└───────────────┘\n");

					System.out.println("1.성적입력");
					System.out.println("2.파일입력");
					System.out.println("3.콘솔출력");
					System.out.println("4.파일저장");
					System.out.println("5.나가기");

					System.out.println("선택 >");

					menu = scan.nextInt();

				} while (menu < 0 || menu > 5);
			}

			System.out.println("1번 검사전");
			if (menu == 1) {
//		콘솔 입력 부분
				// Scanner scan = new Scanner(System.in); 노란색이 뜨는 이유: 닫아주질 않아서 하지만 닫으면 큰일남

				System.out.printf("┌───────────────┐\n");
				System.out.printf("│ 국 어 성 적 입 력                        │\n");
				System.out.printf("└───────────────┘\n");
				do {
					System.out.print("kor1의 값은:");
					kor1 = scan.nextInt(); // 원하는 숫자 값이 아닌 아스키코드의 해당하는 값이 나옴!
					// 0부터 100까지만 입력하셔야 합니다!
					if (0 > kor1 || kor1 > 100)
						System.out.println("0부터 100까지만 입력하셔야 합니다!");
				} while (0 > kor1 || kor1 > 100);
//						System.out.println("0부터 100까지만 입력하셔야 합니다!");						
//						System.out.print("kor1의 값은:"); do while 이전 코드
//						kor1 = scan.nextInt(); 원하는 숫자 값이 아닌 아스키코드의 해당하는 값이 나옴!						

				do {
					System.out.print("kor2의 값은:");
					kor2 = scan.nextInt(); // 원하는 숫자 값이 아닌 아스키코드의 해당하는 값이 나옴!
					// 0부터 100까지만 입력하셔야 합니다!
					if (0 > kor2 || kor2 > 100)
						System.out.println("0부터 100까지만 입력하셔야 합니다!");
				} while (0 > kor2 || kor2 > 100);

				do {
					System.out.print("kor3의 값은:");
					kor3 = scan.nextInt(); // 원하는 숫자 값이 아닌 아스키코드의 해당하는 값이 나옴!
					// 0부터 100까지만 입력하셔야 합니다!
					if (0 > kor3 || kor3 > 100)
						System.out.println("0부터 100까지만 입력하셔야 합니다!");
				} while (0 > kor3 || kor3 > 100);

				scan.nextLine();

			}

//		----------------------------------- ctrl+shift+o누르면 자동 import! 
			// System.out.println("2번 검사전");

			else if (menu == 2) {
//		파일 입력 부분
				FileInputStream fis = new FileInputStream("res/data.csv");
				Scanner scan2 = new Scanner(fis);

				String line = scan2.nextLine();
				String[] kors = line.split(",");

				kor1 = Integer.parseInt(kors[0]);
				kor2 = Integer.parseInt(kors[1]);
				kor3 = Integer.parseInt(kors[2]);

				scan2.close();
				fis.close();

			}

//		-----------------------------------

			// System.out.println("3번 검사전");
			else if (menu == 3) {
//		콘솔 출력 부분
				total = kor1 + kor2 + kor3;
				avg = total / 3.0; // 번역기(컴파일러)가 알아서 고쳐준다. 3.0을 붙이면 에러가 나는 이유는 double형인 3.0과 float형인 avg이기 때문에

				System.out.printf("┌───────────────┐\n");
				System.out.printf("│ 국 어 성 적 출 력 │\n");
				System.out.printf("└───────────────┘\n");
				System.out.printf("국어1: %3d\n", kor1);
				System.out.printf("국어2: %3d\n", kor2);
				System.out.printf("국어3: %3d\n", kor3);
				System.out.printf("총점: %3d\n", total); // total이라는 변수안에 값이 출력이 된다. 1.변수의 값을 가져온다. 2. 그것을 문자열로 바꿔준다.
				System.out.printf("평균:%6.2f\n", avg); // 모든게 문자임
				// ConsoleOutputStream out = new ConsoleOutputStream(); //콘솔에 해당하는 출력스트림을 만들 수
				// 없다!
				// System이라는 클래스 파일안에 자바가 미리 만들었기 때문에 그에 맞게 해줘야한다.
//				System.out.write('A');
//				System.out.write('B');
//				System.out.flush();
//				System.out.print("Hello");
				// out.close(); 내가 만들지 않아서 닫으면 안됨

			}

			// ------------------------------------------------------

			// System.out.println("4번 검사전");
			else if (menu == 4) {
//		파일 저장 부분

				FileOutputStream fos = new FileOutputStream("res/data.csv"); // 버퍼 만들고 이름을 부여함!
				PrintStream out = new PrintStream(fos); //
				out.printf("%d,%d,%d\n", kor1, kor2, kor3);// ,로 구분한 값이라서 csv
//			fos.write('A'); // 입출력 사용하는 법
//			fos.write('B');
//			fos.flush(); // 지워도 출력이 되는 이유 메인함수가 끝나면 프로그램을 끝내면서 파일을 닫기 때문에 flush를 자동으로 해줌-> 이방식은 자리가 낭비될 수
//					 // 있기 때문에 
//			out.print("Hello File");
				fos.close(); // 안하게 되면 나중에 찾아갈게요 해놓고 안찾아가는 거랑 똑같음!! 하부 시스템의 리소스를 잠식하게 된다!
//			fos. 순수한 OutputStream 
				System.out.println("작업완료");
//				

			}

			// System.out.println("5번 검사전");
			else if (menu == 5) {

				// 계속하시겠습니까? (yes면1 아니면 2)

				System.out.println("진짜 나가시겠습니까? 나가실려면 0번 계속 하실려면 1번 ");
				answer = scan.nextInt();
//				if(answer == 0) //참일때만 실행(1회성 조건) while은 실행하고 검사하는것!()
//					break;

			} else
				System.out.println("잘못 입력하셨습니다.");

		}
//		-------------나가기 부분			
		{
			System.out.println("Bye"); // 조건에 뭐가 많으면 안좋음!
		}
	}

}
