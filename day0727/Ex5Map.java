package test.day0727;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map 인터페이스:Map인터페이스를 구현한 대표적인 클래스 HashMap
//key,value의 쌍으로 저장되는 구조
//이때 key 의 타입은 set타입이다. 즉,중복안되고 비순차적
public class Ex5Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map1=new HashMap<>();
		System.out.println(map1.size());
		map1.put("name", "김태희");
		map1.put("age", "23세");
		map1.put("addr", "강남구");
		map1.put("name", "이효리");
		
		System.out.println(map1.size());
		System.out.println("이름:"+map1.get("name"));//이효리
		System.out.println("나이:"+map1.get("age"));
		System.out.println("주소:"+map1.get("addr"));
		System.out.println("혈액형:"+map1.get("blood"));//해당key가 없을경우 null
		
		System.out.println("** 전체 key 와 value를 알고싶을때 **");
		//key값들을 먼저 얻는다
		Set<String> keys=map1.keySet();
		for(String k:keys)
		{
			String v=map1.get(k);//k 키에 들어있는 값을 v에 얻는다
			System.out.println(k+"=>"+v);
		}
	}

}
















