package test.day0713;

public class Ex10For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)//행방향
		{
			//공백,4,3,2,1,0
			for(int sp=i;sp<5;sp++)
				System.out.print(' ');

			//*, 1,3,5,7,9
			for(int j=1;j<=2*i-1;j++)//열방향
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
					System.out.print(i);
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}









