package beak_01;
import java.util.*;

public class Beakjoon1010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int testCase = scan.nextInt();
		int[] cnt = new int[testCase]; 
		
		
		
		
		for (int i = 0; i < testCase; i++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			int t = 0;
			int[] result = new int[n];
			
			result[0] = 1;
			
			for (int j = 1; j <= m - n; j++) {
				for (int k = m - j; k > 0; k--) {
					 result[t] *= k;
				}
				cnt[i] += result[t];
				if (t == m - n) {
					break;
				}
				else t++;
			}
			
		}
		
		for (int i = 0; i < testCase; i++) {
			System.out.println(cnt[i]);
		}
		
	}

}
