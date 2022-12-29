package test.day0726;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ex4Frame extends JFrame{

	public Ex4Frame() {
		// TODO Auto-generated constructor stub
		super("Hello");
		this.setLocation(500, 100);//시작좌표
		this.setSize(300, 300);//프레임의 너비,높이
		//메서드 호출
		this.initDesign();
		this.setVisible(true);		
		
		//종료 이벤트
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(Ex4Frame.this,"종료합니다");
				System.exit(0);
				super.windowClosing(e);
			}
		});
	}
	
	
	private void initDesign() {
		// TODO Auto-generated method stub
		//기본 레이아웃 설정 없애기
		this.setLayout(null);
		JButton btn1=new JButton("빨강색");
		btn1.setBounds(20, 20, 80, 30);//x,y,width,height
		//프레임에 추가
		this.add(btn1);
		//버튼이벤트-익명내부클래스 형태로 이벤트 설정
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Ex4Frame.this.getContentPane().setBackground(Color.red);
			}
		});
		
		JButton btn2=new JButton("노랑색");
		btn2.setBounds(110, 20, 80, 30);//x,y,width,height
		//프레임에 추가
		this.add(btn2);
		//버튼이벤트-익명내부클래스 형태로 이벤트 설정
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Ex4Frame.this.getContentPane().setBackground(Color.yellow);
			}
		});
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4Frame ex=new Ex4Frame();//생성
	}

}





