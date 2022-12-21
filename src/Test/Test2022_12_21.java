package Test;

import java.io.FileNotFoundException;

public class Test2022_12_21 {

	public static void main(String[] args) throws FileNotFoundException {
		Room room = new Room();
		room.load("res/students.csv");
		room.shuffle();
		room.print();
		System.out.println("------------------");
		room.sort();
		room.print();
		
	}
}


