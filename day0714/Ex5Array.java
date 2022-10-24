package test.day0714;

public class Ex5Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {23,1,267,89,45,34,77,99,120,110};
		int max=data[0];//첫번째값을 max에 넣은후 1번지부터 비교
		int min=data[0];
		System.out.println("**배열에서 최대값,최소값 구하기 **");
		for(int i=1;i<data.length;i++)
		{
			if(max<data[i])
				max=data[i];
			if(min>data[i])
				min=data[i];
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}

}
