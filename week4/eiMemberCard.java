package week4;

import java.util.Scanner;

public class eiMemberCard {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính giảm giá dựa trên membercard
	 */

	public static void main(String[] args) {
		long[] amount = { 0, 1_000_000, 20_000_000, 50_000_000, 200_000_000, 5000000000L };
		double[] rates = { 0, 0.02, 0.03, 0.05, 0.07 };
		int n = sc.nextInt();
		long temp = 0;
		double rate2 = 0;
		for (int i = 0; i < n; i++) {
			long price = sc.nextLong();
			double discount = 0;
			temp += price;
			discount = price * rate2;
			for (int j = 0; j < rates.length; j++) {
				if (temp >= amount[j]) {
					rate2 = rates[j];
				}
			}
			sb.append(discount).append(" ");
		}
		System.out.print(sb);
	}
}
