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
	
		}
			
	}

	public void shuffle() {
		Random rand = new Random();
		for(int i=0;i<students.length;i++) {
		int x = rand.nextInt(10);
		int y = rand.nextInt(10);
		Student temps = students[x];
		students[x] =students[y];
		students[y] =temps;
		}
	}

	public void print() {
		for(int i =0; i<students.length;i++) {
			//System.out.println(students[i].getId()+","+students[i].getName());
			students[i].print();

		}
		
	}

	public void sort() {
		for(int i =0; i<students.length-1; i++) {
			for(int j=0; j<students.length-1-i;j++) {
				if(students[j].getId()>students[j+1].getId()) {
					Student temps = students[j+1];
					students[j+1] =students[j];
					students[j] =temps;
				}
			}
		}
		
	}
	
}
