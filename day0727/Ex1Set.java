package test.day0727;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set인터페이스: Set을 구현하는 클래스 HashSet,TreeSet
//Set의 특징:중복값이 들어갈수 없다
//HashSet:비순차적
//TreeSet:오름차순
public class Ex1Set {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set1=new HashSet<>();
		System.out.println("크기:"+set1.size());//0
		set1.add("apple");
		set1.add("orange");
		set1.add("apple");
		set1.add("orange");
		set1.add("kiwi");
		
		System.out.println("크기:"+set1.size());//3,이유:중복값은 1번만 들어간다
		System.out.println("**출력 1 **");
		for(String s:set1)
			System.out.println(s);//비순차적으로 출력
		System.out.println("**출력 2**");
		Iterator<String> iter=set1.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		
	}

}









