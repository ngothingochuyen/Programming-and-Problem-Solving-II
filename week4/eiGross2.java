package week4;

import java.util.Scanner;

public class eiGross2 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	// tính tiền trước thuế 2
	public static void main(String[] args) {
		long n = sc.nextLong();
//		double left = n;
//		double right = Long.MAX_VALUE; 
		double mid = 0;
//		double ans=0;
//		while (left + 0.01 < right) {
//			mid = (left + right) / 2;
//			ans=findNet(mid);
//			if (ans > n)
//				right = mid;
//			else if (ans < n)
//				left = mid;
//		}
//		System.out.println(Math.round(mid));
		mid = findGross2(n);
		System.out.println(Math.round(mid));

	}

	public static double findNet(double mid) {
		long[] level = { 0, 5_000_000, 10_000_000, 18_000_000, 32_000_000, 52_000_000, 80_000_000, Long.MAX_VALUE };
		double[] tax = { 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };
		double pay = 0;
		double temp = mid;
		temp -= 11_000_000;
		for (int i = 0; i < level.length - 1; i++) {
			if (temp > level[i]) {
				double lengthTax = Math.min(temp - level[i], level[i + 1] - level[i]);
				pay += lengthTax * tax[i];
			}
		}
		return mid - pay;
	}

	public static double findGross2(long n) {
		long[] level = { 0, 5_000_000, 10_000_000, 18_000_000, 32_000_000, 52_000_000, 80_000_000, Long.MAX_VALUE };
		double[] tax = { 0.05, 0.1, 0.15, 0.2, 0.25, 0.3, 0.35 };
		double net = n - 11_000_000;
		for (int i = 0; i < level.length; i++) {
			if (net > level[i])
				net += Math.min((net - level[i]) / (1 - tax[i]), level[i + 1] - level[i]) * tax[i];
		}
		return net + 11_000_000;
	}

}
