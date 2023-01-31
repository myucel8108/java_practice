package Test;

public class Student {
	
	private int id;
	private String name;
	
	
	//student에 생성자
	public Student() {
		id=0; 
		name= "newlec";
		//항상 기본값~!
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println(id+","+name);
		
	}

}
