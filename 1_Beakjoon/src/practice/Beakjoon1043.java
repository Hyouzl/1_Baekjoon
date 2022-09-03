package practice;

import java.util.*;


public class Beakjoon1043 {

	public static void main(String[] args) {
	
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("사람 수 : ");
		int n = scan.nextInt();
		System.out.print("파티 수 : ");
		int m = scan.nextInt();
		
		System.out.print("진실을 알고 있는 사람의 수 : ");
		int knowCnt = scan.nextInt();
		System.out.print("그 사람들의 번호");
		int knowNum[] = new int[knowCnt];
		for (int i = 0; i < knowCnt; i++) {
			knowNum[i] = ran.nextInt(n) + 1;
		}
		
		for (int i = 0; i < m; i++) {
			int attendNum = ran.nextInt(n) + 1;
			System.out.print(attendNum + " ");
			for (int j = 0; j < attendNum; j ++) {
				int num = ran.nextInt(n) + 1;
				System.out.print(num + " ");
			}
 
		}
		
		
			
	}
	

	

}
