package week2;

import java.util.Scanner;

public class eiuCubes2 {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 * có k loại gạch tính xem mỗi loại xây được bao nhiêu tầng, tầng 1 =1, 2=1+2,
	 * n=1+2+..+n
	 */

	public static void main(String[] args) {
		long k = sc.nextLong();
		for (long i= 1; i <= k; i++) {
			long n = sc.nextLong();
			sb.append(countLayers(n) + " ");
		}
		System.out.print(sb);
	}

	public static long countLayers(long n) {
		long layers = (long) Math.cbrt((n * 6));
		long total = (layers * (layers + 1) * (layers + 2)) / 6;
		if (total > n)
			layers--;
		return layers;
	}
}
