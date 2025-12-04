package week5;

import java.util.Scanner;

//tính tiền mỗi tháng
public class eiBankLoan3 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		double amount = sc.nextDouble();
		long payment = sc.nextLong();
		long numOfMonth = sc.nextLong();
		double rate = sc.nextDouble();
		rate = (rate / 100) / 12;
		double fine = sc.nextDouble();
		fine /= 100;
		double mustPay = amount / numOfMonth;
		double monthlyPay = mustPay;
		double interest = 0, excessPay = 0, prepay = 0, totalPay = 0;
		for (int i = 1; i <= numOfMonth && amount > 0; i++) {
			interest = amount * rate;
			totalPay = monthlyPay + interest;
			excessPay = payment - totalPay;
			prepay = excessPay / (fine + 1);
			amount -= (monthlyPay + prepay);
			if (amount < 0)
				amount = 0;
			sb.append(i).append(" " + Math.round(amount)).append("\n");
			monthlyPay = Math.max(mustPay - prepay, 0);

		}
		System.out.println(sb);
	}
}
