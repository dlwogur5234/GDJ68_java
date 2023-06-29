package Bakjoon;

import java.util.Scanner;

class Bakjoon2525  {
	public static void main(String[]args) {
		 Scanner in = new Scanner(System.in);
		 
	        int A = in.nextInt();
	        int B = in.nextInt();
	 
	        int C = in.nextInt();
	 
	        int min = 60 * A + B;   // ½Ã -> ºĞ
	        min = min + C;
	 
	        int hour = (min / 60) % 24;
	        int minute = min % 60;
	 
	        System.out.println(hour + " " + minute);
	 
	    }
	}
