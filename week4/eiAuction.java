package week4;

import java.util.Scanner;

public class eiAuction {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	// tim so duy nhat lon nhat
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] outcome = new int[n];
		int[] numOfOutcome = new int[7];
		for (int i = 0; i < outcome.length; i++) {
			outcome[i] = sc.nextInt();
			numOfOutcome[outcome[i]]++;
		}
		int ans = 0;
		for (int i = 6; i > 0; i--) {
			if (numOfOutcome[i] == 1) {
				ans = i;
				break;
			}
		}
		if (ans != 0) {
			for (int i = 0; i < n; i++) {
				if (ans == outcome[i]) 
					System.out.println(i+1);
			}
		} else
			System.out.println("none");

	}
}
