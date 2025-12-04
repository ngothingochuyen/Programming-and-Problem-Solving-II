
package week5;

import java.util.Scanner;

public class eiuFf {
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
		long month = sc.nextLong();
		double left = 0;
		double right = 1e10;
		double mid = 0;
		while (left + 1e-5 < right) {
			mid = (left + right) / 2;
			double ans = findX(month, mid, returnRate, monthlyWithraw, inflationRate);
			if (ans < 0) {
				left = mid;
			} else
				right = mid;
		}
		System.out.printf("%.4f", mid);
	}

	public static double findX(double month, double mid, double returnRate, double monthlyWithraw,
			double inflationRate) {
		for (int i = 1; i < month; i++) {
			mid *= (1 + returnRate);
			mid -= monthlyWithraw;
			monthlyWithraw *= (1 + inflationRate);
		}
		return mid;
	}

}
