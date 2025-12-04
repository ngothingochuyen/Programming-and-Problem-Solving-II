package week2;

import java.util.Scanner;

public class eiuFing {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tìm xem con số cần tìm ở ngón nào của bàn tay nào
	 */

	public static void main(String[] args) {
		int n = sc.nextInt();
		String[] fingers = { "cai", "tro", "giua", "ap ut", "ut", "ut", "ap ut", "giua", "tro", "cai" };
		int count = 1;
		while (n > 10) {
			n -= 10;
			count++;
			while (n > 9) {
				n -= 9;
				count++;
			}
		}
		if (count > 1) {
			if (count % 2 == 0)
				n = 10 - n;
			else
				n++;
		}
		if (n <= 5)
			System.out.println("Ngon " + fingers[n - 1] + " cua ban tay trai");
		else
			System.out.println("Ngon " + fingers[n - 1] + " cua ban tay phai");

	}
}
