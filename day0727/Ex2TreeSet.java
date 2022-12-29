package test.day0727;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex2TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1=new TreeSet<>();
		set1.add("apple");
		set1.add("manggo");
		set1.add("banana");
		set1.add("apple");
		set1.add("orange");
		
		System.out.println(set1.size());//4
		System.out.println("**출력 **");
		for(String s:set1)
			System.out.println(s);//오름차순으로 출력
		
		System.out.println();
		System.out.println("** 로또 숫자 6개를 구하시오 **");
		Random r=new Random();
		Set<Integer> lotto=new TreeSet<>();
		while(true)
		{
			int n=r.nextInt(45)+1;
			lotto.add(n);
			if(lotto.size()==6)
				break;
		}
		
		for(int n:lotto)
			System.out.print(n+"  ");
		
	}

}






