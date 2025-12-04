package week4;

import java.util.Scanner;

public class eiuChrms {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	// tính income cua cua hang
	public static void main(String[] args) {
		long level[] = { 2_000_000, 5_000_000, 10_000_000, 20_000_000, 50_000_000, 100_000_000, 200_000_000,
				Long.MAX_VALUE };
		double rate[] = { 0.97, 0.96, 0.95, 0.94, 0.93, 0.92, 0.91, 0.90 };
		int n = sc.nextInt();
		double income = 0;
		for (int i = 1; i <= n; i++) {
			long bill = sc.nextLong();
			for (int j = 0; j < level.length; j++) {
				if (bill <= level[j]) {
					income += bill * rate[j];
					break;
				}
			}
		}
		System.out.println(Math.round(income));
	}
}
