package week5;

import java.util.Scanner;

public class eiPurchase {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

//tính  lãi trả góp mỗi tháng
	public static void main(String[] args) {
		long v = sc.nextLong();
		int t = sc.nextInt();
		long n = sc.nextLong();
		long m = sc.nextLong();
		double r = 0;

		// cach thuong
//		for (; r < 0.1; r += 1E-7) {
//			double debt = (v - n) * Math.pow(1 + r, t) - m * (Math.pow(1 + r, t) - 1) / ((1 + r) - 1);
//			if (debt >= 0) {
//				System.out.printf("%8f",r);
//				break;
//			}
//		}

		// binary search
		double low = 0;
		double high = 1;
		while (low + 1E-13 < high) {
			r = (low + high) / 2;
			double debt = (v - n) * Math.pow(1 + r, t) - m * (Math.pow(1 + r, t) - 1) / ((1 + r) - 1);
			if (debt > 0)
				high = r;
			else
				low = r;
		}
		System.out.printf("%8f", r);

	}
}
