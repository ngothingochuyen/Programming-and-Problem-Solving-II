package week3;

import java.util.Scanner;

public class eiBankFee2 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính phí ngân hàng
	 */

	public static void main(String[] args) {
		int[] total = { 500, 2000, 5000, Integer.MAX_VALUE };
		double[] fee = { 12, 7.5, 5, 0 };
		double[] feeCheck = { 0.2, 0.2, 0.1, 0 };
		long n = sc.nextLong();
		double pay = 0;
		double payment = 0;
		long sumSec = 0;
		for (int i = 1; i <= n; i++) {
			double money = sc.nextDouble();
			long sec = sc.nextLong();
			for (int j = 0; j < total.length; j++) {
				if (money < total[j]) {
					pay = fee[j] + (sec * feeCheck[j]);
					break;
				}
			}
			payment += pay;
			sumSec+=sec;
		}
		payment/= sumSec;
		System.out.println(payment);
	}
}
