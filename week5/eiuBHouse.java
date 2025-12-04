package week5;

import java.util.Scanner;

public class eiuBHouse {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	// tính tiền phải trả mỗi tháng trong K tháng
	public static void main(String[] args) {
		double amount = sc.nextDouble();
		double prepay = sc.nextDouble();
		int month = sc.nextInt();
		double rate = sc.nextDouble();
		double remainDebt = amount - prepay;
		double monthlyDebt = remainDebt / month;
		rate /= 100;
		for (int i = 1; i <= month; i++) {
			double interest = remainDebt * rate;
			double pay = monthlyDebt + interest;
			remainDebt -= monthlyDebt;
			sb.append(i + " " + Math.round(pay)).append("\n");
		}
		System.out.println(sb);
	}
}
