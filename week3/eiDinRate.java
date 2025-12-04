package week3;

import java.util.Scanner;

public class eiDinRate {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính số năm để gom được m số tiền
	 */

	public static void main(String[] args) {
		long n = sc.nextLong();
		while (n > 0) {
			double d = sc.nextDouble();
			double r = sc.nextDouble();
			double m = sc.nextDouble();
			long count = 0;
			while (d < m) {
				d += d * (r / 100);
				count++;
			}
			sb.append(count).append("\n");
			n--;
		}

		System.out.println(sb);

	}
}
