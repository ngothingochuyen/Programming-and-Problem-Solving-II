
package week5;

import java.util.Scanner;

public class eiuFf2 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính số tiền tiết kiệm để sài N tháng sau hưu
	 */

	public static void main(String[] args) {
		double returnRate = sc.nextDouble();
		returnRate /= 100;
		double inflationRate = sc.nextDouble();
		inflationRate /= 100;
		double monthlyWithraw = sc.nextDouble();
		long year = 10_000;
		double left = 0;
		double right = Long.MAX_VALUE;
		double mid = 0;
		while (left + 1e-1 < right) {
			mid = (left + right) / 2;
			double ans = findX(year, mid, returnRate, monthlyWithraw, inflationRate);
			if (ans < 0) {
				left = mid;
			} else
				right = mid;
		}
		System.out.println((long) Math.ceil(mid));
	}

	public static double findX(double year, double mid, double returnRate, double monthlyWithraw,
			double inflationRate) {
		for (int i = 1; i <= year; i++) {
			mid *= (1 + returnRate);
			mid -= monthlyWithraw;
			monthlyWithraw *= (1 + inflationRate);
			if (mid > 1e100)
				return mid;
		}
		return mid;
	}

}
