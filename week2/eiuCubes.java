package week2;

import java.util.Scanner;

public class eiuCubes {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * tính xem xây được bao nhiêu tầng, tầng 1 =1, 2=1+2, n=1+2+..+n
	 */

	public static void main(String[] args) {
		int n = sc.nextInt();
		long count = 0;
		long minus = 0;
		while (n > 0) {
			count++;
			minus += count;
			n -= minus;
		}
		if (n < 0)
			count--;
		System.out.println(count);
	}
}
