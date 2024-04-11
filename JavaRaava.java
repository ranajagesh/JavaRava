package com.jaggu.javaraava;

import java.util.Scanner;

public class JavaRaava {

	static int grade = 0;
	public static void main(String[] args) {
		
//		int n = (int) (Math.random()*9+1);
//		System.out.println(n);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name  :");
		String str = sc.nextLine();
		System.out.println("Hi "+str+" You have only 3 chances to Genrate Random Nummbers : ");
		
		System.out.println("Guess Random Number Between 0 to 9 : Enter 1st Number");
		
		int chance = 3;
		int count = chance;
		
		for(int i=1;i<=chance;i++) {
			System.out.println("Enter Number:");
			int num=sc.nextInt();
			int n=(int) (Math.random()*9+1);
			//System.out.println(n);
			if(num==n) {
				System.out.println(" Number is Matched ! You got "+ --count +" more chance to enter a number :");
				grade+=10;
				//System.out.println(str+"You got "+grade + " Grades");
				
			} else {
				System.out.println(" Number is Not  Matched ! You got "+--count+" more chance to enter a number :");
			}			
			
		}
		System.out.println(str+" Your Grade is = "+grade);
		
	}

}
