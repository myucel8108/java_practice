package test.day0713;

public class Ex11Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int dan=2;dan<=5;dan++)
			System.out.print(dan+"단\t");
		System.out.println("\n");
		for(int i=1;i<=9;i++)
		{
			for(int dan=2;dan<=5;dan++)
			{
				System.out.print(dan+"x"+i+"="+dan*i+"\t");
			}
			System.out.println();
		}
	}

}
