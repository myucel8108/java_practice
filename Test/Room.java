package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.Scanner;

public class Room {
	private Student[]  students; // 
	

	//롬에서의 생성자 -> 나 이거 10 말고 다른 방식 찾아보고 픔
	public Room() {
		
		students = new Student[10]; //배열 크기 초기화
		
	}

	
	public void load(String string) throws FileNotFoundException {
	FileInputStream fis = new FileInputStream(string);
		Scanner scan = new Scanner(fis);
		int count = 0;
		String stemp= scan.nextLine();
		while(scan.hasNext()) {
			
			students[count]= new Student();		
			String [] temp= scan.nextLine().split(",");	
			students[count].setId(Integer.parseInt(temp[0]));
			students[count].setName(temp[1]);
			count++;
			//index로 바꿔주자! 변수명에 이름을 생각하면서 하자
			//index로 썼을 경우에는 for문으로!
			//선생님 피드백!!
	
		}
			
	}

	public void shuffle() {
		Random rand = new Random();
		for(int i=0;i<students.length;i++) {
			//students.length는 배열의 크기를 말하는거지 값의 수를 말하는 것이 아니
			//기 때문에! 값의 길이와 공간의 길리가 달라진다!
			//
		int x = rand.nextInt(10);
		int y = rand.nextInt(10);
		Student temp = students[x];
		students[x] =students[y];
		students[y] =temp;
		}
	}

	public void print() {
		for(int i =0; i<students.length;i++) {
			//System.out.println(students[i].getId()+","+students[i].getName());
			students[i].print();

		}
		

		
	}

	//지역변수와 같은걸로 바꿔서 하면 편하다!
	public void sort() {
		for(int i =0; i<students.length-1; i++) {
			for(int j=0; j<students.length-1-i;j++) {
				int curId=students[j].getId();
				int nextId=students[j+1].getId();
				//변수를 쓰는건 메모리를 더 먹지만 이해하기 쉽게 하기 위해서!
				if(curId>nextId) {
					Student temps = students[j+1];
					students[j+1] =students[j];
					students[j] =temps;
				}

			}
		}
		
	}
	
}
