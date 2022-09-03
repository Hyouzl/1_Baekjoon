package practice;

import java.util.*;

public class Beakjoon1009 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		int arr[] = new int[testCase];
		
		
		for (int i = 0; i < testCase; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			int result = 1;
			for (int j = 0; j < b; j++) {
				result *= a;
			}
			
			arr[i] = result % 10;
			if (arr[i] == 0) {
				arr[i] = 10;
			}
		}
		
		for (int i = 0; i < testCase; i++) {
			
			System.out.println(arr[i]);
		}
		

	}

}
