package ex3.func;

public class BasicFunction {

	static int  f1(int x) { //함수를 만드는 법 함수()안에서만 살 수 있는 얘->매개변수
									
		
		return 3+x*23;
		
	}

	static int add(int  a, int b) { //Call By Value 방식
		return a+b;
	}
	//값을 반환하지 않는 함수 "void"
	static void printsum(int x) {
		System.out.println(x);
		
	}
	
	public static void main(String[] args) {  //메인 함수이기때문에 함수를 여기서 만들면 안됨

		int result = 3+4*23-23+345-23;
		
		System.out.printf("result is %d \n",result);
		
		result = f1(8)-23+345-23+add(10,10); //매개변수를 만들면 무조건 값을 줘야하고 값의 갯수와 자료형이 같아야만 한다!
		
		System.out.printf("result is %d \n",result);
		
		printsum(add(4,5));
		
	}

}
