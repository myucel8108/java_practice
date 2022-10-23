package test.day0713;

public class Ex12PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1~100 사이의 소수 구하기");
		//소수란?1을 제외하고 자기자신만을 약수로 가진수
		//다중 for문
		Exit:
		for(int i=2;i<=100;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					if(i==j)
						System.out.printf("%3d",i);
					else
						continue Exit;//i++로 이동
				}
			}
		
		}
		
	}

}
