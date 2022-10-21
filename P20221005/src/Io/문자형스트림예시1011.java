package Io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class 문자형스트림예시1011 {	
	public static void main(String[] args) {
		read();
	}
	
	public static void read()  {
		
		
		try {
			FileReader reader = new FileReader("src/co/edu/io/바이트스트림예시1011.java");
			
			while(true) {
				int bytes = reader.read();
				if(bytes == -1) {
					break;
				}
				System.out.printf((char)bytes + "");
			}
			
			reader.close();
			System.out.println("completed");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
		}
	}
	
	public static void write() {

		Scanner scn = new Scanner(System.in);

		//문자기반 스트림 생성. Reader/Writer
		try {
			FileWriter fw = new FileWriter("C:/Temp/addr.txt");
			
			while(true) {
				System.out.printf(">> ");
				String temp = scn.nextLine();
				if(temp.equals("quit"))
					break;
				
				fw.write(temp + "\n");
			}
			
			fw.close();
			scn.close();
			
		
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("completed");
	}
}
