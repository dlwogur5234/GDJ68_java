package Bakjoon;

import java.util.Scanner;

public class Main2 {
//น้มุ 10950น๘ 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t+1; i++){
			for(int j=0; j<t+1; j++) {
				System.out.println(i+j);
			}
		}
				
	}

}
