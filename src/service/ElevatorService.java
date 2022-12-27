package com.elevator.service;

import java.util.Scanner;

public class ElevatorService {
	//전역변수로 사용하는 것들
	Scanner sc = new Scanner(System.in);
	//엘레베이터 안에 탈 인원들을 배열로 선언
	private int[] elevator = { 0, 0, 0, 0 };
	//현재 층수 기본값=1
	private int nowFloor = 1;
	//엘레베이터의 올라가고 내려올 방향 선택
	boolean direction = false;
	//count라는 전역변수를 선언하고 각 초기화를 해주면서 사용
	private int count=0;

	public void run() {
		//byeElevator라는 것으로 4번을 눌렀을 때 탈출하기 위한 코드
		byeElevator: while (true) {
			//현재 층수에 도착하면 엘레베이터 인원이 가지고 있는 도착 층수와 같은지 계산하고 엘레베이터에서 내려가는 것을 표현하기 위한 for문
			count = 0;
			for (int i = 0; i < 4; i++) {
				if (elevator[i] == nowFloor) {
					count++;
					elevator[i] = 0;
				}
			}
			System.out.println("하차한 인원은" + count + "명입니다.");
			System.out.println("현재층수는" + nowFloor + "입니다.");
			System.out.println("----------------------------------------------");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.탑승  2.이동  3.탑승현황  4.종료");

			switch (sc.next()) {
			case "1":
				join(elevator);
				break;
			case "2":
				move();
				break;
			case "3":
				status();
				break;
			case "4":
				System.out.println("엘베운행을 종료합니다.");
				break byeElevator;
			default:
				System.out.println("잘못 입력하였습니다.");

			}

		}

	}

	private void move() {
		//3층과 1층에서 방향전환을 위한 if문
		if (nowFloor == 3 || nowFloor == 1)
			direction = !direction;
		//true와 false값으로 각 방향을 지정해준다.
		if (direction)
			nowFloor += 1;
		else
			nowFloor -= 1;
	}

	private void status() {
//		count = 0;
//		for (int i = 0; i < 4; i++) {
//			if (elevator[i] != 0) {
//				count++;
//			}
//		}
		//엘레베이터에 남아있는 사람들을 측정하기 위한 함수
		eleState(count);
		System.out.println(count);
		System.out.println("---- 탑승 현황 ----");
		System.out.println("현재 탑승 인원은 " + count + "명 입니다.");
		System.out.println("현재 층수는 " + nowFloor + "층 입니다.");

	}

	private void join(int[] elevator) {
		count = 0;
//		for (int i = 0; i < 4; i++) {
//			if (elevator[i] != 0) {
//				count++;
//			}
//		}
		eleState(count);
		//사람이 4명 다 차있으면
		if (count == 4)
			System.out.println("탑승할 공간이 없습니다. 다음에 이용해주세요");
		else {
			System.out.println("층 수를 선택해 주세요.");
			System.out.println("1.1층\t2.2층\t3.3층");
			int destination = sc.nextInt();
			//1~3층말고 다른 층수를 선택했을때
			if (destination > 3 || destination < 1)
				System.out.println("다시 입력해주세요.");
			//현재 목적지와 승객의 목적지가 같을 때
			else if (destination == nowFloor)
				System.out.println("목적지로 현재 층은 안됩니다.");
			else {
				System.out.println("입력하신 층은" + destination + " 층입니다.");
				System.out.println("원하시는 자리를 입력해주세요 왼쪽 위부터 1번 시계방향입니다.");
				//어느 위치에 사람들이 있는 확인하기 위한 for문
				for (int i = 0; i < 4; i++) {
					if (elevator[i] == 0)
						System.out.print("V\t");
					
					else
						System.out.print("X\t");
					if(i==1)
						System.out.println();
				}
				int position = sc.nextInt()-1;
				//배열의 값보다 크게 지정하면 나타나는 에러를 막기위한 if문
				if (position > 4 || position < 0)
					System.out.println("다시 입력해주세요");
				//지정한 자리에 사람이 있을경우
				else if (elevator[position] != 0)
					System.out.println("이미 승객이 있습니다. 다른 자리를 골라주세요");
				
			elevator[position] = destination; //1 2 3 
			}
		}

	}
	//엘레베이터에 남아있는 사람들을 측정하기 위한 함수
	private int eleState(int count) {
	
		for (int i = 0; i < 4; i++) {
			if (elevator[i] != 0) {
				this.count++;
			}
		}
		return this.count;
	}


}