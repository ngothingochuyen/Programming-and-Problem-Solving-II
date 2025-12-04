package week2;

import java.util.Scanner;

public class eiDiscou {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính giảm giá
	 */

	public static void main(String[] args) {
		long[] amount = { 1000, 2000000, 10000000, 50000000, 100000000, 200000000, 500000000,5000000000L }; //5 tỉ là số over 50tr
		double[] rates = { 0, 0.03, 0.05, 0.07, 0.1, 0.12, 0.15 };
		long n = sc.nextLong();
		double discount = 0;
		double pay = 0;
		for (int i = 0; i < amount.length-1; i++) {
			if (n >= amount[i]) {
				double lengthDiscount = Math.min(n - amount[i], amount[i + 1] - amount[i]);
				// khoảng giảm giá là số nhỏ hơn giữa hiệu của tổng số tiền trừ cho amount vị
				// trí đang xét và hiệu giữa amount vị trí tiếp theo và amount vị trí đang xét
				discount += lengthDiscount * rates[i]; 
				//cộng dồn số tiền được giảm giá theo từng khoảng
			}
		}
		pay = n - discount;
		//lấy số tiền đầu trừ cho tổng số tiền đã được giảm giá
		System.out.println(Math.round(pay));
	}
}
