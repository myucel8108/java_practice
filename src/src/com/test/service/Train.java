package com.test.service;

public class Train {
	private String[] subwayCompartments;

	public Train() {
		//왜 {}이걸로만은 안되는지 확인해보기
		subwayCompartments = new String [] {"0","0","0","0"};
		
	}
	
	public String[] getSubwayCompartments() {
		return subwayCompartments;
	}

	public void setSubwayCompartments(String[] subwayCompartments) {
		this.subwayCompartments = subwayCompartments;
	}
	

	
}
