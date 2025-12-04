package week3;

import java.util.Scanner;

public class eiuMarkup {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính cost
	 */

	public static void main(String[] args) {
		long products = sc.nextLong();
		int costs = 200;
		long pay = 0;
		while (products > 0 && costs >= 180) {
			long minus = Math.min(100, products);
			pay += minus * costs;
			costs--;
			products -= minus;
		}
		if (products > 0)
			pay += products * 180;
		System.out.println(pay);
	}
}
