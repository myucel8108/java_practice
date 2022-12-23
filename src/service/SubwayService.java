package com.test.service;

import java.util.Iterator;
import java.util.Scanner;

import Test.Student;

public class SubwayService {
	Scanner sc = new Scanner(System.in);
	Train subusers[] = new Train[5];
	Train temp = new Train();
	int subnum = 0;

	public void run() {
		int index = 0;
		while (true) {
			String[] a = temp.getSubway().split(",");

			subusers[index] = new Train(a, index);

			if (index < 4)
				index++;
			else
				break;

		}
		while (true) {
			System.out.println("=================================");
			System.out.println("현재 역은" + subusers[subnum].getSubway() + "입니다.");
			System.out.println("=================================");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.탑승 2.상세보기 3.이동 9.종료");

			switch (sc.nextLine()) {
			case "1":
				join();
				break;
			case "2":
				status();
				break;
			case "3":
				move();
				break;
			case "9":
				System.out.println("열차운행을 종료합니다.");
				break;
			default:
				System.out.println("잘못입력하였습니다.");
			}
		}

	}

	private void move() {

	}

	private void status() {
		System.out.println();

	}

	private void join() {
		int i=0;
		int j=0;
		System.out.println("---- 탑승가능 현황 ----");
		
		if (subusers[i].getDoor_num(i, j)  ==4&&subusers[i+1].getDoor_num(i+1, j+1)  ==4&&
				subusers[i+2].getDoor_num(i+2, j+2)  ==4 &&subusers[i+3].getDoor_num(i+3, j+3)  ==4){
			System.out.println("탑승가능 열차가 없습니다.");
			return;
		}
			
		for (int x = 0; i < 4; i++) {
			for(int y=0; y<4; y++) {
				System.out.print(x + 1 + "호차 ");
				if (subusers[x].getDoor_num(x, y) < 4)
					System.out.println("가능");
				else
					System.out.println("불가능");
			}
		}
		System.out.println("몇 호차를 고르시겠습니까?");
		
		int insert = sc.nextInt() - 1;
		
		if (insert > 0 || insert < 4) {
			System.out.println("다시 입력해주세요");
		}
		else if(subusers[i].getDoor_num(i, j)>=4) {
			System.out.println("탑승이 불가능한 열차 칸 입니다.");
		}
		else
			System.out.println("탑승완료");
		
	
	}

}
