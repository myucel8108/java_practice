package test.day0727;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Ex6List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new Vector<>();//초기할당크기:10,초과되면 20개로 늘어난다
		Vector<String> list2=new Vector<>(5);//초기할당크기:5,초과되면 10개로 늘어난다
		List<String> list3=new Vector<>(3, 2);//초기할당크기:3,초과되면 2개씩 늘어난다
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println(list3.size());
		System.out.println("** 초기 할당 크기 **");
		System.out.println(((Vector)list1).capacity());
		System.out.println(list2.capacity());
		System.out.println(((Vector)list3).capacity());
		
		list1.add("사과");
		list1.add("오렌지");
		list1.add("사과");
		list1.add("딸기");
		list1.add("수박");
		
		String []s= {"red","green","pink","yellow","orange","gray"};
		for(String s1:s)
			list2.add(s1);
		
		list3=Arrays.asList("이영자","이순실","강호동","차헤련");
		System.out.println("데이타 추가후 할당크기 다시 확인하기");
		System.out.println(((Vector)list1).capacity());
		System.out.println(list2.capacity());
		
		System.out.println("출력 #1");
		for(String s1:list1)
			System.out.println(s1);
		
		System.out.println("출력 #2");
		for(int i=0;i<list2.size();i++)
		{
			String s2=list2.get(i);
			System.out.println(s2);
		}
		System.out.println("출력 #3");
		Iterator<String> iter=list3.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
	}

}










