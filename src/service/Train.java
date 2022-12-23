package com.test.service;

public class Train {

	private int get_off;
	private int get_on;
	//생성자를 통해서 데이터 구조체를 넣는 방법
	private int[][] door_num = new  int [4][4];
	
	private String subway;

	public Train() {

		subway="합정,홍대입구,신촌,이대,아현";
		
	}
	public Train(String [] str, int i) {
		get_off =0;
		get_on=0;
		subway=str[i];
	}
	
	public int getGet_off() {
		return get_off;
	}


	public void setGet_off(int get_off) {
		this.get_off = get_off;
	}


	public int getGet_on(int i,int j) {
		return get_on;
	}


	public void setGet_on(int get_on) {
		this.get_on = get_on;
	}


	public void setDoor_num(int[][] door_num) {
		this.door_num = door_num;
	}

	
	
	public int getDoor_num(int i , int j) {
		return door_num[i][j];
	}


	public void setDoor_num (int i,int j) {
		this.door_num[i][j] += 1;
	}


	public String getSubway() {
		return subway;
	}


	public void setSubway(String subway) {
		this.subway = subway;
	}

}
