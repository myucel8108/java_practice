package test.day0726;

import java.util.Scanner;

public class Ex1Interface {
	DaoInter dao=new MemberDao();
	Scanner sc=new Scanner(System.in);
	
	public void process()
	{
		while(true)
		{
			System.out.println("1.추가  2.수정  3.삭제  4.조회  5.종료");
			int num=Integer.parseInt(sc.nextLine());
			switch(num)
			{
			case 1:
			{
				System.out.println("추가할 이름과 주소입력");
				String name=sc.nextLine();
				String addr=sc.nextLine();
				//dto생성
				MemberDto dto=new MemberDto(name, addr);
				//dao에 insert
				dao.insertMember(dto);
				break;
			}
			case 2:
			{
				System.out.println("수정할 이름과 새로운주소입력");
				String name=sc.nextLine();
				String addr=sc.nextLine();
				//dto생성
				MemberDto dto=new MemberDto(name, addr);
				//dao에 update
				dao.updateMember(dto);
				break;
			}
			case 3:
			{
				System.out.println("삭제할 이름 입력하기");
				String name=sc.nextLine();
				dao.deleteMember(name);
				break;
			}
			case 4:
				dao.selectAll();
				break;
			default:
				System.out.println("종료합니다");
				System.exit(0);
			}//switch
			
		}//while
	}//method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1Interface ex=new Ex1Interface();
		ex.process();
	}

}
