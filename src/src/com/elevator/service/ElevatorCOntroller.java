package com.elevator.service;

public class ElevatorCOntroller {
	public static void main(String[] args) {
		// 엘리베이터는 4명이 탑승이 가능하며, 총 3개 층으로 이루어져있음.
		// 탑승객은 목표 층을 입력하여 해당 층이 되면, 자동으로 내리게 구현.
		// 엘리베이터는 무조건 올라갔다가 내려가는 형태로 이동.

		ElevatorService es = new ElevatorService();
		
		System.out.println("---- Welcome Elevator ----");
		
		es.run();
	}
}
