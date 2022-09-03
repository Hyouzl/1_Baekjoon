package practice;
import java.util.*;

public class Beakjjon1037 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cnt = scan.nextInt();
		int[] num = new int[cnt];
		int[] a = {2, 3, 5, 7};
		int[][] aCnt = new int[cnt][4];
		for (int i = 0; i < cnt; i++) {
			num[i] = scan.nextInt();
		}

		for (int k = 0; k < cnt; k++) {
			for (int i = 0; i < 4; i++) {
					int kNum = num[k];
					if (kNum % a[i] == 0) {
						while (kNum != 1) { 
							aCnt[k][i]++;
							kNum /= a[i]; 
						}
					}
					else continue;
				}
		}
	
		int answer = 1;
		int check = 0;
		int[] numIndex = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			for (int k = 0; k < 4; k++) {
				if (aCnt[i][k] != 0) {
					check++;
					numIndex[i] = k;
				}
			}
		}
		
		int lastCheck = 0;
		if (check == cnt) {
			for (int i = 0; i < cnt - 1; i++) {
				if (numIndex[i] == numIndex[i+1]) {
					lastCheck++;
				}
			}
			if (lastCheck == cnt - 1) {
				for (int i = 0; i < cnt; i++) {
					for (int k = 0; k < 4; k++) {
						for (int t = 0; t < aCnt[i][k]; t++) {
							answer *= a[i];
						}
					}
				}
			}
		}
		
		
		
		else  {
		int[] max = new int[4];
		for (int i = 0; i < cnt; i++) {
			for (int k = 0; k < 4; k++) {
				if (max[k] < aCnt[i][k]) {
						max[k] = aCnt[i][k];
				}
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < max[i]; k++) {
				answer *= a[i];
			}
		}
		}
		System.out.println(answer);
	}

}
