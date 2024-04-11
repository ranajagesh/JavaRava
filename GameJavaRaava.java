package com.java.jdbc.RandomGame;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameJavaRaava {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List<Integer> sgn = new ArrayList<Integer>();
		List<Integer> ugn = new ArrayList<Integer>();
		int score = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Id");
		int id = sc.nextInt();
		
		System.out.println("Enter a Name");
		String name = sc.next();
		
		Timestamp time = new Timestamp(System.currentTimeMillis()); 
		
		for(int i=0;i<3;i++) {
			Random rn = new Random();
			int num = rn.nextInt(10);
			
			System.out.println("Guess the number");
			int uen = sc.nextInt();
			
			if(num==uen) {
				score = score+10;
			} 
			sgn.add(num);
			ugn.add(uen);
		}
//		System.out.println(sgn);
//		System.out.println(ugn);
//		System.out.println(score);
		
		SaveGameInfo.saveData(id,name,""+ sgn,""+ ugn,score,time);
	}

}
