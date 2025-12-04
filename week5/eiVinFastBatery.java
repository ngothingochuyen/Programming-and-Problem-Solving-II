package week5;

import java.util.Scanner;

public class eiVinFastBatery {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính số tiền để vinfast cho mướn
	 */

	public static void main(String[] args) {
		long amount = sc.nextLong();
		long recalledPrice = sc.nextLong();
		long numOfMonths = sc.nextLong();
		double rate = sc.nextDouble();
		rate /= 100;
		double rentalPrice = ((amount * Math.pow(rate + 1, numOfMonths)) - recalledPrice) * rate
				/ (Math.pow(rate + 1, numOfMonths) - 1);
		System.out.println(Math.round(rentalPrice));
	}
}
