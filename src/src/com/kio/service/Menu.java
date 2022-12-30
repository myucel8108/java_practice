package com.kio.service;

public class Menu {
		
	private int price;
	private String name;
	private String hotOrCold;
	
	public Menu() {
		this(0,"newlec","cold");
		
	}
	
	public Menu(int i, String string, String string2) {
		this.price =i;
		this.name= string;
		this.hotOrCold=string2;

	}



	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHotOrCold() {
		return hotOrCold;
	}
	public void setHotOrCold(String hotOrCold) {
		this.hotOrCold = hotOrCold;
	}



	@Override
	public String toString() {
		return "Menu [price=" + price + ", name=" + name + ", hotOrCold=" + hotOrCold + "]";
	}
	
	
	
	
}
