package test.day0726;

public class MemberDto {
	private String name;
	private String addr;
	
	public MemberDto() {
		super();
	}

	public MemberDto(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
