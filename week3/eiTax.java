package week3;

import java.util.Scanner;

public class eiTax {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * thuế thu nhập cá nhân
	 */

	public static void main(String[] args) {
		long n = sc.nextLong();
		long[] level = { 0, 5_000_000, 10_000_000, 18_000_000, 32_000_000, 52_000_000, 80_000_000, Long.MAX_VALUE };
		double[] tax = { 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };
		double pay = 0;
		n -= 9_000_000;
		for (int i = 0; i < level.length - 1; i++) {
			if (n > level[i]) {
				double lengthTax = Math.min(n - level[i], level[i + 1] - level[i]);
				pay += lengthTax * tax[i];
			}

		}
		System.out.println(Math.round(pay));

	}
}
