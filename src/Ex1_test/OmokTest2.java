package Ex1_test;

public class OmokTest2 {

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

			for(int y=1; y<=10; y++) {		

				for(int x=1; x<=10; x++) 	{
					//if else는 하나의 문장!	특정상황을 계속 만들어보자 바둑판 사이에 값을 갉아 먹었다..?
					//수정이 번거롭고 인덱스를 수정해야한다! 그래서 불편한 코드!
					//목적에 따라 달라지겠지만 일반적으로 좋은코드는 가독성을 넘어서 다음에 유지보수할때 수정이 용이한지!
					if(y==3&& x==3)
						System.out.printf("%c",'○');
					else if(x==10 && y==1)
						System.out.printf("%c",'┐');
					else if(x==10 && y==10)
						System.out.printf("%c",'┘');
					else if(x==1 && y==1)
						System.out.printf("%c",'┌');
					else if(x==1 && y==10)
						System.out.printf("%c",'└');
					else if(x==1)
						System.out.printf("%c",'├');
					else if(y==1)
						System.out.printf("%c",'┬');					
					else if(y==10)
						System.out.printf("%c",'┴');	
					else if(x==10)
						System.out.printf("%c",'┤');
					else
						System.out.printf("%c",'┼');
				}

					System.out.print("\n");				
			}		
		//------------------------------------------------
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
