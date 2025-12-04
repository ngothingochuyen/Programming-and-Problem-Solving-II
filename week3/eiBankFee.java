package week3;

import java.util.Scanner;

public class eiBankFee {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính phí ngân hàng
	 */

	public static void main(String[] args) {
		int [] total = { 5000, 2000, 500, 0 };
		double[] fee = { 0, 5, 7.5, 12 };
		double[] feeCheck = { 0, 0.1, 0.2, 0.2 };
		double money = sc.nextDouble();
		int sec = sc.nextInt();
		double pay = 0;
		for (int i = 0; i < total.length; i++) {
			if (money >= total[i]) {
				pay = fee[i] + (sec * feeCheck[i]);
				break;
			}
		}
		System.out.println(pay);
	}
}
