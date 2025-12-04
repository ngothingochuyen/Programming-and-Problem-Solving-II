package week5;

import java.util.Scanner;

public class PassBook {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính xem ttk với vay ngân hàng, nào nhiều hơn
	 */

	public static void main(String[] args) {
		long amount = sc.nextLong();
		int term = sc.nextInt();
		int month = sc.nextInt();
		double rate1 = sc.nextDouble() / 100;
		double rate2 = sc.nextDouble() / 100;
		double receive = amount + (amount * rate1 / 12 * term);
		term -= month;
		double left = 0;
		double right = receive;
		double mid = 0;
		int count = 0;
		while (left + 1.0 < right) {
			mid = (left + right) / 2;
			double option2 = findOption2(term, mid, rate2);
			if (option2 > receive) {
				right = mid;
			} else
				left = mid;
			if (count > 49)
				break;
			count++;
		}
		if (mid > amount) {
			System.out.println(Math.round(mid));
		} else
			System.out.println(amount);

	}

	public static double findOption2(int term, double mid, double rate2) {
		int year = term / 12;
		int month = term % 12;
		if (year > 0) {
			mid *= Math.pow(1 + rate2, year);
		}
		if (month > 0) {
			mid *= 1 + rate2 / 12 * month;
		}
		return mid;
	}
}
