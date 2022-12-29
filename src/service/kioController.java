package com.kio.service;

public class kioController {
	public static void main(String[] args) {
		//키오스크에 필요한 것
		//전체 메뉴 보이기,손님 주문 받기, 2결제 내용, 3.결제방식
		//관리자가 메뉴 수정 삭제 조회 등
		
		
		System.out.println("---- Welcome NewlecCafe----");
		KioService kioservice = new KioService();
		
		kioservice.run();
		
	}

}
