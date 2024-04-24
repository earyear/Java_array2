package ex_240424;

import java.util.Scanner;

public class lhj0000 {

	public static void main(String[] args) {
		Scanner lunch = new Scanner(System.in);
		String lunchString[] = new String[5];
		System.out.println("음식을넣으세요");
		
		for (int i = 0; i < lunchString.length; i++) {
			lunchString[i]  = lunch.next();
			
		}
		for (int i = 0; i < lunchString.length; i++) {
			System.out.println(lunchString[i]);
	
			
		}
		System.out.println("이제 그만");
		
		lunch.close();
	}

}

