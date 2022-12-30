package com.kio.service;

import java.util.Scanner;

public class KioService {
	Scanner sc= new Scanner(System.in);
	Menu menu[];
	public void run() {
 AdminService admin = new AdminService();
	
	
		bye:
		while(true) {
				
			switch (sc.nextInt()) {
			case 1:
				order();
				break;
			case 3:
				admin.start();
				break;
			case 9:
				System.out.println("키오스크를 정지합니다.");	
				break bye;
			default:
				System.out.println("잘못 입력 하셨습니다. 다시 눌러주세요");
				break;
			}
			
		}
		
	}
	private void order() {
		System.out.println("전체메뉴");
		for(int i =0; i<menu.length; i++) {
			System.out.print((i+1)+"번 메뉴");
			System.out.println(menu[i].toString());
		}	
		
		System.out.println("어서오세요 무엇을 주문하시겠습니까?");
		String orderMenu =sc.nextLine();
		System.out.println("뜨거운거는 1번 차가운거는 2번");
		String HOC =sc.nextLine();
		System.out.println("포장/매장");
		String inOrOut = sc.nextLine();
		System.out.println("결제 방식은 ");
		String  buy = sc.nextLine();
		System.out.println("결제가 완료되었습니다.");
		System.out.println("잠시 기다려주세요");
		GuestOrder  guestorder = new GuestOrder(); 
	}


}
