package test.day0805;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex0Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 날짜나 숫자를 원하는 패턴으로 변경후 문자열로 얻기
		//현재 날짜
		Date date=new Date();
		//문자열로 변환
		String s1=date.toString();
		System.out.println(s1);//Fri Aug 05 09:57:53 KST 2022
		
		//원하는 패턴대로 출력하고자 할경우
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy년MM월dd일 HH시mm분");
		System.out.println(sdf1.format(date));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd EEEE");
		System.out.println(sdf2.format(date));
		
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd a hh시");
		System.out.println(sdf3.format(date));
		
		//한줄로 줄여서 출력
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(date));
		
		//숫자
		//getCurrencyInstance 로 생성할경우 ￦2,666,777 이런식 출력
		//NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.JAPAN);
		NumberFormat nf1=NumberFormat.getCurrencyInstance();
		String n1=nf1.format(2666777);
		System.out.println(n1);
		
		NumberFormat nf2=NumberFormat.getInstance();
		String n2=nf2.format(2666777);
		System.out.println(n2);
		
		//한줄로 줄여서 출력
		int money=3456780;
		System.out.println(NumberFormat.getCurrencyInstance().format(money));
		System.out.println(NumberFormat.getInstance().format(money));
	}

}












