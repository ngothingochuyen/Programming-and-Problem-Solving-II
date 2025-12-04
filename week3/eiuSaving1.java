package week3;

import java.util.Scanner;

public class eiuSaving1 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính gốc + lãi sau M tháng, gửi N tiền
	 */

	public static void main(String[] args) {
		long n = sc.nextLong();
		int m = sc.nextInt();
		double[] rates = { 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664,
				0.0692 };
		long year = m / 12;
		int month = m % 12;
		double recieve = n;
		if (year > 0)
			recieve = n * Math.pow(1 + rates[11], year);
		if (month > 0)
			recieve = recieve * (1 + rates[(month - 1)] / 12 * month);
		System.out.println(Math.round(recieve));
	}
}
