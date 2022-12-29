package test.day0726;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex5Frame extends JFrame{
	//버튼 배열
	JButton []btn=new JButton[6];
	//버튼에 들어갈 라벨
	String []title= {"빨강","파랑","연핑크","진핑크","초록","오렌지"};
	//실제 적용될 색상
	Color []colors= {Color.red,Color.blue,Color.pink,Color.magenta,
			Color.green,Color.orange};
	
	public Ex5Frame() {
		// TODO Auto-generated constructor stub
		super("색변경");
		this.setBounds(400, 100, 400, 400);
		this.initDesign();
		//윈도우 종료 이벤트를 갖구있는메서드
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void initDesign()
	{
		//기본 레이아웃 없애기
		this.setLayout(null);
		//반복문을 이용하여 버튼 생성해서 붙이기
		int y=20;
		for(int i=0;i<btn.length;i++)
		{
			btn[i]=new JButton(title[i]);
			//버튼의 글자색이 해당색으로 나타나도록 해보자
			btn[i].setForeground(colors[i]);
			//위치및 사이즈 설정
			btn[i].setBounds(20, y, 80, 40);
			y+=45;
			//프레임에 추가
			this.add(btn[i]);
			final int idx=i;
			//버튼 이벤트
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					//해당 버튼 색상으로 윈도우 색상 변경
					Ex5Frame.this.getContentPane().setBackground(colors[idx]);
				}
			});
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex5Frame ex=new Ex5Frame();
	}

}


