package com.test.service;

public class SubwayController {

	public static void main(String[] args) {
			//게임 조건
				// 지하철 만들기
				// 역은 총 5개로 순환열차이다.(합정, 홍대입구, 신촌, 이대, 아현)
				// 차량은 총 4량, 각 차량당 탑승가능인원 4명
				// 탑승 시 목적지 지정. 목적지도착 시 자동하차
				// 이동시 1개역씩 이동
		SubwayService ss = new SubwayService();
		
		System.out.println("---- Welcome Subway ----");
		
		ss.run();

	}

}
