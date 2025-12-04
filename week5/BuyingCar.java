package week5;

import java.util.Scanner;

public class BuyingCar {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính số tháng cần để có thể đổi xe mới
	 */

	public static void main(String[] args) {
		double oldCarPrice = sc.nextDouble();
		double newCarPrice = sc.nextDouble();
		double downPaymentPercentage = sc.nextDouble();
		downPaymentPercentage /= 100;
		long months = sc.nextLong();
		double interestRate = sc.nextDouble();
		interestRate = interestRate / 12 / 100;
		double depreciationRate = sc.nextDouble();
		depreciationRate /= 100;
		double balance = oldCarPrice - (oldCarPrice * 10 / 100);
		double debt = oldCarPrice - (oldCarPrice * downPaymentPercentage);
		double newCarPrepay = newCarPrice * downPaymentPercentage;
		double monthlyPayment = findMonthlyPayment(oldCarPrice, downPaymentPercentage, months, interestRate);
		for (int i = 1; i <= months; i++) {
			debt -= monthlyPayment - (debt * interestRate);
			balance -= balance * depreciationRate;
			if (balance >= (newCarPrepay + debt)) {
				System.out.println(i + " " + 0);
				break;
			}
		}
		if (balance < newCarPrepay)
			System.out.println(months + " " + (newCarPrepay - balance));

	}

	public static double findMonthlyPayment(double oldCarPrice, double downPaymentPercentage, long months,
			double interestRate) {
		double prePay = oldCarPrice * downPaymentPercentage;
		double remain = oldCarPrice - prePay;
		double monthlyPay = remain * Math.pow(interestRate + 1, months) * ((interestRate + 1) - 1)
				/ (Math.pow(interestRate + 1, months) - 1);
		return monthlyPay;
	}
}
