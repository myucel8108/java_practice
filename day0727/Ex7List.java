package test.day0727;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class Ex7List {
	List<Person> list=new Vector<>();
	Scanner sc=new Scanner(System.in);
	//저장할 파일경로
	static final String FILENAME="D:\\java0711\\person.txt";
	
	public Ex7List() {
		// TODO Auto-generated constructor stub
		this.fileRead();//처음 실행시 파일읽어오기
	}
	
	//데이타 추가하는 메서드
	public void addPerson()
	{
		System.out.println("person 데이타를 추가합니다");
		System.out.println("추가할 이름은?");
		String name=sc.nextLine();
		//문제:같은이름이 있을경우 "이미 존재하는 이름입니다" 출력후 메서드 종료(return)
		int idx=this.getSearchName(name);
		if(idx>=0) {
			System.out.println("이미 존재하는 이름입니다");
			return;
		}
		
		System.out.println("추가할 나이는?");
		String age=sc.nextLine();
		System.out.println("추가할 주소는?");
		String addr=sc.nextLine();
		
		//Person 생성
		//Person p=new Person(name, age, addr);//방법1
		Person p=new Person();//방법2
		p.setName(name);
		p.setAddr(addr);
		p.setAge(age);
		
		//list에 추가
		list.add(p);
		
	}
	
	//전체 데이타 출력하는 메서드
	public void writePerson()
	{
		System.out.println("person 전체 데이타를 출력합니다");
		System.out.println("총 "+list.size()+"명");
		System.out.println();
		System.out.println("번호       이름   나이   주소");
		for(int i=0;i<list.size();i++)
		{
			//i번째 person
			Person p=list.get(i);
			System.out.println(i+1+"\t"+p.getName()+"\t"+p.getAge()+"\t"+p.getAddr());
		}
	}
	
	//메뉴입력후 번호 반환하는 메서드
	public int getMenu()
	{
		System.out.println("** 메뉴 **");
		System.out.println("1.추가");
		System.out.println("2.전체출력");
		System.out.println("3.검색");
		System.out.println("4.삭제");
		System.out.println("5.저장후 종료");
		System.out.println("------------");
		int n=0;
		try {
			n=Integer.parseInt(sc.nextLine());	
		}catch(NumberFormatException e)
		{
			System.out.println("** 문자입력:전체출력합니다 **");
			n=2;
		}
		
		return n;
	}
	
	
	//이름을 입력하면 해당 데이타가 있는 곳의 인덱스반환
	//만약 없다면 -1 반환
	public int getSearchName(String name)
	{
		int idx=-1;
		for(int i=0;i<list.size();i++)
		{
			//i번째 데이타 얻기
			Person p=list.get(i);
			//이름 비교해서 같으면 idx에 i값 저장후 빠져나가기
			if(p.getName().equals(name)) {
				idx=i;
				break;
			}
			
		}
		return idx;
	}
	
	//이름입력하면 해당 데이타만 나오게 하기
	public void serchPerson()
	{
		System.out.println("이름으로 검색하기");
		System.out.println("조회할 이름은?");
		String name=sc.nextLine();
		//해당 name 이 있는곳의 인덱스 얻기
		int idx=this.getSearchName(name);
		if(idx==-1) {
			System.out.println(name+"님은 명단에 없습니다");
		}else {
			//해당 인덱스 번지에서 데이타를 꺼낸다
			Person p=list.get(idx);
			System.out.println("** 조회 결과 **");
			System.out.println("이 름 : "+p.getName());
			System.out.println("나 이 : "+p.getAge());
			System.out.println("주 소 : "+p.getAddr());
		}
	}
	
	//이름 입력하면 해당 데이타 찾아서 지우기
	public void deletePerson()
	{
		System.out.println("이름으로 찾아서 삭제하기");
		System.out.println("삭제할 이름은?");
		String name=sc.nextLine();
		//해당 name 이 있는곳의 인덱스 얻기
		int idx=this.getSearchName(name);
		if(idx==-1) {
			System.out.println(name+"님은 명단에 없습니다");
		}else {
			list.remove(idx);
			System.out.println("삭제되었습니다");
		}
	}
	
	//처음 시작시 파일에서 읽어서 list 에 담기
	public void fileRead()
	{
		//System.out.println("파일을 읽어옵니다");
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			//한줄 단위로 읽어서 , 로 분리후 person에 넣은후
			//list 에 추가
			while(true)
			{
				String line=br.readLine();
				//더이상 읽을데이타가 없으면 종료
				if(line==null)
					break;
				//,로 분리된 데이타를 배열로 읽어오기
				//String []data=line.split(",");			
				
				//Person객체 생성
//				Person p=new Person();
//				p.setName(data[0]);
//				p.setAge(data[1]);
//				p.setAddr(data[2]);
				
				//,로 분리하는 방법 #2
				Person p=new Person();
				StringTokenizer st=new StringTokenizer(line, ",");
				p.setName(st.nextToken());
				p.setAge(st.nextToken());
				p.setAddr(st.nextToken());
				
				//list에 추가
				list.add(p);				
			}
			System.out.println("총 "+list.size()+"명의 데이타 읽어옴!!");
			
		} catch (FileNotFoundException e) {
			System.out.println("저장된 데이타가 없습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException|NullPointerException e2) {
				System.out.println("파일읽기 오류 발생:"+e2.getMessage());
			}
		}
	}
	
	//종료시 전체 데이타 파일에 저장하는 메서드
	public void fileWrite()
	{
		System.out.println("list를 저장후 종료합니다");
		FileWriter fw=null;
		try {
			fw=new FileWriter(FILENAME);
			//이름,나이,주소  =>이런 형태로 저장			
			for(Person p:list)
			{
				String s=p.getName()+","+p.getAge()+","+p.getAddr()+"\n";
				fw.write(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex7List ex=new Ex7List();
		while(true)
		{
			switch(ex.getMenu())
			{
			case 1://추가
				ex.addPerson(); break;
			case 2://전체출력
				ex.writePerson();break;
			case 3://검색
				ex.serchPerson();break;
			case 4://삭제
				ex.deletePerson();break;
			default:
				ex.fileWrite();
				System.exit(0);
			}
			System.out.println();
		}
	}

}







