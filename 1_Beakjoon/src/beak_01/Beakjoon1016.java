package beak_01;
import java.util.*;


public class Beakjoon1016 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int min = scan.nextInt();
		int max = scan.nextInt();
		int get = 0;
		int cnt = 0;
	
		for (int i = min; i <= max; i++) {
			for (int j = 2 ; j * j <= i; j++) {
				int dbNum = j * j;
				if (i % dbNum == 0) {
					get = 1;
					break;
				}
			}
			if (get == 0) {
				cnt++;
			}
		}
		
			
		System.out.println(cnt);
		
		
		scan.close();
	}

}
