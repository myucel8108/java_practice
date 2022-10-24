package test.day0714;

public class Ex12ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"손미나","황신혜","강남길","나훈아","나훈자"};
		System.out.println("이름의 오름차순으로 정렬");
		for(int i=0;i<names.length-1;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].compareTo(names[j])>0)//i가 클경우 양수값 나옴
				{
					//거꾸로 정렬되어있을경우 두값을 바꾼다
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		
		//출력
		for(String s:names)
			System.out.println(s);
	}

}
