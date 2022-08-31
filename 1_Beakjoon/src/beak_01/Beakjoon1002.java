package beak_01;

import java.util.Random;
import java.util.Scanner;

public class Beakjoon1002 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int testCase = scan.nextInt();
		
		int x1,y1;
		int x2,y2;
		int r1,r2;
		int x3,y3;
		int cnt = 0;
		
		for (int i = 0; i < testCase; i++) {
		
			x1 = ran.nextInt(20001) - 10000;
			y1 = ran.nextInt(20001) - 10000;
			x2 = ran.nextInt(20001) - 10000;
			y2 = ran.nextInt(20001) - 10000;
			
			r1 = ran.nextInt(10000) + 1;
			r2 = ran.nextInt(10000) + 1;
			
			System.out.println(x1 + " " + y1 + " " + r1 + " " + x2 + " " + y2 + " " + r2);
			
			int x = x2- x1;
			int y = y2 - y1;
			double len = Math.sqrt(Math.pow(x, 2)) + Math.sqrt(Math.pow(y, 2));
			
			if (x1 == x2 && y1 == y2) {
				cnt = -1;
			}
			else if (r1 + r2 < len) {
				cnt = 0;
			}
			else if (r1 + r2 == len || r2 - r1 == len || r1 - r2 == len) {
				cnt = 1;
			}
			else cnt = 2;
	
			
			System.out.println(cnt);
			
		}

	}

}
