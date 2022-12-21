package Ex1_test;

public class IfTest {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {			
//			if(0==(i+1)%5)
//				System.out.printf("%c",'○');
			if(i==4)
				System.out.printf("%c",'○');						
			else if(1==i%2)
				System.out.printf("%c",'☆');
			else
				System.out.printf("%c",'┼');
		}	
	}

}
//몇번 몇번째마다(수의 패턴)
