package week1;

import java.util.Scanner;

public class eiuSnail {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	/*
	 đếm ngày ốc trèo lên tới đỉnh, leo A (ban ngày), tuột B(ban đêm)
	 */

	public static void main(String[] args) {
		long a = sc.nextLong();
		long b = sc.nextLong();
		long v = sc.nextLong();
		long day = 0;
		day=(long) Math.ceil((double)(v-b)/(a-b));
		System.out.println(day);


	}

	public static int[] inPut(int m) {
		int[] a = new int[m];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}

}
