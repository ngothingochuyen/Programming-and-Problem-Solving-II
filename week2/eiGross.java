package week2;

import java.util.Scanner;

public class eiGross {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính thuế mà công ty trả
	 */

	public static void main(String[] args) {
		long n = sc.nextLong();
		double tax = 0;
		for(int i =1;i<=n;i++) {
			double salary = sc.nextDouble();
			tax=salary/9;
			sb.append(tax).append("\n");
		}
		System.out.println(sb);
	}
}
