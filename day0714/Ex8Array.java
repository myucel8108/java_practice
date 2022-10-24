package test.day0714;

import java.util.Scanner;

public class Ex8Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"이영자","강호동","유재석","강소라",
				"이진","이효리","우영우","우지원","유민",
				"박나래"};
		String searchName;
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		
		//이름을 입력하면 "2번째에 있습니다"
		//없을경우 "없습니다"
		System.out.println("검색할 이름 입력");
		searchName=sc.nextLine();
		for(int i=0;i<names.length;i++)
		{
			if(searchName.equals(names[i]))
			{
				flag=true;
				System.out.println(i+1+"번째 있음!");
				break;
			}
		}
		
		if(!flag)
			System.out.println("없어요!");
	}

}










