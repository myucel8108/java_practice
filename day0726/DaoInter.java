package test.day0726;

public interface DaoInter {
	public void insertMember(MemberDto dto);
	public void updateMember(MemberDto dto);
	public void deleteMember(String name);
	public void selectAll();
}
