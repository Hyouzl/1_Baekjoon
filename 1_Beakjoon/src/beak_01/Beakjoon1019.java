package beak_01;

import java.io.*;
import java.util.*;

public class Beakjoon1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0; 
		try {
			num = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		int[] cnt = new int[10];
		

		for (int i = 1; i <= num; i++) {
			
			
		}
		
		
		
		for (int i = 0; i < 10; i++) {
			System.out.print(cnt[i] + " ");
		}
	}
}

