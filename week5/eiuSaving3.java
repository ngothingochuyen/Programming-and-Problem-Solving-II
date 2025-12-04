package week5;

import java.util.Scanner;

public class eiuSaving3 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính số tiền cần gửi mỗi tháng để được amount sau m tháng
	 */

	public static void main(String[] args) {
		double amount = sc.nextDouble();
		int m = sc.nextInt();
		double left = 0;
		double right = amount;
		double a = 0;
		while (left + 0.00001 < right) {
			a = (left + right) / 2;
			double recieve = 0;
			for (int i = m; i > 0; i--) {
				recieve += calculateRecieve(a, i);
			}
			if (recieve > amount)
				right = a;
			else
				left = a;
		}
		System.out.printf("%.4f", a);

	}

	public static double calculateRecieve(double n, int m) {
		double[] rates = { 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664,
				0.0692 };
		long year = m / 12;
		int month = m % 12;
		double recieve = n;
		if (year > 0)
			recieve *= Math.pow(1 + rates[11], year);
		if (month > 0)
			recieve *= (1 + rates[(month - 1)] / 12 * month);
		return recieve;
	}
}
