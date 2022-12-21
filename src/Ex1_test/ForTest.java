package Ex1_test;

public class ForTest {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			
//			if(i == 2) 
//				continue; //중괄호 최소로 하는법! ☆1,☆2,☆4,☆5
//
//			if(i>2)
//				continue; //☆1,☆2,☆3,까지만 나오게 하는 방식!
//			if(i==3)
//				break; //☆1,☆2,☆3,까지만 나오게 하는 방식2!
			if(i<2)
				continue;
			System.out.print("☆");			
			System.out.printf("%d", i + 1);				
			if (i < 4) //if(i != 4)
				System.out.print(",");
//			if(i==2)
//				break; //☆1,☆2,☆3,까지만 나오게 하는 방식3! 가장 좋은 방식인 것 같다.
//			
		}
	}

}