package week4;

import java.util.Scanner;

public class eiDiscount3 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính giảm giá
	 */

	public static void main(String[] args) {
		long[] amount = { 0, 5000000, 20000000, 100000000, 300000000, 600000000, 900000000, 5000000000L };
		double[] rates = { 0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };
		long n = sc.nextLong();
		double discount = 0;
		double pay = 0;
		for (int i = 0; i < amount.length - 1; i++) {
			if (n > amount[i]) {
				double lengthDiscount = Math.min(n - amount[i], amount[i + 1] - amount[i]);
				discount += lengthDiscount * rates[i];
			}
		}
		pay = n - discount;
		for (int i = 0; i < 3; i++) {
			int isDiscount = sc.nextInt();
			if (isDiscount == 1)
				pay -= pay * 0.02;
		}
		System.out.println(Math.round(pay));
	}
}
