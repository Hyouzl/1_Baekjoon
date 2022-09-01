package beak_01;
import java.util.*;

public class Beakjoon1010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	
		int testCase = scan.nextInt();
		int[] cnt = new int[testCase]; 
		for (int i = 0; i < testCase; i++) {
			System.out.println("testCase[" + i + "]");
			System.out.print("n 입력 : ");
			int n = scan.nextInt();
			System.out.print("m 입력 : ");
			int m = scan.nextInt();
			
			for (int j = 0; j < m - n; j++) {
				
			
		}
		
		
		}
		
		
		/*
		
		//   0 <= n < m <= 30
		for (int i = 0; i < testCase; i++) {
			System.out.println("testCase[" + i + "]");
			System.out.print("n 입력 : ");
			int n = scan.nextInt();
			System.out.print("m 입력 : ");
			int m = scan.nextInt();
			int[] comb = new int[m-n];
			
			if (m - n == 0) {
				cnt[i] = 1;
			}
			else {
				for (int j = 0; j < m - n; j++) {
					m--;
					int pick = m;
					if (n - 1 == 0) {
						cnt[i] = pick;
					}
					else {
						for (int k = 0; k < n - 1; k++) {
							comb[j] *= pick;
							pick--;
						}
						cnt[i] += comb[j];
					}
				}
			}
			
		}
		*/
		
		for (int i = 0; i < testCase; i++) {
			System.out.println(cnt[i]);
		}
	
		scan.close();
	}


}
