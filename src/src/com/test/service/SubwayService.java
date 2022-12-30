package com.test.service;

import java.util.Iterator;
import java.util.Scanner;

import javax.print.attribute.standard.Destination;

import Test.Student;

public class SubwayService {
	Scanner sc = new Scanner(System.in);

	String[] subwayStation = { "합정", "홍대입구", "신촌", "이대", "아현" };
	//객체생성
	Train train = new Train();
	Person person = new Person();
	//2차원배열로 각 생성한 객체들을 담을 그릇
	String[][] PeopleInSubway = new String[4][4];
	//현재 멈춘 정거장을 위한 int형식
	int stop = 0;
	// suubwayStation에 stop위치를 현재 정거장으로 바꿔주기
	String nowSubwayStation = subwayStation[stop];
	//열차에 방향
	boolean direction = false;

	public void run() {
		//PeopleInSubway 각 자리를 초기화해주기
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				PeopleInSubway[i][j] = person.getPersonState(j);
			}
		}
		//while문+스위치로 사용자가그 그만 두고 싶을 때 그만둘 수 있게 코드
		hi: while (true) {
			System.out.println("=================================");
			System.out.println("현재 역은" + nowSubwayStation + "입니다.");
			System.out.println("=================================");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1.탑승 2.상세보기 3.이동 9.종료");

			switch (sc.next()) {
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
				break hi;
			default:
				System.out.println("잘못 입력하였습니다.");

			}
		}

	}

	private void move() {
		int count = 0;
		if (nowSubwayStation == "아현" || nowSubwayStation == "합정") {
			direction = !direction;
		}
		if (direction == true) {
			stop += 1;
			nowSubwayStation = subwayStation[stop];
		} else
			stop -= 1;
		nowSubwayStation = subwayStation[stop];
		
		for (int i = 0; i < 4; i++) {
			for(int j=0; j<4;j++) {
				if(nowSubwayStation.equals(PeopleInSubway[i][j])) {
					PeopleInSubway[i][j] ="newlec";
					count++;
				}
			}
			
	
		}
		System.out.println(count+"명이 하차하였습니다.");	
	}

	private void status() {
		System.out.println("---열차 현황---");
		for (int i = 0; i < 4; i++) {
			System.out.print(i + 1 + "호차:");
			for (int j = 0; j < 4; j++) {
				System.out.print("[" + PeopleInSubway[i][j] + "]");
			}
			System.out.println();
		}
	}

	private void join() {
		System.out.println("---- 탑승가능 현황 ----");
		int count = 0;
		int j = 0;
		for (int i = 0; i < 4; i++) {
			System.out.print(i + 1 + "호차 : ");
			if (PeopleInSubway[i][j] != "newlec" && PeopleInSubway[i][j + 1] != "newlec"
					&& PeopleInSubway[i][j + 2] != "newlec" && PeopleInSubway[i][j + 3] != "newlec") {
				System.out.println("불가능");
				count++;
			} else
				System.out.println("가능");
		}
		if (count == 3) {
			System.out.println("탑승가능 열차가 없습니다.");
			return;
		}
		while (true) {
			System.out.println("원하시는 호차를 입력하세요");
			int sitdownCar = sc.nextInt() - 1;
			System.out.println("원하시는 자리 1~4를 입력해주세요");
			int sitdownPosition = sc.nextInt() - 1;
			if (PeopleInSubway[sitdownCar][sitdownPosition] != "newlec") {
				System.out.println("이미 다른 승객이 앉은 자리입니다 다시 골라주세요");

			} else {
				restart: while (true) {
					System.out.println("목적지를 선택해 주세요.");
					String destination = sc.next();
					if (destination.equals(nowSubwayStation)) {
						System.out.println("목적지로 현재역은 안됩니다. 다시 골라주세요");
						break restart;
					}

					else {
						PeopleInSubway[sitdownCar][sitdownPosition] = destination;

						break;
					}
				}
			}
			break;
		}
	}
}
