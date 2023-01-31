package Ex1_test;

public class OmokTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 내가 생각했던 방식
//		for(int i=0;i<10;i++) {					
//			for(int j=0; j<10; j++) {		
//				
//				if(i==2&&j==2)
//					System.out.printf("%c",'○');
//				else
//					System.out.printf("%c",'┼');
//			}
//			System.out.print("\n");
//		}
//		---------------------------------------------------
		// 좌표시스템이니 x와 y를 사용해도 좋다! 그리고 오목은 좌표이니 1부터 시작하는게 어떨까..?
			System.out.printf("%c", '┌');
		for(int i=1; i<=10 ; i++) {
			System.out.printf("%c", '┬');
			
		}
		System.out.printf("%c",'┐');
		System.out.println("");
			for(int y=1; y<=10; y++) {		
				System.out.printf("%c",'├');
				for(int x=1; x<=10; x++) 	{
					//if else는 하나의 문장!					
					if(y==3&& x==3)
						System.out.printf("%c",'○');
					else
						System.out.printf("%c",'┼');
				}
					System.out.printf("%c",'┤');
					System.out.print("\n");				
			}		
				System.out.printf("%c", '└');
			for(int i=1; i<=10 ; i++) {
				System.out.printf("%c", '┴');
				
			}
			System.out.printf("%c",'┘');
		
//----------------------------------------------------
//		
//		for(int i=0; i<100; i++) {
//				
//			if(i==22)
//				System.out.printf("%c",'○');
//			
//			else
//				System.out.printf("%c",'┼');
//			if(i%10==(10-1))
//				System.out.print("\n");
//			
//		}
	}

}
