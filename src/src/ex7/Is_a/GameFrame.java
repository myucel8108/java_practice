package ex7.Is_a;

import java.awt.Frame;
import java.awt.Graphics;

public class GameFrame extends Frame{
	
	@Override
	public void paint(Graphics g) { //파라미트 전달
		g.drawLine(20,20,200,200);

	}
	

}