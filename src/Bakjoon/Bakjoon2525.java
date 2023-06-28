package Bakjoon;

import java.util.Scanner;

public class Bakjoon2525 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
 
		if(b+c < 60){
			System.out.printf("%d %d",a,b+c);
		}
		if(b+c >= 60 || c>=60){
			if(a==24){
				a = 0;
			}
			System.out.printf("%d %d",a+((b+c)/60),b+((b+c)%60));
			if(b+((b+c)%60)>=60) {
				
			}
		}
	}
}
