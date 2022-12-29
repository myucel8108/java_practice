package test.day0726;

import java.util.List;
import java.util.Vector;

public class MemberDao implements DaoInter{
	//<>:제네릭스:List 에 MemberDto 만 담겠다
	List<MemberDto> list=new Vector<>();
	
	@Override
	public void insertMember(MemberDto dto) {
		// TODO Auto-generated method stub
		System.out.println(dto.getName()+"님을 리스트에 추가함!");
		list.add(dto);//리스트에 추가
	}

	@Override
	public void updateMember(MemberDto dto) {
		// TODO Auto-generated method stub
		//dto의 이름이 어디에 잇는지 인덱스 알아내기
		int idx=-1;
		for(int i=0;i<list.size();i++)
		{
			if(dto.getName().equals(list.get(i).getName())) {
				idx=i;
				break;
			}
		}
		if(idx==-1)
			System.out.println("수정할 이름의 멤버가 없어요!");
		else
		{
			list.set(idx, dto);//idx번지를 dto로 수정
			System.out.println("수정했습니다");
		}
	}

	@Override
	public void deleteMember(String name) {
		// TODO Auto-generated method stub
		int idx=-1;
		for(int i=0;i<list.size();i++)
		{
			//get(i)로 꺼낼경우 memberDto 타입이된다
			MemberDto dto=list.get(i);
			if(name.equals(dto.getName()))
			{
				idx=i;
				break;
			}
		}
		if(idx==-1)
			System.out.println(name+"님은 명단에 없습니다");
		else {
			System.out.println(name+"님의 정보를 삭제했습니다");
			list.remove(idx);//삭제
		}
	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		System.out.println("총 "+list.size()+"명");
		System.out.println("이름\t주소");
		for(MemberDto dto :list)
			System.out.println(dto.getName()+"\t"+dto.getAddr());
	}

}







