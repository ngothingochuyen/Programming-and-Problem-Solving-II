package week5;

import java.util.Scanner;

public class eiuCredit {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính số tiền còn lại
	 */

	public static void main(String[] args) {
		long numberOfTransaction = sc.nextLong();
		double rate = sc.nextDouble();
		int numOfDay = sc.nextInt();
		long[] transactionPerDay = new long[numOfDay + 1];
		for (int i = 0; i < numberOfTransaction; i++) {
			int day = sc.nextInt();
			transactionPerDay[day] += sc.nextLong();
		}
		double debtByDay = 0;
		double balance = 0;
		for (int i = 1; i <= numOfDay; i++) { //đến cuối chu kì
			if (i % 30 == 1 && i > 30) {
				balance += debtByDay / 30 * rate;
				debtByDay = 0;
			}
			balance += transactionPerDay[i];
			if (balance < 0) {
				debtByDay += balance;
			}
		}
		System.out.println(balance);

	}

}
