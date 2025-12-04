package week4;

import java.util.Scanner;

public class eiuSales {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính thưởng doanh số
	 */

	public static void main(String[] args) {
		long[] amount = { 0, 20, 50, 200,500,2000,Long.MAX_VALUE };
		double[] rates = {0.02,0.03,0.04,0.05,0.06,0.07 };
		long n = sc.nextLong();
		double bonus = 0;
		for (int i = 0; i < amount.length - 1; i++) {
			if (n > amount[i]) {
				double lengthBonus = Math.min(n - amount[i], amount[i + 1] - amount[i]);
				bonus += lengthBonus * rates[i];
			}
		}
		System.out.printf("%.2f",bonus);
	}
}
