package week3;

import java.util.Scanner;

public class eiBankRate {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính gốc + lãi sau M tháng, gửi N tiền
	 */

	public static void main(String[] args) {
		long n = sc.nextLong();
		long m = sc.nextLong();
		double lai = 0.09/12;
		double recieve = 0;
		recieve = n+(m*lai*n);
		System.out.println(recieve);
	}
}
