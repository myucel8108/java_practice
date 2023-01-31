package ex7.Is_a;

import java.awt.Frame;

public class GameApp {
	public static void main(String[] args) {
		//캡슐을 이용할때는 .찍어서 원하는 서비스를 만드는 것
		Frame frame = new GameFrame();
		frame.setSize(500, 600);
		frame.setLocation(700, 300);
		//frame.setBounds(null);
		frame.setVisible(true); 
		//윈도우 구성과 출력방식

	}
}