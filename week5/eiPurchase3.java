package week5;

import java.util.Scanner;

public class eiPurchase3 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

//tính  số tiền mỗi tháng cần phải trả
	

	public static void main(String[] args) {
		double amount = sc.nextDouble();
		double prepay = sc.nextDouble();
		long month = sc.nextLong();
		double rate = sc.nextDouble();
		double remain = amount - prepay;
		double monthlyDebt = remain * Math.pow(rate + 1, month) * ((rate + 1) - 1) / (Math.pow(rate + 1, month) - 1);
		System.out.println((long) Math.floor(monthlyDebt));

	}
}
