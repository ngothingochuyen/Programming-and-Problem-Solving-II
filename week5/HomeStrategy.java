package week5;

import java.util.Scanner;

public class HomeStrategy {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính mỗi tháng trả bao nhiêu để đủ mua nhà
	 */

	public static void main(String[] args) {
		int months = sc.nextInt();
		long initialPrice = sc.nextLong();
		double rate = sc.nextDouble();
		double[] monthlyPriceRate = new double[8];
		double[] monthlySavingRate = new double[8];
		for (int i = 0; i < monthlyPriceRate.length; i++) {
			monthlyPriceRate[i] = sc.nextDouble();
		}
		for (int i = 0; i < monthlySavingRate.length; i++) {
			monthlySavingRate[i] = sc.nextDouble();
		}
		double left = 0;
		double right = 1E12;
		while (left + 0.000001 < right) {
			double monthlyPayment = (left + right) / 2;
			double debt = calculateDebt(months, initialPrice, rate, monthlyPriceRate, monthlySavingRate,
					monthlyPayment);
			if (debt > 0) {
				left = monthlyPayment;
			} else
				right = monthlyPayment;
		}
		System.out.println(Math.round(right));

	}

	public static double calculateDebt(long months, double initialPrice, double rate, double[] monthlyPriceRate,
			double[] monthlySavingRate, double monthlyPayment) {
		double saving = monthlyPayment;
		int i = 0;
		int j = 1;
		while (saving < initialPrice * 0.3) {
			saving += saving * monthlySavingRate[i];
			saving += monthlyPayment;
			initialPrice += initialPrice * monthlyPriceRate[i];
			if (j % 60 == 0)
				i++;
			j++;

		}
		double debt = initialPrice - saving;
		for (; j < months; j++) {
			debt += debt * rate;
			debt -= monthlyPayment;
		}
		return debt;
	}

}
