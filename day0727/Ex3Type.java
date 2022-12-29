package test.day0727;

class GenericType<T>{
	T[] v;
	
	public void set(T[] n)
	{
		v=n;
	}
	
	public void print()
	{
		for(T s:v)
			System.out.print(s+"  ");
		System.out.println();
	}
}

public class Ex3Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []sarr= {"사과","오렌지","딸기"};
		//T 는 모든타입을 제네릭으로 설정할수 있다
		GenericType<String> t1=new GenericType<>();
		t1.set(sarr);
		t1.print();
		
		Integer []narr= {90,89,100,78};
		GenericType<Integer> t2=new GenericType<>();
		t2.set(narr);
		t2.print();	
	}

}










