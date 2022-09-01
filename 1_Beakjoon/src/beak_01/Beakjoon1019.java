package beak_01;
import java.util.*;

public class Beakjoon1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		int n = scan.nextInt();
		int[] cnt = new int[10];
		
			for (int j = n ; j > 0; j--) {
				if (j < 10) {
					cnt[j % 10]++;
				}
				else {
					int num = j;
					while (num != 0) {
							cnt[num % 10]++;
							num /= 10;
						}
					if (num != 0) {
						cnt[num]++;
					}
				}
			}
		
		
		for (int i = 0; i < 10; i++) {
			System.out.print(cnt[i] + " ");
		}
	}
}

