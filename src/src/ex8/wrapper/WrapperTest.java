package ex8.wrapper;

import ex7.Is_a.Exam;

public class WrapperTest {

	public static void main(String[] args) {
		// 최상위 추상 클래스
		//모든 클래스의 최상위 클래스는 object이다. 그럼 primitive 형식과의 관계는?
		//근데 왜 최상위클래스에 object를 쓸까?-> 모든 객체를 한번에 묶을 수 있는 역할을 지내고 있음!
		//->오브젝트가 부모라면 exam객체 안에 object가 있다! 즉 뭘 만들어도 object는 모든 것을 참조할 수 있다.
		//-> 배열을 object형으로 만들어도 가능!
		//-> 일반값은 참조가 아니라 공간이 하는 것인데  오브젝트는 모든걸 참조하지만 모든걸 담을 순 없다
		//자바세상 모든걸 참조할 수 있어도 일반형을 담을 수 없다..!
		//그래서 만들어진것이 Wrapper클래스!
		Object obj=3; //원래라면 오류가 나야함! 값이 들어가는 것이 아닌 Wapper(오토 박싱)클래스를 참조하면서 돌아감!
		Object obj1 = new Integer(3); //이런 방식임!
		Object d= 3; // d는 참조변수(이름)이기 때문에 담을 수 없지만. 우리를 위해 Wapper클래스를 참조하면서 돌아감!
		Exam exam= new Exam();
		
		String str = new String("hello");
		int x =(Integer)d;//값변수는 공간이기 때문에 같은 공간인 얘는 에러! 형식이 다르기 때문에 에러가 난거니깐 조심하자
		Object [] list = new String[5];
		list[0]= str;
		list[1]= exam;
		//모든 객체를 하나로 묶기 위한 Object!
		//근데 기본형을 묶어야하는데 
		
		
	}

}
